package com.sofrecom.serveurs.services;

import com.sofrecom.serveurs.entities.ComputeCapacities;

import java.util.List;

public interface IComputeCapacitiesService {
    public String addComputeCapacities(ComputeCapacities z ) ;
    public String updateComputeCapacities(ComputeCapacities z ,int id);
    public String deleteComputeCapacities(int id);
    public List<ComputeCapacities> getAllComputeCapacities();
    public ComputeCapacities getComputeCapacitiesById(int id);
    public ComputeCapacities findByClassOfCompute(String name);
}
