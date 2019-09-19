package za.ac.cput.service.Implementation.location;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.location.Location;
import za.ac.cput.service.location.LocationService;
import za.ac.cput.repositories.locationRepository.LocationRepository;
import za.ac.cput.repositories.implimentation.locationRepositoryImpl.LocationRepositoryImpl;

import java.util.Set;

@Service("LocationServiceImpl")
public class LocationServiceImpl implements LocationService {

    private static LocationServiceImpl service = null;
    private LocationRepository repository;

    private LocationServiceImpl(){this.repository = LocationRepositoryImpl.getRepository(); }

    private static LocationServiceImpl getService()
    {
        if (service == null) service = new LocationServiceImpl();
        return service;
    }

    @Override
    public Set<Location> getAll() {
        return repository.getAll();
    }

    @Override
    public Location create(Location location) {
        return repository.create(location);
    }

    @Override
    public Location update(Location location) {
        return repository.update(location);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Location read(String s) {
        return repository.read(s);
    }
}
