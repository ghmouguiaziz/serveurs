package com.sofrecom.serveurs.repositories;

import com.sofrecom.serveurs.entities.ComputeCapacities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputeCapacitiesRepo extends JpaRepository<ComputeCapacities,Integer> {
    ComputeCapacities findByName(String name);

}
