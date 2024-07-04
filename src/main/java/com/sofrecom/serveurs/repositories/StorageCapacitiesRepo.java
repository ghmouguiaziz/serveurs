package com.sofrecom.serveurs.repositories;

import com.sofrecom.serveurs.entities.StorageCapacities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageCapacitiesRepo extends JpaRepository<StorageCapacities,Integer> {
    StorageCapacities findByName(String name);
}
