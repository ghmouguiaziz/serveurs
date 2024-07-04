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
public class StorageCapacities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStorageCapacities;
    private String classOfStorage ;
    private int rnge ;
    private int diskNumber;
    private int diskVolume;
    private int volumeBrut;
    private int volumeNet;
    private int sfps;
    private String name ;
    private String descr ;

}
