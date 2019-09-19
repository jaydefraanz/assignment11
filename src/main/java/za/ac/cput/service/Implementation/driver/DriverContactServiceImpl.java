package za.ac.cput.service.Implementation.driver;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.driver.DriverContact;
import za.ac.cput.service.driver.DriverContactService;
import za.ac.cput.repositories.driverRepository.DriverContactRepository;
import za.ac.cput.repositories.implimentation.driverRepositoryImpl.DriverContactRepositoryImpl;

import java.util.Set;

@Service("DriverContactServiceImpl")
public class DriverContactServiceImpl implements DriverContactService {

    private static DriverContactServiceImpl service = null;
    private DriverContactRepository repository;

    private DriverContactServiceImpl(){this.repository = DriverContactRepositoryImpl.getRepository();}

    private static DriverContactServiceImpl getService()
    {
        if(service == null) service = new DriverContactServiceImpl();
        return service;
    }

    @Override
    public Set<DriverContact> getAll() {
        return repository.getAll();
    }

    @Override
    public DriverContact create(DriverContact driverContact) {
        return repository.create(driverContact);
    }

    @Override
    public DriverContact update(DriverContact driverContact) {
        return repository.update(driverContact);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public DriverContact read(String s) {
        return repository.read(s);
    }
}
