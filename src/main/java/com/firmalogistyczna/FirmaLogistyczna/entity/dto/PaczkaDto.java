package com.firmalogistyczna.FirmaLogistyczna.entity.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class PaczkaDto {

    private Long idPaczki;
    private String numerPaczki;
    private String wymiary;
    private Long idZgloszenia;
}
