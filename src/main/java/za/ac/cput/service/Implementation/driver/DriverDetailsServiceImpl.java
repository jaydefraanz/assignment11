package za.ac.cput.service.Implementation.driver;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.driver.DriverDetails;
import za.ac.cput.service.driver.DriverDetailsService;
import za.ac.cput.repositories.driverRepository.DriverDetailsRepository;
import za.ac.cput.repositories.implimentation.driverRepositoryImpl.DriverDetailsRepositoryImpl;

import java.util.Set;

@Service("DriverDetailsServiceImpl")
public class DriverDetailsServiceImpl  implements DriverDetailsService {

    private static DriverDetailsServiceImpl service = null;
    private DriverDetailsRepository repository;

    private DriverDetailsServiceImpl(){this.repository = DriverDetailsRepositoryImpl.getRepository(); }

    private static DriverDetailsServiceImpl getService()
    {
        if(service == null) service = new DriverDetailsServiceImpl();
        return service;
    }

    @Override
    public Set<DriverDetails> getAll() {
        return repository.getAll();
    }

    public DriverDetails create(DriverDetails driverDetails) {
        return repository.create(driverDetails);
    }

    public DriverDetails update(DriverDetails driverDetails) {
        return repository.update(driverDetails);
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DriverDetails read(String s) {
        return null;
    }


}
