package com.firmalogistyczna.FirmaLogistyczna.entity.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PlanPrzewozowyDto {

    private Long idPlanu;
    private List<Long> idZgloszenia;

}
