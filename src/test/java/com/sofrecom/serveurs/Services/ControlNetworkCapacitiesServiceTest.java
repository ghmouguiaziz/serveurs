package com.sofrecom.serveurs.Services;

import com.sofrecom.serveurs.entities.ControlNetworkCapacities;
import com.sofrecom.serveurs.repositories.ControlNetworkCapacitiesRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.sofrecom.serveurs.services.ControlNetworkCapacitiesService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class ControlNetworkCapacitiesServiceTest {

    @Mock
    private ControlNetworkCapacitiesRepo controlNetworkCapacitiesRepo;

    @InjectMocks
    private ControlNetworkCapacitiesService controlNetworkCapacitiesService;



    @Test
    void testAddControlNetworkCapacities() {
        // Given
        ControlNetworkCapacities controlNetworkCapacities = new ControlNetworkCapacities();

        // When
        String result = controlNetworkCapacitiesService.addControlNetworkCapacities(controlNetworkCapacities);

        // Then
        assertEquals("Added", result);
        verify(controlNetworkCapacitiesRepo).save(controlNetworkCapacities);
    }

    @Test
    void testUpdateControlNetworkCapacities() {
        // Given
        int id = 1;
        ControlNetworkCapacities existingControlNetworkCapacities = new ControlNetworkCapacities();
        existingControlNetworkCapacities.setIdControlNetworkCapacities(id);
        when(controlNetworkCapacitiesRepo.findById(id)).thenReturn(Optional.of(existingControlNetworkCapacities));
        ControlNetworkCapacities updatedControlNetworkCapacities = new ControlNetworkCapacities();
        updatedControlNetworkCapacities.setIdControlNetworkCapacities(id);

        // When
        String result = controlNetworkCapacitiesService.updateControlNetworkCapacities(updatedControlNetworkCapacities, id);

        // Then
        assertEquals("updated", result);
        verify(controlNetworkCapacitiesRepo).saveAndFlush(existingControlNetworkCapacities);
    }

    @Test
    void testDeleteControlNetworkCapacities() {
        // Given
        int id = 1;

        // When
        String result = controlNetworkCapacitiesService.deleteControlNetworkCapacities(id);

        // Then
        assertEquals("deleted", result);
        verify(controlNetworkCapacitiesRepo).deleteById(id);
    }

    @Test
    void testGetAllControlNetworkCapacities() {
        // Given

        // When
        controlNetworkCapacitiesService.getAllControlNetworkCapacities();

        // Then
        verify(controlNetworkCapacitiesRepo).findAll();
    }

    @Test
    void testGetControlNetworkCapacitiesById() {
        // Given
        int id = 1;

        // When
        controlNetworkCapacitiesService.getControlNetworkCapacitiesById(id);

        // Then
        verify(controlNetworkCapacitiesRepo).findById(id);
    }

    @Test
    void testFindByClassOfControlNetwork() {
        // Given
        String name = "exampleName";

        // When
        controlNetworkCapacitiesService.findByClassOfControlNetwork(name);

        // Then
        verify(controlNetworkCapacitiesRepo).findByClassOfcontrolNetwork(name);
    }
}
