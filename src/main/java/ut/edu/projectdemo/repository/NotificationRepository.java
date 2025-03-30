package ut.edu.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.projectdemo.entity.Notifications;

public interface NotificationRepository extends JpaRepository<Notifications, Long> {
}
