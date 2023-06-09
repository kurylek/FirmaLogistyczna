package com.firmalogistyczna.FirmaLogistyczna.service;

import com.firmalogistyczna.FirmaLogistyczna.entity.dto.ZgloszenieDto;

import java.util.List;

public interface ZgloszenieService {

    List<ZgloszenieDto> getAll();
    ZgloszenieDto getById(Long idZgloszenia);
    ZgloszenieDto add(ZgloszenieDto zgloszenieDto);
    ZgloszenieDto update(ZgloszenieDto zgloszenieDto);
}
