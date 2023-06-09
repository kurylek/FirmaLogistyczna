package com.firmalogistyczna.FirmaLogistyczna.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanPrzewozowy {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idPlanu;

    @OneToMany(mappedBy = "planPrzewozowy")
    private List<Zgloszenie> zgloszenie;

}
