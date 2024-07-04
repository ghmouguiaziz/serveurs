package com.sofrecom.serveurs.services;

import com.sofrecom.serveurs.entities.ControlNetworkCapacities;
import com.sofrecom.serveurs.repositories.ControlNetworkCapacitiesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ControlNetworkCapacitiesService implements IControlNetworkCapacitiesService{

    private final ControlNetworkCapacitiesRepo controlnetworkcapacitiesrepo;
    @Override
    public String addControlNetworkCapacities(ControlNetworkCapacities z) {
        controlnetworkcapacitiesrepo.save(z);
        return "Added";
    }
    @Override
    public String updateControlNetworkCapacities(ControlNetworkCapacities z ,int id) {

        ControlNetworkCapacities z1 = controlnetworkcapacitiesrepo.findById(id).get();
        z1.setSfps(z.getSfps());
        z1.setClassOfcontrolNetwork(z.getClassOfcontrolNetwork());
        controlnetworkcapacitiesrepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteControlNetworkCapacities(int id) {

        controlnetworkcapacitiesrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<ControlNetworkCapacities> getAllControlNetworkCapacities() {

        return controlnetworkcapacitiesrepo.findAll();
    }
    @Override
    public ControlNetworkCapacities getControlNetworkCapacitiesById(int id) {

        return controlnetworkcapacitiesrepo.findById(id).orElse(null);
    }
    @Override
    public ControlNetworkCapacities findByClassOfControlNetwork(String name){
        return controlnetworkcapacitiesrepo.findByClassOfcontrolNetwork(name);
    }

}
