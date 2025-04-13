package ut.edu.demoproject.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.demoproject.Model.DV;
import ut.edu.demoproject.Repositories.DVRepository;
import java.util.List;
@Service
public class DVService {
    @Autowired
    private DVRepository dvRepository;
    public List<DV> findAll() {return dvRepository.findAll();}
    public DV save(DV dv) {return dvRepository.save(dv);};
    public void delete(DV dv) {dvRepository.delete(dv);};
    public DV update(DV dv) {return dvRepository.save(dv);};
}
