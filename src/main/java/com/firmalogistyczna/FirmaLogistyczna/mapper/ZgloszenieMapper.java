package com.firmalogistyczna.FirmaLogistyczna.mapper;

import com.firmalogistyczna.FirmaLogistyczna.entity.Zgloszenie;
import com.firmalogistyczna.FirmaLogistyczna.entity.dto.ZgloszenieDto;
import org.springframework.stereotype.Component;

@Component
public class ZgloszenieMapper {

    public ZgloszenieDto toDto(Zgloszenie zgloszenie) {
        return ZgloszenieDto.builder()
                .idZgloszenia(zgloszenie.getIdZgloszenia())
                .idNadawcy(zgloszenie.getNadawca() == null ? null : zgloszenie.getNadawca().getIdKlienta())
                .idOdbiorcy(zgloszenie.getOdbiorca() == null ? null : zgloszenie.getOdbiorca().getIdKlienta())
                .idPaczki(zgloszenie.getPaczka() == null ? null : zgloszenie.getPaczka().getIdPaczki())
                .idPlanuPrzewozowego(zgloszenie.getPlanPrzewozowy() == null ? null : zgloszenie.getPlanPrzewozowy().getIdPlanu())
                .build();
    }
}
