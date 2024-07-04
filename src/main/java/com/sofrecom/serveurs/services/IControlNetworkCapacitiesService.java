package com.sofrecom.serveurs.services;

import com.sofrecom.serveurs.entities.ControlNetworkCapacities;

import java.util.List;

public interface IControlNetworkCapacitiesService {
    public String addControlNetworkCapacities(ControlNetworkCapacities z ) ;
    public String updateControlNetworkCapacities(ControlNetworkCapacities z ,int id);
    public String deleteControlNetworkCapacities(int id);
    public List<ControlNetworkCapacities> getAllControlNetworkCapacities();
    public ControlNetworkCapacities getControlNetworkCapacitiesById(int id);
    public ControlNetworkCapacities findByClassOfControlNetwork(String name);

}
