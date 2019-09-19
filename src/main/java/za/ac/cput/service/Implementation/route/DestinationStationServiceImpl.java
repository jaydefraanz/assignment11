package za.ac.cput.service.Implementation.route;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.route.DestinationStation;
import za.ac.cput.repositories.implimentation.routeRepositoryImpl.DestinationStationRepositoryImpl;
import za.ac.cput.repositories.routeRepository.DestinationStationRepository;
import za.ac.cput.service.route.DestinationStationService;

import java.util.Set;

@Service("DestinationStationServiceImpl")
public class DestinationStationServiceImpl implements DestinationStationService {

    private static DestinationStationServiceImpl service = null;
    private DestinationStationRepository repository;

    private DestinationStationServiceImpl()
    {
        this.repository = DestinationStationRepositoryImpl.getRepository();
    }

    private static DestinationStationServiceImpl getService()
    {
        if(service == null) service = new DestinationStationServiceImpl();
        return service;
    }

    @Override
    public Set<DestinationStation> getAll() {
        return repository.getAll();
    }

    @Override
    public DestinationStation create(DestinationStation destinationStation) {
        return repository.create(destinationStation);
    }

    @Override
    public DestinationStation update(DestinationStation destinationStation) {
        return repository.update(destinationStation);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public DestinationStation read(String s) {
        return repository.read(s);
    }
}
