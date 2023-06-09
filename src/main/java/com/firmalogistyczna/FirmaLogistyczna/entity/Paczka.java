package com.firmalogistyczna.FirmaLogistyczna.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Paczka {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idPaczki;
    private String numerPaczki;
    private String wymiary;

    @OneToOne
    private Zgloszenie zgloszenie;
}
