package com.sofrecom.serveurs.Services;

import com.sofrecom.serveurs.entities.NetworkElementsCapacities;
import com.sofrecom.serveurs.repositories.NetworkElementsCapacitiesRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.sofrecom.serveurs.services.NetworkElementsCapacitiesService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class NetworkElementsCapacitiesServiceTest {

    @InjectMocks
    private NetworkElementsCapacitiesService networkElementsCapacitiesService;
    @Mock
    private NetworkElementsCapacitiesRepo networkElementsCapacitiesRepo;


    @Test
    void testAddNetworkElementsCapacities() {
        // Given
        NetworkElementsCapacities networkElementsCapacities = new NetworkElementsCapacities();
        when(networkElementsCapacitiesRepo.save(networkElementsCapacities)).thenReturn(networkElementsCapacities);

        // When
        String result = networkElementsCapacitiesService.addNetworkElementsCapacities(networkElementsCapacities);

        // Then
        assertEquals("Added", result);
        verify(networkElementsCapacitiesRepo).save(networkElementsCapacities);
    }

    @Test
    void testUpdateNetworkElementsCapacities() {
        // Given
        int id = 1;
        NetworkElementsCapacities existingNetworkElementsCapacities = new NetworkElementsCapacities();
        existingNetworkElementsCapacities.setId(id);
        when(networkElementsCapacitiesRepo.findById(id)).thenReturn(Optional.of(existingNetworkElementsCapacities));
        NetworkElementsCapacities updatedNetworkElementsCapacities = new NetworkElementsCapacities();
        updatedNetworkElementsCapacities.setId(id);

        // When
        String result = networkElementsCapacitiesService.updateNetworkElementsCapacities(updatedNetworkElementsCapacities, id);

        // Then
        assertEquals("updated", result);
        verify(networkElementsCapacitiesRepo).saveAndFlush(existingNetworkElementsCapacities);
    }

    @Test
    void testDeleteNetworkElementsCapacities() {
        // Given
        int id = 1;

        // When
        String result = networkElementsCapacitiesService.deleteNetworkElementsCapacities(id);

        // Then
        assertEquals("deleted", result);
        verify(networkElementsCapacitiesRepo).deleteById(id);
    }

    @Test
    void testGetAllNetworkElementsCapacities() {
        // Given
        List<NetworkElementsCapacities> networkElementsCapacitiesList = Arrays.asList(new NetworkElementsCapacities(), new NetworkElementsCapacities());
        when(networkElementsCapacitiesRepo.findAll()).thenReturn(networkElementsCapacitiesList);

        // When
        List<NetworkElementsCapacities> result = networkElementsCapacitiesService.getAllNetworkElementsCapacities();

        // Then
        assertEquals(networkElementsCapacitiesList, result);
        verify(networkElementsCapacitiesRepo).findAll();
    }

    @Test
    void testGetNetworkElementsCapacitiesById() {
        // Given
        int id = 1;
        NetworkElementsCapacities expectedNetworkElementsCapacities = new NetworkElementsCapacities();
        when(networkElementsCapacitiesRepo.findById(id)).thenReturn(Optional.of(expectedNetworkElementsCapacities));

        // When
        NetworkElementsCapacities result = networkElementsCapacitiesService.getNetworkElementsCapacitiesById(id);

        // Then
        assertEquals(expectedNetworkElementsCapacities, result);
        verify(networkElementsCapacitiesRepo).findById(id);
    }

    @Test
    void testFindByDeviceName() {
        // Given
        String name = "exampleName";
        NetworkElementsCapacities expectedNetworkElementsCapacities = new NetworkElementsCapacities();
        when(networkElementsCapacitiesRepo.findByName(name)).thenReturn(expectedNetworkElementsCapacities);

        // When
        NetworkElementsCapacities result = networkElementsCapacitiesService.findByDeviceName(name);

        // Then
        assertEquals(expectedNetworkElementsCapacities, result);
        verify(networkElementsCapacitiesRepo).findByName(name);
    }
}
