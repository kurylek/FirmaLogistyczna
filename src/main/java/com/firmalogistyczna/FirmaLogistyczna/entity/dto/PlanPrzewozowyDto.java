package com.firmalogistyczna.FirmaLogistyczna.entity.dto;

import lombok.Data;

import java.util.List;

@Data
public class PlanPrzewozowyDto {

    private Long idPlanu;
    private List<Long> idZgloszenia;

}
