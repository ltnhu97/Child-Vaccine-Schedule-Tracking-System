package ut.edu.projectdemo.service;

import ut.edu.projectdemo.entity.VaccinationSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.projectdemo.entity.*;
import ut.edu.projectdemo.repository.*;
import java.util.List;
import java.util.Optional;

@Service
public class VaccineService {
    private final VaccineRepository vaccineRepository;

    public VaccineService(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }
    public List<VaccinationSchedule> getAllVaccines() {
        return vaccineRepository.findAll();
    }
    public Optional<VaccinationSchedule> getVaccineById(Long id) {
        return vaccineRepository.findById(id);
    }
    public VaccinationSchedule saveVaccine(VaccinationSchedule vaccine) {
        return vaccineRepository.save(vaccine);
    }
    public void deleteVaccine(Long id) {
        vaccineRepository.deleteById(id);
    }
}
