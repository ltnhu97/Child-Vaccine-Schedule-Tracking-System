package ut.edu.childvaccinescheduletrackingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository<Customer> extends JpaRepository<Customer, Long> {
    List<Customer> findByName(String name);

    Customer findByEmail(String email);

    Customer findByPhone(String phone);
}
