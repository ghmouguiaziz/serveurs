package com.sofrecom.serveurs.Entities;

import com.sofrecom.serveurs.entities.ComputeCapacities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputeCapacitiesTest {

    ComputeCapacities compute;


    @BeforeEach
    void setup(){
        compute = new ComputeCapacities();
    }
    @Test
    void getIdComputeCapacities() {
       int id = 1;
       compute.setIdComputeCapacities(id);
       assertEquals(id,compute.getIdComputeCapacities());
    }

    @Test
    void getClassOfCompute() {
        String classOfCompute= "class";
        compute.setClassOfCompute(classOfCompute);
        assertEquals(classOfCompute,compute.getClassOfCompute());
    }

    @Test
    void getName() {
        String name= "name";
        compute.setName(name);
        assertEquals(name,compute.getName());
    }

    @Test
    void getDescr() {
        String dsc= "dsc";
        compute.setDescr(dsc);
        assertEquals(dsc,compute.getDescr());
    }

    @Test
    void getCpu() {
        int cpu = 11;
        compute.setCpu(cpu);
        assertEquals(cpu,compute.getCpu());
    }

    @Test
    void getMaxvcpu() {
        int mcpu = 5;
        compute.setMaxvcpu(mcpu);
        assertEquals(mcpu,compute.getMaxvcpu());
    }

    @Test
    void getMaxvram() {
        int mRam = 20;
        compute.setMaxvram(mRam);
        assertEquals(mRam,compute.getMaxvram());
    }

    @Test
    void getSfps() {
        int sfp = 20;
        compute.setSfps(sfp);
        assertEquals(sfp,compute.getSfps());
    }
}
