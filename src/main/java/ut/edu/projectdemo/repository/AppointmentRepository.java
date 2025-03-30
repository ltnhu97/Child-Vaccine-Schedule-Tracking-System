package ut.edu.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.projectdemo.entity.Appointments;

public interface AppointmentRepository extends JpaRepository<Appointments, Long> {
}

