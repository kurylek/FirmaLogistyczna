package com.firmalogistyczna.FirmaLogistyczna.service;

import com.firmalogistyczna.FirmaLogistyczna.entity.dto.KlientDto;

import java.util.List;

public interface KlientService {

    List<KlientDto> getAll();
    KlientDto getById(Long idKlienta);
    KlientDto add(KlientDto klientDto);
    KlientDto update(KlientDto klientDto);
}
