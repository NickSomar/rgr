package carshowroom.repo;

import carshowroom.model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "rent", path = "rent")
public interface RentRepo extends JpaRepository<Rent, Long> {
    Rent findRentById(Long id);
}
