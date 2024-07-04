package com.sofrecom.serveurs.Entities;

import com.sofrecom.serveurs.entities.ControlNetworkCapacities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlNetworkCapacitiesTest {

    ControlNetworkCapacities controlNetwork;
    @BeforeEach
    void setup(){
        controlNetwork = new ControlNetworkCapacities();
    }
    @Test
    void getIdControlNetworkCapacities() {
        int id = 1;
        controlNetwork.setIdControlNetworkCapacities(id);
        assertEquals(id,controlNetwork.getIdControlNetworkCapacities());
    }

    @Test
    void getClassOfcontrolNetwork() {
        String classOfcontrol = "class";
        controlNetwork.setClassOfcontrolNetwork(classOfcontrol);
        assertEquals(classOfcontrol,controlNetwork.getClassOfcontrolNetwork());
    }

    @Test
    void getSfps() {
        int sfp= 5;
        controlNetwork.setSfps(sfp);
        assertEquals(sfp,controlNetwork.getSfps());
    }
}
