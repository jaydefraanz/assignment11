package za.ac.cput.service.Implementation.driver;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.driver.AssignedBus;
import za.ac.cput.service.driver.AssignedBusService;
import za.ac.cput.repositories.driverRepository.AssignedBusRepository;
import za.ac.cput.repositories.implimentation.driverRepositoryImpl.AssignedBusRepositoryImpl;

import java.util.Set;

@Service("AssignedBusServiceImpl")
public class AssignedBusServiceImpl implements AssignedBusService {

    private static AssignedBusServiceImpl service = null;
    private AssignedBusRepository repository;

    private AssignedBusServiceImpl(){this.repository = AssignedBusRepositoryImpl.getRepository(); }

    private static AssignedBusServiceImpl getService()
    {
        if(service == null) service = new AssignedBusServiceImpl();
        return service;
    }

    @Override
    public Set<AssignedBus> getAll() {
        return repository.getAll();
    }

    @Override
    public AssignedBus create(AssignedBus assignedBus) {
        return repository.create(assignedBus);
    }

    @Override
    public AssignedBus update(AssignedBus assignedBus) {
        return repository.update(assignedBus);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public AssignedBus read(String s) {
        return repository.read(s);
    }
}
