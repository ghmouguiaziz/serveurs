package com.sofrecom.serveurs.Entities;

import com.sofrecom.serveurs.entities.StorageCapacities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageCapacitiesTest {

    StorageCapacities storage;

    @BeforeEach
    void setup(){
        storage = new StorageCapacities();
    }
    @Test
    void getIdStorageCapacities() {
        int id = 1;
        storage.setIdStorageCapacities(id);
        assertEquals(id,storage.getIdStorageCapacities());
    }

    @Test
    void getClassOfStorage() {
        String classtorage = "class";
        storage.setClassOfStorage(classtorage);
        assertEquals(classtorage,storage.getClassOfStorage());
    }

    @Test
    void getRnge() {
        int rng = 1;
        storage.setRnge(rng);
        assertEquals(rng,storage.getRnge());
    }

    @Test
    void getDiskNumber() {
        int diskNumber = 5;
        storage.setDiskNumber(diskNumber);
        assertEquals(diskNumber,storage.getDiskNumber());
    }

    @Test
    void getDiskVolume() {
        int diskVolume = 5;
        storage.setDiskVolume(diskVolume);
        assertEquals(diskVolume,storage.getDiskVolume());
    }

    @Test
    void getVolumeBrut() {
        int volumeBrut = 5;
        storage.setVolumeBrut(volumeBrut);
        assertEquals(volumeBrut,storage.getVolumeBrut());
    }

    @Test
    void getVolumeNet() {
        int volumeNet = 5;
        storage.setVolumeNet(volumeNet);
        assertEquals(volumeNet,storage.getVolumeNet());
    }

    @Test
    void getSfps() {
        int sfp = 5;
        storage.setSfps(sfp);
        assertEquals(sfp,storage.getSfps());
    }

    @Test
    void getName() {
        String name="name";
        storage.setName(name);
        assertEquals(name,storage.getName());
    }

    @Test
    void getDescr() {
        String descr="descr";
        storage.setDescr(descr);
        assertEquals(descr,storage.getDescr());
    }
}
