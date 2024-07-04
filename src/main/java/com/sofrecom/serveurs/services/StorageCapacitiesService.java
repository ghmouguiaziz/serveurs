package com.sofrecom.serveurs.services;

import com.sofrecom.serveurs.entities.StorageCapacities;
import com.sofrecom.serveurs.repositories.StorageCapacitiesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class StorageCapacitiesService implements IStorageCapacitiesService{

    private final StorageCapacitiesRepo storagecapacitiesrepo;
    @Override
    public String addStorageCapacities(StorageCapacities z) {
        storagecapacitiesrepo.save(z);
        return "Added";
    }
    @Override
    public String updateStorageCapacities(StorageCapacities z ,int id) {

        StorageCapacities z1 = storagecapacitiesrepo.findById(id).get();
        z1.setClassOfStorage(z.getClassOfStorage());
        z1.setSfps(z.getSfps());
        z1.setRnge(z.getRnge());
        z1.setDiskNumber(z.getDiskNumber());
        z1.setDiskVolume(z.getDiskVolume());
        z1.setVolumeBrut(z.getVolumeBrut());
        z1.setVolumeNet(z.getVolumeNet());
        z1.setName(z.getName());
        z1.setDescr(z.getDescr());
        storagecapacitiesrepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteStorageCapacities(int id) {

        storagecapacitiesrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<StorageCapacities> getAllStorageCapacities() {

        return storagecapacitiesrepo.findAll();
    }
    @Override
    public StorageCapacities getStorageCapacitiesById(int id) {

        return storagecapacitiesrepo.findById(id).orElse(null);
    }
    @Override
    public StorageCapacities findByClassOfStorage(String name){
        return storagecapacitiesrepo.findByName(name);
    }

}
