package com.sofrecom.serveurs.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter

@NoArgsConstructor
@Entity
public class ControlNetworkCapacities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idControlNetworkCapacities;
    private String classOfcontrolNetwork ;
    private int sfps;

}
