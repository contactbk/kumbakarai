package com.pkm.kumba.repository;

import com.pkm.kumba.entity.Plant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends CrudRepository<Plant,Integer> {
}
