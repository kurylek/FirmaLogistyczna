package com.firmalogistyczna.FirmaLogistyczna.mapper;

import com.firmalogistyczna.FirmaLogistyczna.entity.Paczka;
import com.firmalogistyczna.FirmaLogistyczna.entity.dto.PaczkaDto;
import org.springframework.stereotype.Component;

@Component
public class PaczkaMapper {

    public PaczkaDto toDto(Paczka paczka) {
        return PaczkaDto.builder()
                .idPaczki(paczka.getIdPaczki())
                .numerPaczki(paczka.getNumerPaczki())
                .wymiary(paczka.getWymiary())
                .idZgloszenia(paczka.getZgloszenie() == null ? null : paczka.getZgloszenie().getIdZgloszenia())
                .build();
    }
}
