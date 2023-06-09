package com.firmalogistyczna.FirmaLogistyczna.mapper;

import com.firmalogistyczna.FirmaLogistyczna.entity.PlanPrzewozowy;
import com.firmalogistyczna.FirmaLogistyczna.entity.Zgloszenie;
import com.firmalogistyczna.FirmaLogistyczna.entity.dto.PlanPrzewozowyDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class PlanPrzewozowyMapper {

    public PlanPrzewozowyDto toDto(PlanPrzewozowy planPrzewozowy) {
        return PlanPrzewozowyDto.builder()
                .idPlanu(planPrzewozowy.getIdPlanu())
                .idZgloszenia(planPrzewozowy.getZgloszenie().stream().map(Zgloszenie::getIdZgloszenia).collect(Collectors.toList()))
                .build();
    }
}
