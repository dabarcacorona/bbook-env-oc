package cl.corona.bbookenvoc.repository;

import cl.corona.bbookenvoc.model.bbookJson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bbookRepository extends CrudRepository<bbookJson, Long> {
}
