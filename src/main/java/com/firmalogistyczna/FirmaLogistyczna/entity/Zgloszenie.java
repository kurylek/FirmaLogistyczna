package com.firmalogistyczna.FirmaLogistyczna.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
