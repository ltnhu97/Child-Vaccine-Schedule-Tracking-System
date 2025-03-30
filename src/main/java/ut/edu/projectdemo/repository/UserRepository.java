package ut.edu.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.projectdemo.entity.*;

public interface UserRepository extends JpaRepository<User, Long> {
}
