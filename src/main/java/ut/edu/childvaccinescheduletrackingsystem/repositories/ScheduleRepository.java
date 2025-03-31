package ut.edu.childvaccinescheduletrackingsystem.repositories;


import ut.edu.childvaccinescheduletrackingsystem.models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}