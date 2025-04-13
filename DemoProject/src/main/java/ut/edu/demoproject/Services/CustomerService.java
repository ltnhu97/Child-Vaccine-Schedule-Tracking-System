package ut.edu.demoproject.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.demoproject.Model.Customer;
import ut.edu.demoproject.Repositories.CustomerRepository;

import java.util.Optional;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Optional<Customer> findByFullName(String fullName) {
        return customerRepository.findByFullName(fullName);
    }

    public Optional<Customer> save (Customer customer) {
        return Optional.of(customerRepository.save(customer));
    }

    public boolean detele (Long id) {
        customerRepository.deleteById(id);
        return true;
    }

    public Optional<Customer> update(Customer customer) {
        if (customerRepository.existsById(customer.getId())) {
            return Optional.of(customerRepository.save(customer));
        }
        return Optional.empty();
    }
}
