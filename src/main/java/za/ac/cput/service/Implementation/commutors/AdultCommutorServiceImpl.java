package za.ac.cput.service.Implementation.commutors;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.commutors.Adult;
import za.ac.cput.service.commutors.AdultCommutorService;
import za.ac.cput.repositories.commutorsRepository.AdultCommutorRepository;
import za.ac.cput.repositories.implimentation.commutorsRepositoryImpl.AdultCommutorRepositoryImpl;

import java.util.Set;

@Service("AdultCommutorServiceImpl")
public class AdultCommutorServiceImpl implements AdultCommutorService {

    private static AdultCommutorServiceImpl service = null;
    private AdultCommutorRepository repository;

    private AdultCommutorServiceImpl(){this.repository = AdultCommutorRepositoryImpl.getRepository();}

    private static AdultCommutorServiceImpl getService()
    {
        if(service == null) service = new AdultCommutorServiceImpl();
        return service;
    }

    @Override
    public Set<Adult> getAll() {
        return repository.getAll();
    }

    @Override
    public Adult create(Adult adult) {
        return repository.create(adult);
    }

    @Override
    public Adult update(Adult adult) {
        return repository.update(adult);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Adult read(String s) {
        return repository.read(s);
    }
}
