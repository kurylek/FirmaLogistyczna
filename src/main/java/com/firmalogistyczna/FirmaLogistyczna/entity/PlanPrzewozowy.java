package com.firmalogistyczna.FirmaLogistyczna.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class PlanPrzewozowy {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idPlanu;

    @OneToMany(mappedBy = "planPrzewozowy")
    private List<Zgloszenie> zgloszenie;

}
