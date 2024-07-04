package com.sofrecom.serveurs.controller;


import com.sofrecom.serveurs.entities.ComputeCapacities;
import com.sofrecom.serveurs.entities.ControlNetworkCapacities;
import com.sofrecom.serveurs.entities.NetworkElementsCapacities;
import com.sofrecom.serveurs.entities.StorageCapacities;
import com.sofrecom.serveurs.services.IComputeCapacitiesService;
import com.sofrecom.serveurs.services.IControlNetworkCapacitiesService;
import com.sofrecom.serveurs.services.INetworkElementsCapacitiesService;
import com.sofrecom.serveurs.services.IStorageCapacitiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/data")
@CrossOrigin(origins = "http://localhost:4200/")
public class Controller {



    //////////////////////////////////ComputeCapacities///////////////////////////////////////////////

    private final IComputeCapacitiesService icomputecapacitiesservice;

    @PostMapping("/addComputeCapacities")
    public String addComputeCapacities(@RequestBody ComputeCapacities z) {

        return  icomputecapacitiesservice.addComputeCapacities(z);
    }
    @PutMapping("/updateComputeCapacities/{id}")
    public String updateComputeCapacities(@RequestBody ComputeCapacities z,@PathVariable int id){
        return icomputecapacitiesservice.updateComputeCapacities(z,id);
    }
    @DeleteMapping("/deleteComputeCapacities/{id}")
    public String deleteComputeCapacities(@PathVariable int id) {

        return  icomputecapacitiesservice.deleteComputeCapacities(id);
    }
    @GetMapping("/getAllComputeCapacities")
    public List<ComputeCapacities> getAllComputeCapacities(){

        return icomputecapacitiesservice.getAllComputeCapacities();
    }
    @GetMapping("/getComputeCapacitiesById/{id}")
    public ComputeCapacities getComputeCapacitiesById(@PathVariable int id){

        return icomputecapacitiesservice.getComputeCapacitiesById(id);
    }

    @GetMapping("/findByClassOfCompute/{name}")
    public ComputeCapacities findByClassOfCompute(@PathVariable String name){

        return icomputecapacitiesservice.findByClassOfCompute(name);
    }

    //////////////////////////////////NetworkElementsCapacities///////////////////////////////////////////////

    private final INetworkElementsCapacitiesService iNetworkElementscapacitiesservice;

    @PostMapping("/addNetworkElementsCapacities")
    public String addNetworkElementsCapacities(@RequestBody NetworkElementsCapacities z) {

        return  iNetworkElementscapacitiesservice.addNetworkElementsCapacities(z);
    }
    @PutMapping("/updateNetworkElementsCapacities/{id}")
    public String updateNetworkElementsCapacities(@RequestBody NetworkElementsCapacities z,@PathVariable int id){
        return iNetworkElementscapacitiesservice.updateNetworkElementsCapacities(z,id);
    }

    @DeleteMapping("/deleteNetworkElementsCapacities/{id}")
    public String deleteNetworkElementsCapacities(@PathVariable int id) {

        return  iNetworkElementscapacitiesservice.deleteNetworkElementsCapacities(id);
    }

    @GetMapping("/getAllNetworkElementsCapacities")
    @PreAuthorize("hasRole('user')")
    public List<NetworkElementsCapacities> getAllNetworkElementsCapacities(){

        return iNetworkElementscapacitiesservice.getAllNetworkElementsCapacities();
    }
    @GetMapping("/getNetworkElementsCapacitiesById/{id}")
    public NetworkElementsCapacities getNetworkElementsCapacitiesById(@PathVariable int id){

        return iNetworkElementscapacitiesservice.getNetworkElementsCapacitiesById(id);
    }
    @GetMapping("/findByDeviceName/{name}")
    public NetworkElementsCapacities findByDeviceName(@PathVariable String name){

        return iNetworkElementscapacitiesservice.findByDeviceName(name);
    }



    //////////////////////////////////StorageCapacities///////////////////////////////////////////////

    private final IStorageCapacitiesService istoragecapacitiesservice;

    @PostMapping("/addStorageCapacities")
    public String addStorageCapacities(@RequestBody StorageCapacities z) {

        return  istoragecapacitiesservice.addStorageCapacities(z);
    }
    @PutMapping("/updateStorageCapacities/{id}")
    public String updateStorageCapacities(@RequestBody StorageCapacities z,@PathVariable int id){
        return istoragecapacitiesservice.updateStorageCapacities(z,id);
    }
    @DeleteMapping("/deleteStorageCapacities/{id}")
    public String deleteStorageCapacities(@PathVariable int id) {

        return  istoragecapacitiesservice.deleteStorageCapacities(id);
    }
    @GetMapping("/getAllStorageCapacities")
    public List<StorageCapacities> getAllStorageCapacities(){

        return istoragecapacitiesservice.getAllStorageCapacities();
    }
    @GetMapping("/getStorageCapacitiesById/{id}")
    public StorageCapacities getStorageCapacitiesById(@PathVariable int id){

        return istoragecapacitiesservice.getStorageCapacitiesById(id);
    }

    @GetMapping("/findByClassOfStorage/{name}")
    public StorageCapacities findByClassOfStorage(@PathVariable String name){

        return istoragecapacitiesservice.findByClassOfStorage(name);
    }


    //////////////////////////////////ControlNetworkCapacities///////////////////////////////////////////////

    private final IControlNetworkCapacitiesService icontrolnetworkcapacitiesservice;

    @PostMapping("/addControlNetworkCapacities")
    public String addControlNetworkCapacities(@RequestBody ControlNetworkCapacities z) {

        return  icontrolnetworkcapacitiesservice.addControlNetworkCapacities(z);
    }
    @PutMapping("/updateControlNetworkCapacities/{id}")
    public String updateControlNetworkCapacities(@RequestBody ControlNetworkCapacities z,@PathVariable int id){
        return icontrolnetworkcapacitiesservice.updateControlNetworkCapacities(z,id);
    }
    @DeleteMapping("/deleteControlNetworkCapacities/{id}")
    public String deleteControlNetworkCapacities(@PathVariable int id) {

        return  icontrolnetworkcapacitiesservice.deleteControlNetworkCapacities(id);
    }
    @GetMapping("/getAllControlNetworkCapacities")
    public List<ControlNetworkCapacities> getAllControlNetworkCapacities(){

        return icontrolnetworkcapacitiesservice.getAllControlNetworkCapacities();
    }
    @GetMapping("/getControlNetworkCapacitiesById/{id}")
    public ControlNetworkCapacities getControlNetworkCapacitiesById(@PathVariable int id){

        return icontrolnetworkcapacitiesservice.getControlNetworkCapacitiesById(id);
    }
    @GetMapping("/findByClassOfControlNetwork/{name}")
    public ControlNetworkCapacities findByClassOfControlNetwork(@PathVariable String name){

        return icontrolnetworkcapacitiesservice.findByClassOfControlNetwork(name);
    }

}

