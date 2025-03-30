package ut.edu.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.projectdemo.entity.ServicePackages;

public interface ServicePackageRepository extends JpaRepository<ServicePackages, Long> {
}
