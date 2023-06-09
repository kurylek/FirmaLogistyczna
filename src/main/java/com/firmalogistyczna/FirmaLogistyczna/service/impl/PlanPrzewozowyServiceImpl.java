package com.firmalogistyczna.FirmaLogistyczna.service.impl;

import com.firmalogistyczna.FirmaLogistyczna.entity.PlanPrzewozowy;
import com.firmalogistyczna.FirmaLogistyczna.entity.Zgloszenie;
import com.firmalogistyczna.FirmaLogistyczna.entity.dto.PlanPrzewozowyDto;
import com.firmalogistyczna.FirmaLogistyczna.mapper.PlanPrzewozowyMapper;
import com.firmalogistyczna.FirmaLogistyczna.repository.PlanPrzewozowyRepository;
import com.firmalogistyczna.FirmaLogistyczna.repository.ZgloszenieRepository;
import com.firmalogistyczna.FirmaLogistyczna.service.PlanPrzewozowyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class PlanPrzewozowyServiceImpl implements PlanPrzewozowyService {

    private final PlanPrzewozowyRepository repository;
    private final ZgloszenieRepository zgloszenieRepository;
    private final PlanPrzewozowyMapper mapper;

    @Override
    public List<PlanPrzewozowyDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PlanPrzewozowyDto getById(Long idPlanuPrzewozowego) {
        return mapper.toDto(repository.findById(idPlanuPrzewozowego).orElseThrow(EntityNotFoundException::new));
    }

    @Override
    public PlanPrzewozowyDto add(PlanPrzewozowyDto planPrzewozowyDto) {
        PlanPrzewozowy planPrzewozowy = repository.save(PlanPrzewozowy.builder()
                .zgloszenie(new ArrayList<>())
                .build());

        List<Zgloszenie> listaZgloszen = new ArrayList<>();
        PlanPrzewozowy finalPlanPrzewozowy = planPrzewozowy;
        planPrzewozowyDto.getIdZgloszenia().forEach(idZgloszenia -> {
            Zgloszenie zgloszenie = zgloszenieRepository.findById(idZgloszenia).orElseThrow(EntityNotFoundException::new);
            listaZgloszen.add(zgloszenie);
            zgloszenie.setPlanPrzewozowy(finalPlanPrzewozowy);
            zgloszenieRepository.save(zgloszenie);
        });

        planPrzewozowy.setZgloszenie(listaZgloszen);
        planPrzewozowy = repository.save(planPrzewozowy);

        return mapper.toDto(planPrzewozowy);
    }

    @Override
    public PlanPrzewozowyDto update(PlanPrzewozowyDto planPrzewozowyDto) {
        return null;
    }
}
