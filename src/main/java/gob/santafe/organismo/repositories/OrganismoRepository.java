package gob.santafe.organismo.repositories;

import gob.santafe.organismo.entities.Organismo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganismoRepository extends JpaRepository<Organismo, Integer> {
}