package com.sofrecom.serveurs.repositories;

import com.sofrecom.serveurs.entities.ControlNetworkCapacities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlNetworkCapacitiesRepo extends JpaRepository<ControlNetworkCapacities,Integer> {
    ControlNetworkCapacities findByClassOfcontrolNetwork (String name);
}
