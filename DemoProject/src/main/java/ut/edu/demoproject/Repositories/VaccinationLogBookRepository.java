package ut.edu.demoproject.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.demoproject.Model.VaccinationLogBook;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccinationLogBookRepository extends JpaRepository<VaccinationLogBook, Long> {
    List<VaccinationLogBook> findAll();
}
