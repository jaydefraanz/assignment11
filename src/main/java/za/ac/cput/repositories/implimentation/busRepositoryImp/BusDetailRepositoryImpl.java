package za.ac.cput.repositories.implimentation.busRepositoryImp;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.bus.BusDetails;
import za.ac.cput.repositories.busRepository.BusDetailsRepository;

import java.util.*;

@Repository("BusDetailsInMemory")
public class BusDetailRepositoryImpl implements BusDetailsRepository {

    private static BusDetailsRepository repository = null;
    private Set<BusDetails> busDetails;

    public BusDetailRepositoryImpl(){this.busDetails = new HashSet<>(); }

    public static BusDetailsRepository getRepository(){
        if(repository == null) repository = new BusDetailRepositoryImpl();
        return repository;
    }


    @Override
    public Set<BusDetails> getAll()
    {
        return busDetails;
    }

    @Override
    public BusDetails create(BusDetails busDetails)
    {
        this.busDetails.add(busDetails);
        return busDetails;
    }

    @Override
    public BusDetails update(BusDetails busDetails)
    {
        Iterator<BusDetails> it = this.busDetails.iterator();

        while(it.hasNext())
        {
           if(this.busDetails.contains(busDetails))
           {
               this.busDetails.remove(busDetails);
               this.busDetails.add(busDetails);
               break;
           }
           else
           {
               this.busDetails.add(busDetails);
           }
           it.next();
        }
        return busDetails;
    }

    @Override
    public void delete(String s)
    {
        for (BusDetails busDtail: busDetails)
        {
            if(busDtail.getBusNo() == s)
            {
                busDetails.remove(busDtail);
            }
        }
    }

    @Override
    public BusDetails read(String s) {
        return this.busDetails.stream()
                .filter(bus -> bus.getBusNo().equalsIgnoreCase(s))
                .findAny().orElse(null);
    }
}