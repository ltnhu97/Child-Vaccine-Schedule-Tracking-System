package ut.edu.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.projectdemo.entity.ChildProfile;

public interface ChildProfileRepository extends JpaRepository<ChildProfile, Long> {
}