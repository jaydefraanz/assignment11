package za.ac.cput.service.Implementation.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.bus.BusDetails;
import za.ac.cput.repositories.busRepository.BusDetailsHibernate;
import za.ac.cput.service.bus.BusDetailsService;
import za.ac.cput.repositories.busRepository.BusDetailsRepository;
import za.ac.cput.repositories.implimentation.busRepositoryImp.BusDetailRepositoryImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("BusDetailsServiceImpl")
public class BusDetailsServiceImpl implements BusDetailsService {

    private static BusDetailsServiceImpl service = null;
    @Autowired
    private BusDetailsHibernate repository;

    private BusDetailsServiceImpl()
    {

    }

    private static BusDetailsServiceImpl getService()
    {
        if(service == null) service = new BusDetailsServiceImpl();
        return service;
    }

    @Override
    public Set<BusDetails> getAll() {
        return new HashSet<BusDetails>((List<BusDetails>)repository.findAll());
    }

    @Override
    public BusDetails create(BusDetails busDetails) {
        return repository.save(busDetails);
    }

    @Override
    public BusDetails update(BusDetails busDetails) {
        return this.repository.save(busDetails);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public BusDetails read(String s) {
        return this.repository.findById(s).orElse(null);
    }
}
