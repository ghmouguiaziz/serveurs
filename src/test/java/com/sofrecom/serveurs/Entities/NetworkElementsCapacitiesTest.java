package com.sofrecom.serveurs.Entities;

import com.sofrecom.serveurs.entities.NetworkElementsCapacities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkElementsCapacitiesTest {

    NetworkElementsCapacities network;
    @BeforeEach
    void setup(){
        network = new NetworkElementsCapacities();
    }

    @Test
    void getId() {
        int id = 1;
        network.setId(id);
        assertEquals(id,network.getId());
    }

    @Test
    void getName() {
        String name = "name";
        network.setName(name);
        assertEquals(name,network.getName());
    }

    @Test
    void getPorts() {
        int ports = 10;
        network.setPorts(ports);
        assertEquals(ports,network.getPorts());
    }

    @Test
    void getUsed() {
        int used = 5;
        network.setUsed(used);
        assertEquals(used,network.getUsed());
    }

    @Test
    void getFree() {
        int free = 2;
        network.setFree(free);
        assertEquals(free,network.getFree());
    }
}
