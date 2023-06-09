package com.firmalogistyczna.FirmaLogistyczna.entity.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class KlientDto {

    private Long idKlienta;
    private String imie;
    private String naziwsko;
    private String adres;
    private List<Long> idNadanychZgloszen;
    private List<Long> idOdebranychZgloszen;
}
