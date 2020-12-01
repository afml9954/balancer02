package co.edu.usta.lol.repository;

import co.edu.usta.lol.model.Champion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionRepository extends CrudRepository<Champion, Integer> {
}
