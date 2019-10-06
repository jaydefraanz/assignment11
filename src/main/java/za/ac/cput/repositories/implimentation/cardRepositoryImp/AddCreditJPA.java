package za.ac.cput.repositories.implimentation.cardRepositoryImp;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.card.AddCredit;

public interface AddCreditJPA extends JpaRepository<AddCredit, String> {
}
