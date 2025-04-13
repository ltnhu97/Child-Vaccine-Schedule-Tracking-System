package ut.edu.demoproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ut.edu.demoproject.Model.Customer;
import ut.edu.demoproject.Repositories.CustomerRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    // Lay ta ca khach hang
    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    // Tao moi khach hang
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    // Lay khang hang theo id
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Cap nhat khach hang
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer updatedCustomer) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customer.setFullName(updatedCustomer.getFullName());
                    customer.setPhoneNumber(updatedCustomer.getPhoneNumber());
                    customer.setEmail(updatedCustomer.getEmail());
                    customer.setDateOfBirth(updatedCustomer.getDateOfBirth());
                    Customer savedCustomer = customerRepository.save(customer);
                    return ResponseEntity.ok(savedCustomer);
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Xoa khach hang
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
