package ut.edu.demoproject.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.demoproject.Model.VaccinationLogBook;
import ut.edu.demoproject.Repositories.VaccinationLogBookRepository;
import java.util.List;

@Service
public class VaccinationLogBookService {
    @Autowired
    private VaccinationLogBookRepository vaccinationLogBookRepository;
    public List<VaccinationLogBook> findAll() {return vaccinationLogBookRepository.findAll();}

    public VaccinationLogBook CreateVaccinationLogBook(VaccinationLogBook vaccinationLogBook) {
        return vaccinationLogBookRepository.save(vaccinationLogBook);
    }

    public VaccinationLogBook UpdateVaccinationLogBook(VaccinationLogBook vaccinationLogBook) {
        return vaccinationLogBookRepository.save(vaccinationLogBook);
    }
}
