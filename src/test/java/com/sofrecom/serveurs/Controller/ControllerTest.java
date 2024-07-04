package com.sofrecom.serveurs.Controller;

import com.sofrecom.serveurs.entities.ComputeCapacities;
import com.sofrecom.serveurs.entities.ControlNetworkCapacities;
import com.sofrecom.serveurs.entities.NetworkElementsCapacities;
import com.sofrecom.serveurs.entities.StorageCapacities;
import com.sofrecom.serveurs.services.IComputeCapacitiesService;
import com.sofrecom.serveurs.services.IControlNetworkCapacitiesService;
import com.sofrecom.serveurs.services.INetworkElementsCapacitiesService;
import com.sofrecom.serveurs.services.IStorageCapacitiesService;
import com.sofrecom.serveurs.controller.Controller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

class ControllerTest {

    @Mock
    private IComputeCapacitiesService computeCapacitiesService;

    @Mock
    private INetworkElementsCapacitiesService networkElementsCapacitiesService;

    @Mock
    private IStorageCapacitiesService storageCapacitiesService;

    @Mock
    private IControlNetworkCapacitiesService controlNetworkCapacitiesService;

    @InjectMocks
    private Controller controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void addComputeCapacities() {
        ComputeCapacities computeCapacities = new ComputeCapacities();
        when(computeCapacitiesService.addComputeCapacities(any(ComputeCapacities.class))).thenReturn("Compute capacities added successfully");
        assertEquals("Compute capacities added successfully", controller.addComputeCapacities(computeCapacities));
    }

    @Test
    void updateComputeCapacities() {
        ComputeCapacities computeCapacities = new ComputeCapacities();
        computeCapacities.setIdComputeCapacities(1);
        // Set other properties...

        int id = 1;
        when(computeCapacitiesService.updateComputeCapacities(any(ComputeCapacities.class), eq(id))).thenReturn("Compute capacities updated successfully");
        assertEquals("Compute capacities updated successfully", controller.updateComputeCapacities(computeCapacities, id));
    }

    @Test
    void deleteComputeCapacities() {
        int id = 1;
        when(computeCapacitiesService.deleteComputeCapacities(id)).thenReturn("Compute capacities deleted successfully");
        assertEquals("Compute capacities deleted successfully", controller.deleteComputeCapacities(id));
    }

    @Test
    void getAllComputeCapacities() {
        List<ComputeCapacities> computeCapacitiesList = Collections.singletonList(new ComputeCapacities());
        when(computeCapacitiesService.getAllComputeCapacities()).thenReturn(computeCapacitiesList);
        assertEquals(computeCapacitiesList, controller.getAllComputeCapacities());
    }

    @Test
    void getComputeCapacitiesById() {
        int id = 1;
        ComputeCapacities computeCapacities = new ComputeCapacities();
        when(computeCapacitiesService.getComputeCapacitiesById(id)).thenReturn(computeCapacities);
        assertEquals(computeCapacities, controller.getComputeCapacitiesById(id));
    }

    @Test
    void findByClassOfCompute() {
        String name = "ClassName";
        ComputeCapacities computeCapacities = new ComputeCapacities();
        when(computeCapacitiesService.findByClassOfCompute(name)).thenReturn(computeCapacities);
        assertEquals(computeCapacities, controller.findByClassOfCompute(name));
    }

    @Test
    void addNetworkElementsCapacities() {
        NetworkElementsCapacities networkElementsCapacities = new NetworkElementsCapacities();
        when(networkElementsCapacitiesService.addNetworkElementsCapacities(any(NetworkElementsCapacities.class))).thenReturn("Network elements capacities added successfully");
        assertEquals("Network elements capacities added successfully", controller.addNetworkElementsCapacities(networkElementsCapacities));
    }

    @Test
    void updateNetworkElementsCapacities() {
        NetworkElementsCapacities networkElementsCapacities = new NetworkElementsCapacities();
        networkElementsCapacities.setId(1);
        // Set other properties...

        int id = 1;
        when(networkElementsCapacitiesService.updateNetworkElementsCapacities(any(NetworkElementsCapacities.class), eq(id))).thenReturn("Network elements capacities updated successfully");
        assertEquals("Network elements capacities updated successfully", controller.updateNetworkElementsCapacities(networkElementsCapacities, id));
    }

    @Test
    void deleteNetworkElementsCapacities() {
        int id = 1;
        when(networkElementsCapacitiesService.deleteNetworkElementsCapacities(id)).thenReturn("Network elements capacities deleted successfully");
        assertEquals("Network elements capacities deleted successfully", controller.deleteNetworkElementsCapacities(id));
    }

    @Test
    void getAllNetworkElementsCapacities() {
        List<NetworkElementsCapacities> networkElementsCapacitiesList = Collections.singletonList(new NetworkElementsCapacities());
        when(networkElementsCapacitiesService.getAllNetworkElementsCapacities()).thenReturn(networkElementsCapacitiesList);
        assertEquals(networkElementsCapacitiesList, controller.getAllNetworkElementsCapacities());
    }

    @Test
    void getNetworkElementsCapacitiesById() {
        int id = 1;
        NetworkElementsCapacities networkElementsCapacities = new NetworkElementsCapacities();
        when(networkElementsCapacitiesService.getNetworkElementsCapacitiesById(id)).thenReturn(networkElementsCapacities);
        assertEquals(networkElementsCapacities, controller.getNetworkElementsCapacitiesById(id));
    }

    @Test
    void findByDeviceName() {
        String name = "DeviceName";
        NetworkElementsCapacities networkElementsCapacities = new NetworkElementsCapacities();
        when(networkElementsCapacitiesService.findByDeviceName(name)).thenReturn(networkElementsCapacities);
        assertEquals(networkElementsCapacities, controller.findByDeviceName(name));
    }
    @Test
    void addStorageCapacities() {
        StorageCapacities storageCapacities = new StorageCapacities();
        when(storageCapacitiesService.addStorageCapacities(any(StorageCapacities.class))).thenReturn("Storage capacities added successfully");
        assertEquals("Storage capacities added successfully", controller.addStorageCapacities(storageCapacities));
    }

    @Test
    void updateStorageCapacities() {
        StorageCapacities storageCapacities = new StorageCapacities();
        storageCapacities.setIdStorageCapacities(1);
        // Set other properties...

        int id = 1;
        when(storageCapacitiesService.updateStorageCapacities(any(StorageCapacities.class), eq(id))).thenReturn("Storage capacities updated successfully");
        assertEquals("Storage capacities updated successfully", controller.updateStorageCapacities(storageCapacities, id));
    }

    @Test
    void deleteStorageCapacities() {
        int id = 1;
        when(storageCapacitiesService.deleteStorageCapacities(id)).thenReturn("Storage capacities deleted successfully");
        assertEquals("Storage capacities deleted successfully", controller.deleteStorageCapacities(id));
    }

    @Test
    void getAllStorageCapacities() {
        List<StorageCapacities> storageCapacitiesList = Collections.singletonList(new StorageCapacities());
        when(storageCapacitiesService.getAllStorageCapacities()).thenReturn(storageCapacitiesList);
        assertEquals(storageCapacitiesList, controller.getAllStorageCapacities());
    }

    @Test
    void getStorageCapacitiesById() {
        int id = 1;
        StorageCapacities storageCapacities = new StorageCapacities();
        when(storageCapacitiesService.getStorageCapacitiesById(id)).thenReturn(storageCapacities);
        assertEquals(storageCapacities, controller.getStorageCapacitiesById(id));
    }

    @Test
    void findByClassOfStorage() {
        String name = "StorageClassName";
        StorageCapacities storageCapacities = new StorageCapacities();
        when(storageCapacitiesService.findByClassOfStorage(name)).thenReturn(storageCapacities);
        assertEquals(storageCapacities, controller.findByClassOfStorage(name));
    }
    @Test
    void addControlNetworkCapacities() {
        ControlNetworkCapacities controlNetworkCapacities = new ControlNetworkCapacities();
        when(controlNetworkCapacitiesService.addControlNetworkCapacities(any(ControlNetworkCapacities.class))).thenReturn("Control network capacities added successfully");
        assertEquals("Control network capacities added successfully", controller.addControlNetworkCapacities(controlNetworkCapacities));
    }

    @Test
    void updateControlNetworkCapacities() {
        ControlNetworkCapacities controlNetworkCapacities = new ControlNetworkCapacities();
        controlNetworkCapacities.setIdControlNetworkCapacities(1);
        // Set other properties...

        int id = 1;
        when(controlNetworkCapacitiesService.updateControlNetworkCapacities(any(ControlNetworkCapacities.class), eq(id))).thenReturn("Control network capacities updated successfully");
        assertEquals("Control network capacities updated successfully", controller.updateControlNetworkCapacities(controlNetworkCapacities, id));
    }

    @Test
    void deleteControlNetworkCapacities() {
        int id = 1;
        when(controlNetworkCapacitiesService.deleteControlNetworkCapacities(id)).thenReturn("Control network capacities deleted successfully");
        assertEquals("Control network capacities deleted successfully", controller.deleteControlNetworkCapacities(id));
    }

    @Test
    void getAllControlNetworkCapacities() {
        List<ControlNetworkCapacities> controlNetworkCapacitiesList = Collections.singletonList(new ControlNetworkCapacities());
        when(controlNetworkCapacitiesService.getAllControlNetworkCapacities()).thenReturn(controlNetworkCapacitiesList);
        assertEquals(controlNetworkCapacitiesList, controller.getAllControlNetworkCapacities());
    }

    @Test
    void getControlNetworkCapacitiesById() {
        int id = 1;
        ControlNetworkCapacities controlNetworkCapacities = new ControlNetworkCapacities();
        when(controlNetworkCapacitiesService.getControlNetworkCapacitiesById(id)).thenReturn(controlNetworkCapacities);
        assertEquals(controlNetworkCapacities, controller.getControlNetworkCapacitiesById(id));
    }

    @Test
    void findByClassOfControlNetwork() {
        String name = "ControlNetworkClassName";
        ControlNetworkCapacities controlNetworkCapacities = new ControlNetworkCapacities();
        when(controlNetworkCapacitiesService.findByClassOfControlNetwork(name)).thenReturn(controlNetworkCapacities);
        assertEquals(controlNetworkCapacities, controller.findByClassOfControlNetwork(name));
    }

}
