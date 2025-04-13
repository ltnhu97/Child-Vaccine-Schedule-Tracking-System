package ut.edu.demoproject.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.demoproject.Model.Customer;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByFullName(String FullName);

}
