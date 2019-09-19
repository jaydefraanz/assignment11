package za.ac.cput.service.Implementation.commutors;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.commutors.Child;
import za.ac.cput.service.commutors.ChildCommutorService;
import za.ac.cput.repositories.commutorsRepository.ChildCommutorRepository;
import za.ac.cput.repositories.implimentation.commutorsRepositoryImpl.ChildCommutorRepositoryImpl;

import java.util.Set;

@Service("ChildCommutorServiceImpl")
public class ChildCommutorServiceImpl implements ChildCommutorService {

    private static ChildCommutorServiceImpl service = null;
    private ChildCommutorRepository repository;

    private ChildCommutorServiceImpl(){this.repository = ChildCommutorRepositoryImpl.getRepository(); }

    private static ChildCommutorServiceImpl getService()
    {
        if(service == null) service = new ChildCommutorServiceImpl();
        return  service;
    }

    @Override
    public Set<Child> getAll() {
        return repository.getAll();
    }

    @Override
    public Child create(Child child) {
        return repository.create(child);
    }

    @Override
    public Child update(Child child) {
        return repository.update(child);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Child read(String s) {
        return repository.read(s);
    }
}
