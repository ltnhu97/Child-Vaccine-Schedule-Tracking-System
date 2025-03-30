package ut.edu.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.projectdemo.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
