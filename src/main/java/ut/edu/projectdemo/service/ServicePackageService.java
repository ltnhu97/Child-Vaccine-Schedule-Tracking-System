package ut.edu.projectdemo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.projectdemo.entity.*;
import ut.edu.projectdemo.repository.*;
import java.util.List;
import java.util.Optional;

@Service
public class ServicePackageService {
    private final ServicePackageRepository servicePackageRepository;

    public ServicePackageService(ServicePackageRepository servicePackageRepository) {
        this.servicePackageRepository = servicePackageRepository;
    }

    public List<ServicePackages> getAllServicePackages() {
        return servicePackageRepository.findAll();
    }
    public Optional<ServicePackages> getServicePackageById(Long id) {
        return servicePackageRepository.findById(id);
    }
    public ServicePackages saveServicePackage(ServicePackages servicePackage) {
        return servicePackageRepository.save(servicePackage);
    }
    public void deleteServicePackage(Long id) {
        servicePackageRepository.deleteById(id);
    }
}
