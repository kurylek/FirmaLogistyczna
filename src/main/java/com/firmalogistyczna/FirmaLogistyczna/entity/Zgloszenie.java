package com.firmalogistyczna.FirmaLogistyczna.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Zgloszenie {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idZgloszenia;

    @ManyToOne
    private Klient nadawca;
    @ManyToOne
    private Klient odbiorca;
    @OneToOne
    private Paczka paczka;
    @ManyToOne
    private PlanPrzewozowy planPrzewozowy;
}
