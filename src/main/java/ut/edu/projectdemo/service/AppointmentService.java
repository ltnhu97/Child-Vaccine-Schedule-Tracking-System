package ut.edu.projectdemo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.projectdemo.entity.*;
import ut.edu.projectdemo.repository.*;
import java.util.List;
import java.util.Optional;
@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointments> getAllAppointments() {
        return appointmentRepository.findAll();
    }
    public Optional<Appointments> getAppointmentById(Long id) {
        return appointmentRepository.findById(id);
    }
    public Appointments saveAppointment(Appointments appointment) {
        return appointmentRepository.save(appointment);
    }
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}
