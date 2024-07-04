package com.sofrecom.serveurs.services;

import com.sofrecom.serveurs.entities.StorageCapacities;

import java.util.List;

public interface IStorageCapacitiesService {
    public String addStorageCapacities(StorageCapacities z ) ;
    public String updateStorageCapacities(StorageCapacities z ,int id);
    public String deleteStorageCapacities(int id);
    public List<StorageCapacities> getAllStorageCapacities();
    public StorageCapacities getStorageCapacitiesById(int id);
    public StorageCapacities findByClassOfStorage(String name);
}
