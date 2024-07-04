package com.sofrecom.serveurs.Services;

import com.sofrecom.serveurs.entities.ComputeCapacities;
import com.sofrecom.serveurs.repositories.ComputeCapacitiesRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.sofrecom.serveurs.services.ComputeCapacitiesService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class ComputeCapacitiesServiceTest {

    @Mock
    private ComputeCapacitiesRepo computeCapacitiesRepo;

    @InjectMocks
    private ComputeCapacitiesService computeCapacitiesService;



    @Test
    void testAddComputeCapacities() {
        // Given
        ComputeCapacities computeCapacities = new ComputeCapacities();

        // When
        String result = computeCapacitiesService.addComputeCapacities(computeCapacities);

        // Then
        assertEquals("Added", result);
        verify(computeCapacitiesRepo).save(computeCapacities);
    }

    @Test
    void testUpdateComputeCapacities() {
        // Given
        int id = 1;
        ComputeCapacities existingComputeCapacities = new ComputeCapacities();
        existingComputeCapacities.setIdComputeCapacities(id);
        when(computeCapacitiesRepo.findById(id)).thenReturn(Optional.of(existingComputeCapacities));
        ComputeCapacities updatedComputeCapacities = new ComputeCapacities();
        updatedComputeCapacities.setIdComputeCapacities(id);

        // When
        String result = computeCapacitiesService.updateComputeCapacities(updatedComputeCapacities, id);

        // Then
        assertEquals("updated", result);
        verify(computeCapacitiesRepo).saveAndFlush(existingComputeCapacities);
    }

    @Test
    void testDeleteComputeCapacities() {
        // Given
        int id = 1;

        // When
        String result = computeCapacitiesService.deleteComputeCapacities(id);

        // Then
        assertEquals("deleted", result);
        verify(computeCapacitiesRepo).deleteById(id);
    }

    @Test
    void testGetAllComputeCapacities() {
        // Given

        // When
        computeCapacitiesService.getAllComputeCapacities();

        // Then
        verify(computeCapacitiesRepo).findAll();
    }

    @Test
    void testGetComputeCapacitiesById() {
        // Given
        int id = 1;

        // When
        computeCapacitiesService.getComputeCapacitiesById(id);

        // Then
        verify(computeCapacitiesRepo).findById(id);
    }

    @Test
    void testFindByClassOfCompute() {
        // Given
        String name = "exampleName";

        // When
        computeCapacitiesService.findByClassOfCompute(name);

        // Then
        verify(computeCapacitiesRepo).findByName(name);
    }
}
