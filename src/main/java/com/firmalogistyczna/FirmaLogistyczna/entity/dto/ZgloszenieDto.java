package com.firmalogistyczna.FirmaLogistyczna.entity.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ZgloszenieDto {

    private Long idZgloszenia;

    private Long idNadawcy;
    private Long idOdbiorcy;
    private Long idPaczki;
    private Long idPlanuPrzewozowego;
}
