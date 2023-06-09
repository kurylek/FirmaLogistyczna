package com.firmalogistyczna.FirmaLogistyczna.mapper;

import com.firmalogistyczna.FirmaLogistyczna.entity.Klient;
import com.firmalogistyczna.FirmaLogistyczna.entity.Zgloszenie;
import com.firmalogistyczna.FirmaLogistyczna.entity.dto.KlientDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class KlientMapper {

    public KlientDto toDto(Klient klient) {
        return KlientDto.builder()
                .idKlienta(klient.getIdKlienta())
                .imie(klient.getImie())
                .naziwsko(klient.getNaziwsko())
                .adres(klient.getAdres())
                .idNadanychZgloszen(klient.getNadaneZgloszenia().stream()
                        .map(Zgloszenie::getIdZgloszenia)
                        .collect(Collectors.toList()))
                .idOdebranychZgloszen(klient.getOdebraneZgloszenia().stream()
                        .map(Zgloszenie::getIdZgloszenia)
                        .collect(Collectors.toList()))
                .build();
    }
}
