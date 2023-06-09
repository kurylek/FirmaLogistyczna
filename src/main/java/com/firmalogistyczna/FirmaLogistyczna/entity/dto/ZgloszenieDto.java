package com.firmalogistyczna.FirmaLogistyczna.entity.dto;

import lombok.Data;

@Data
public class ZgloszenieDto {

    private Long idZgloszenia;

    private Long idNadawcy;
    private Long idOdbiorcy;
    private Long idPaczki;
    private Long idPlanuPrzewozowego;
}
