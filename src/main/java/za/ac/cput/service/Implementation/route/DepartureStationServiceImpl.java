package za.ac.cput.service.Implementation.route;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.route.DepartureStation;
import za.ac.cput.service.route.DepartureStationService;
import za.ac.cput.repositories.routeRepository.DepartureStationRepository;
import za.ac.cput.repositories.implimentation.routeRepositoryImpl.DepartureStationRepositoryImpl;

import java.util.Set;

@Service("DepartureStationServiceImpl")
public class DepartureStationServiceImpl implements DepartureStationService {

    private static DepartureStationServiceImpl service = null;
    private DepartureStationRepository repository;

    private DepartureStationServiceImpl()
    {
        this.repository = DepartureStationRepositoryImpl.getRepository(); }

    private static DepartureStationServiceImpl getService()
    {
        if(service == null) service = new DepartureStationServiceImpl();
        return service;
    }

    @Override
    public Set<DepartureStation> getAll() {
        return repository.getAll();
    }

    @Override
    public DepartureStation create(DepartureStation departureStation) {
        return repository.create(departureStation);
    }

    @Override
    public DepartureStation update(DepartureStation departureStation) {
        return repository.update(departureStation);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public DepartureStation read(String s) {
        return repository.read(s);
    }
}
