package ut.edu.projectdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.projectdemo.entity.*;
import ut.edu.projectdemo.repository.*;
import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notifications> getAllNotifications() {
        return notificationRepository.findAll();
    }
    public Optional<Notifications> getNotificationById(Long id) {
        return notificationRepository.findById(id);
    }
    public Notifications saveNotification(Notifications notification) {
        return notificationRepository.save(notification);
    }
    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
