package com.sofrecom.serveurs.services;

import com.sofrecom.serveurs.entities.NetworkElementsCapacities;
import com.sofrecom.serveurs.repositories.NetworkElementsCapacitiesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class NetworkElementsCapacitiesService implements INetworkElementsCapacitiesService {

    private final NetworkElementsCapacitiesRepo networkElementscapacitiesrepo;
    @Override
    public String addNetworkElementsCapacities(NetworkElementsCapacities z) {
        networkElementscapacitiesrepo.save(z);
        return "Added";
    }
    @Override
    public String updateNetworkElementsCapacities(NetworkElementsCapacities z ,int id) {

        NetworkElementsCapacities z1 = networkElementscapacitiesrepo.findById(id).get();
        z1.setFree(z.getFree());
        z1.setUsed(z.getUsed());
        z1.setPorts(z.getPorts());
        z1.setName(z.getName());

        networkElementscapacitiesrepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteNetworkElementsCapacities(int id) {

        networkElementscapacitiesrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<NetworkElementsCapacities> getAllNetworkElementsCapacities() {

        return networkElementscapacitiesrepo.findAll();
    }
    @Override
    public NetworkElementsCapacities getNetworkElementsCapacitiesById(int id) {

        return networkElementscapacitiesrepo.findById(id).orElse(null);
    }
    @Override
    public NetworkElementsCapacities findByDeviceName(String name){

        return networkElementscapacitiesrepo.findByName(name);
    }

}
