package ut.edu.demoproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ut.edu.demoproject.Model.VaccinationLogBook;
import ut.edu.demoproject.Repositories.VaccinationLogBookRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/vaccinationLogBook")
public class VaccinationLogBookController {
    @Autowired
    private VaccinationLogBookRepository vaccinationLogBookRepository;

    // Lay tat ca ban ghi tiem chung 
    @GetMapping
    public List<VaccinationLogBook> getAllVaccinationLogBook() {
        return vaccinationLogBookRepository.findAll();
    }

    // Lay ban ghi tiem chung theo id
    @GetMapping("/{id}")
    public ResponseEntity<VaccinationLogBook> getVaccinationLogBookById(@PathVariable Long id) {
        Optional<VaccinationLogBook> vaccinationLogBook = vaccinationLogBookRepository.findById(id);
        return vaccinationLogBook.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Them moi ban ghi tiem chung
    @PostMapping
    public VaccinationLogBook createVaccinationLogBook(@RequestBody VaccinationLogBook vaccinationLogBook) {
        return vaccinationLogBookRepository.save(vaccinationLogBook);
    }

    // Cap nhat ban ghi tiem chung
    @PutMapping("/{id}")
    public ResponseEntity<VaccinationLogBook> updateVaccinationLogBook(@PathVariable Long id, @RequestBody VaccinationLogBook vaccinationLogBook) {
        Optional<VaccinationLogBook> existingVaccinationLogBook = vaccinationLogBookRepository.findById(id);
        if (existingVaccinationLogBook.isPresent()) {
            VaccinationLogBook updatedVaccinationLogBook = existingVaccinationLogBook.get();
            updatedVaccinationLogBook.setUseVaccine(vaccinationLogBook.getUseVaccine());
            updatedVaccinationLogBook.setVaccinationDate(vaccinationLogBook.getVaccinationDate());
            updatedVaccinationLogBook.setNotes(vaccinationLogBook.getNotes());
            VaccinationLogBook savedVaccinationLogBook = vaccinationLogBookRepository.save(updatedVaccinationLogBook);
            return ResponseEntity.ok(savedVaccinationLogBook);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Xoa ban ghi tiem chung
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVaccinationLogBook(@PathVariable Long id) {
        if (vaccinationLogBookRepository.existsById(id)) {
            vaccinationLogBookRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
