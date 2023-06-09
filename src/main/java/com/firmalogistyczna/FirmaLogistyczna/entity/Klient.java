package com.firmalogistyczna.FirmaLogistyczna.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Klient {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idKlienta;
    private String imie;
    private String naziwsko;
    private String adres;
}
