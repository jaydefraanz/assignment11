package za.ac.cput.service.Implementation.route;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.route.Route;
import za.ac.cput.service.route.RouteService;
import za.ac.cput.repositories.routeRepository.RouteRepository;
import za.ac.cput.repositories.implimentation.routeRepositoryImpl.RouteRepositoryImpl;

import java.util.Set;

@Service("RouteServiceImpl")
public class RouteServiceImpl implements RouteService {

    private static RouteServiceImpl service = null;
    private RouteRepository repository;

    private RouteServiceImpl(){this.repository = RouteRepositoryImpl.getRepository(); }

    private static RouteServiceImpl getService()
    {
        if (service == null) service = new RouteServiceImpl();
        return service;
    }

    @Override
    public Set<Route> getAll() {
        return repository.getAll();
    }

    @Override
    public Route create(Route route) {
        return repository.create(route);
    }

    @Override
    public Route update(Route route) {
        return repository.update(route);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Route read(String s) {
        return repository.read(s);
    }
}
