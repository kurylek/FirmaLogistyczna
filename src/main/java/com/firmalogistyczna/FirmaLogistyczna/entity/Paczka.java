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
public class Paczka {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idPaczki;
    private String numerPaczki;
    private String wymiary;

    @OneToOne
    private Zgloszenie zgloszenie;
}
