package za.ac.cput.service.Implementation.card;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.card.BalanceCheck;
import za.ac.cput.service.card.BalanceCheckService;
import za.ac.cput.repositories.cardRepository.BalanceCheckRepository;
import za.ac.cput.repositories.implimentation.cardRepositoryImp.BalanceCheckRepositoryImpl;

import java.util.Set;

@Service("BalanceCheckServiceImpl")
public class BalanceCheckServiceImpl implements BalanceCheckService {

    private static BalanceCheckServiceImpl service = null;
    private BalanceCheckRepository repository;

    private BalanceCheckServiceImpl(){this.repository = BalanceCheckRepositoryImpl.getRepository();}

    private static BalanceCheckServiceImpl getService()
    {
        if(service == null) service = new BalanceCheckServiceImpl();
        return service;
    }

    @Override
    public Set<BalanceCheck> getAll() {
        return repository.getAll();
    }

    @Override
    public BalanceCheck create(BalanceCheck balanceCheck) {
        return repository.create(balanceCheck);
    }

    @Override
    public BalanceCheck update(BalanceCheck balanceCheck) {
        return repository.update(balanceCheck);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public BalanceCheck read(String s) {
        return repository.read(s);
    }
}
