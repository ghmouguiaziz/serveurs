package com.sofrecom.serveurs.Services;

import com.sofrecom.serveurs.entities.StorageCapacities;
import com.sofrecom.serveurs.repositories.StorageCapacitiesRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.sofrecom.serveurs.services.StorageCapacitiesService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class StorageCapacitiesServiceTest {

    @InjectMocks
    private StorageCapacitiesService storageCapacitiesService;
    @Mock
    private StorageCapacitiesRepo storageCapacitiesRepo;



    @Test
    void testAddStorageCapacities() {
        // Given
        StorageCapacities storageCapacities = new StorageCapacities();
        when(storageCapacitiesRepo.save(storageCapacities)).thenReturn(storageCapacities);

        // When
        String result = storageCapacitiesService.addStorageCapacities(storageCapacities);

        // Then
        assertEquals("Added", result);
        verify(storageCapacitiesRepo).save(storageCapacities);
    }

    @Test
    void testUpdateStorageCapacities() {
        // Given
        int id = 1;
        StorageCapacities existingStorageCapacities = new StorageCapacities();
        existingStorageCapacities.setIdStorageCapacities(id);
        when(storageCapacitiesRepo.findById(id)).thenReturn(Optional.of(existingStorageCapacities));
        StorageCapacities updatedStorageCapacities = new StorageCapacities();
        updatedStorageCapacities.setIdStorageCapacities(id);

        // When
        String result = storageCapacitiesService.updateStorageCapacities(updatedStorageCapacities, id);

        // Then
        assertEquals("updated", result);
        verify(storageCapacitiesRepo).saveAndFlush(existingStorageCapacities);
    }

    @Test
    void testDeleteStorageCapacities() {
        // Given
        int id = 1;

        // When
        String result = storageCapacitiesService.deleteStorageCapacities(id);

        // Then
        assertEquals("deleted", result);
        verify(storageCapacitiesRepo).deleteById(id);
    }

    @Test
    void testGetAllStorageCapacities() {
        // Given
        List<StorageCapacities> storageCapacitiesList = Arrays.asList(new StorageCapacities(), new StorageCapacities());
        when(storageCapacitiesRepo.findAll()).thenReturn(storageCapacitiesList);

        // When
        List<StorageCapacities> result = storageCapacitiesService.getAllStorageCapacities();

        // Then
        assertEquals(storageCapacitiesList, result);
        verify(storageCapacitiesRepo).findAll();
    }

    @Test
    void testGetStorageCapacitiesById() {
        // Given
        int id = 1;
        StorageCapacities expectedStorageCapacities = new StorageCapacities();
        when(storageCapacitiesRepo.findById(id)).thenReturn(Optional.of(expectedStorageCapacities));

        // When
        StorageCapacities result = storageCapacitiesService.getStorageCapacitiesById(id);

        // Then
        assertEquals(expectedStorageCapacities, result);
        verify(storageCapacitiesRepo).findById(id);
    }

    @Test
    void testFindByClassOfStorage() {
        // Given
        String name = "exampleName";
        StorageCapacities expectedStorageCapacities = new StorageCapacities();
        when(storageCapacitiesRepo.findByName(name)).thenReturn(expectedStorageCapacities);

        // When
        StorageCapacities result = storageCapacitiesService.findByClassOfStorage(name);

        // Then
        assertEquals(expectedStorageCapacities, result);
        verify(storageCapacitiesRepo).findByName(name);
    }
}
