package ut.edu.demoproject.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.demoproject.Model.DV;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public interface DVRepository extends JpaRepository<DV,Long> {
    Optional<DV> findByServiceName(String serviceName);
}
