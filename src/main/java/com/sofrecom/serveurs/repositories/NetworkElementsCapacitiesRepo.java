package com.sofrecom.serveurs.repositories;

import com.sofrecom.serveurs.entities.NetworkElementsCapacities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkElementsCapacitiesRepo extends JpaRepository<NetworkElementsCapacities,Integer> {
    NetworkElementsCapacities findByName(String name);
}
