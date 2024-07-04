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
public class ComputeCapacities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComputeCapacities;
    private String classOfCompute ;
    private String name ;
    private String descr ;
    private int cpu ;
    private int maxvcpu;
    private int maxvram;
    private int sfps;

}
