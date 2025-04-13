package ut.edu.demoproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ut.edu.demoproject.Model.DV;
import ut.edu.demoproject.Repositories.DVRepository;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/DV")
public class DVController {
    @Autowired
    private DVRepository DVRepository;

    // Lay tat ca dich vu: 
    @GetMapping
    public List<DV> getAllDV() {
        return DVRepository.findAll();
    }

    // Tao moi dich vu
    @PostMapping
    public DV createDV(@RequestBody DV DV) {
        return DVRepository.save(DV);
    }

    // Lay dich vu theo id
    @GetMapping("/{id}")
    public Optional<DV> getDVById(@PathVariable Long id) {
        return DVRepository.findById(id);
    }

    // Cap nhat dich vu
    @PutMapping("/{id}")
    public DV updateDV(@PathVariable Long id, @RequestBody DV updatedDV) {
        Optional<DV> existingDV = DVRepository.findById(id);
        if (existingDV.isPresent()) {
            DV dv = existingDV.get();
            dv.setServiceName(updatedDV.getServiceName());
            dv.setDescription(updatedDV.getDescription());
            dv.setPrice(updatedDV.getPrice());
            return DVRepository.save(dv);
        } else {
            return null;
        }
    }

    // Xoa dich vu 
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDV(@PathVariable Long id) {
        if (DVRepository.existsById(id)) {
            DVRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
