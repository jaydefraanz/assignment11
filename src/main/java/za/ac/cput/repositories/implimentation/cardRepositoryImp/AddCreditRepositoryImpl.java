package za.ac.cput.repositories.implimentation.cardRepositoryImp;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.card.AddCredit;
import za.ac.cput.repositories.cardRepository.AddCreditRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Repository
public class AddCreditRepositoryImpl implements AddCreditRepository {

    public static AddCreditRepository repository = null;
    private Set<AddCredit> addCredits;

    public AddCreditRepositoryImpl(){this.addCredits = new HashSet<>(); }

    public static AddCreditRepository getRepository(){
        if(repository == null) repository = new AddCreditRepositoryImpl();
        return repository;
    }

    @Override
    public Set<AddCredit> getAll()
    {
        return addCredits;
    }

    @Override
    public AddCredit create(AddCredit addCredit) {
        this.addCredits.add(addCredit);
        return addCredit;
    }

    @Override
    public AddCredit update(AddCredit addCredit) {
        Iterator<AddCredit> it = this.addCredits.iterator();

        while(it.hasNext())
        {
            if(this.addCredits.contains(addCredit))
            {
                this.addCredits.remove(addCredit);
                this.addCredits.add(addCredit);
                break;
            }
            else
            {
                this.addCredits.add(addCredit);
            }
            it.next();
        }
        return addCredit;
    }

    @Override
    public void delete(String s)
    {
        for (AddCredit addCreds: addCredits)
        {
            if(addCreds.getCardNo() == s)
            {
                addCredits.remove(addCreds);
            }
        }
    }

    @Override
    public AddCredit read(String s) {
        AddCredit adCr = new AddCredit.Builder().build();

        for(AddCredit addCreds : addCredits)
        {
            if(addCreds.getCardNo() == s)
            {
                adCr = addCreds;
            }
        }

        return (AddCredit) adCr;
    }
}
