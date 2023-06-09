package com.firmalogistyczna.FirmaLogistyczna.service.impl;

import com.firmalogistyczna.FirmaLogistyczna.entity.Klient;
import com.firmalogistyczna.FirmaLogistyczna.entity.dto.KlientDto;
import com.firmalogistyczna.FirmaLogistyczna.mapper.KlientMapper;
import com.firmalogistyczna.FirmaLogistyczna.repository.KlientRepository;
import com.firmalogistyczna.FirmaLogistyczna.service.KlientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class KlientServiceImpl implements KlientService {

    private final KlientRepository repository;
    private final KlientMapper mapper;

    @Override
    public List<KlientDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public KlientDto getById(Long idKlienta) {
        return mapper.toDto(repository.findById(idKlienta).orElseThrow(EntityNotFoundException::new));
    }

    @Override
    public KlientDto add(KlientDto klientDto) {
        return mapper.toDto(repository.save(Klient.builder()
                        .imie(klientDto.getImie())
                        .naziwsko(klientDto.getNaziwsko())
                        .adres(klientDto.getAdres())
                        .nadaneZgloszenia(new ArrayList<>())
                        .odebraneZgloszenia(new ArrayList<>())
                .build()));
    }

    @Override
    public KlientDto update(KlientDto klientDto) {
        return null;
    }
}
