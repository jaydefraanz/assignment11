package za.ac.cput.repositories.implimentation.busRepositoryImp;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.bus.BusDetails;

public interface BusDetailsJPA extends JpaRepository<BusDetails, String> {
}
