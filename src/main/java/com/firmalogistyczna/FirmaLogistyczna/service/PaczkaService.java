package com.firmalogistyczna.FirmaLogistyczna.service;

import com.firmalogistyczna.FirmaLogistyczna.entity.dto.PaczkaDto;

import java.util.List;

public interface PaczkaService {

    List<PaczkaDto> getAll();
    PaczkaDto getById(Long idPaczki);
    PaczkaDto add(PaczkaDto paczkaDto);
    PaczkaDto update(PaczkaDto paczkaDto);
}
