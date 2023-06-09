package com.firmalogistyczna.FirmaLogistyczna.service.impl;

import com.firmalogistyczna.FirmaLogistyczna.entity.Paczka;
import com.firmalogistyczna.FirmaLogistyczna.entity.Zgloszenie;
import com.firmalogistyczna.FirmaLogistyczna.entity.dto.PaczkaDto;
import com.firmalogistyczna.FirmaLogistyczna.mapper.PaczkaMapper;
import com.firmalogistyczna.FirmaLogistyczna.repository.PaczkaRepository;
import com.firmalogistyczna.FirmaLogistyczna.repository.ZgloszenieRepository;
import com.firmalogistyczna.FirmaLogistyczna.service.PaczkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class PaczkaServiceImpl implements PaczkaService {

    private final PaczkaRepository repository;
    private final ZgloszenieRepository zgloszenieRepository;
    private final PaczkaMapper mapper;

    @Override
    public List<PaczkaDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PaczkaDto getById(Long idPaczki) {
        return mapper.toDto(repository.findById(idPaczki).orElseThrow(EntityNotFoundException::new));
    }

    @Override
    public PaczkaDto add(PaczkaDto paczkaDto) {
        Paczka paczka = repository.save(Paczka.builder()
                        .wymiary(paczkaDto.getWymiary())
                        .zgloszenie(zgloszenieRepository.getReferenceById(paczkaDto.getIdZgloszenia()))
                .build());

        Zgloszenie zgloszenie= zgloszenieRepository.getReferenceById(paczkaDto.getIdZgloszenia());
        zgloszenie.setPaczka(paczka);
        zgloszenieRepository.save(zgloszenie);

        return mapper.toDto(paczka);
    }

    @Override
    public PaczkaDto update(PaczkaDto paczkaDto) {
        return null;
    }
}
