package ut.edu.projectdemo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.projectdemo.entity.*;
import ut.edu.projectdemo.repository.*;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
