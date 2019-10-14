package za.ac.cput.repositories.busRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import za.ac.cput.domain.bus.BusDetails;

public interface BusDetailsHibernate extends CrudRepository<BusDetails, String> {
}
