package com.firmalogistyczna.FirmaLogistyczna.service;

import com.firmalogistyczna.FirmaLogistyczna.entity.dto.PlanPrzewozowyDto;

import java.util.List;

public interface PlanPrzewozowyService {

    List<PlanPrzewozowyDto> getAll();
    PlanPrzewozowyDto getById(Long idPlanuPrzeowzowego);
    PlanPrzewozowyDto add(PlanPrzewozowyDto planPrzewozowyDto);
    PlanPrzewozowyDto update(PlanPrzewozowyDto planPrzewozowyDto);
}
