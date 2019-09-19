package za.ac.cput.service.Implementation.card;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.card.AddCredit;
import za.ac.cput.service.card.AddCreditService;
import za.ac.cput.repositories.cardRepository.AddCreditRepository;
import za.ac.cput.repositories.implimentation.cardRepositoryImp.AddCreditRepositoryImpl;

import java.util.Set;

@Service("AddCreditServiceImpl")
public class AddCreditServiceImpl implements AddCreditService {

    private static AddCreditServiceImpl service = null;
    private AddCreditRepository repository;

    private AddCreditServiceImpl(){this.repository = AddCreditRepositoryImpl.getRepository();}

    private static AddCreditServiceImpl getService()
    {
        if(service == null) service = new AddCreditServiceImpl();
        return service;
    }

    @Override
    public Set<AddCredit> getAll() {
        return repository.getAll();
    }

    @Override
    public AddCredit create(AddCredit addCredit) {
        return repository.create(addCredit);
    }

    @Override
    public AddCredit update(AddCredit addCredit) {
        return repository.update(addCredit);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public AddCredit read(String s) {
        return repository.read(s);
    }
}
