package com.firmalogistyczna.FirmaLogistyczna.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Klient {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idKlienta;
    private String imie;
    private String naziwsko;
    private String adres;


    @OneToMany(mappedBy = "nadawca")
    private List<Zgloszenie> nadaneZgloszenia;
    @OneToMany(mappedBy = "odbiorca")
    private List<Zgloszenie> odebraneZgloszenia;
}
