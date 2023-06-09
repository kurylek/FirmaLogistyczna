package com.firmalogistyczna.FirmaLogistyczna.entity.dto;

import lombok.Data;


@Data
public class PaczkaDto {

    private Long idPaczki;
    private String numerPaczki;
    private String wymiary;
    private Long idZgloszenia;
}
