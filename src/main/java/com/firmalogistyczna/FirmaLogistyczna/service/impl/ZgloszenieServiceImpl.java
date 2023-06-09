package com.firmalogistyczna.FirmaLogistyczna.service.impl;

import com.firmalogistyczna.FirmaLogistyczna.entity.Zgloszenie;
import com.firmalogistyczna.FirmaLogistyczna.entity.dto.ZgloszenieDto;
import com.firmalogistyczna.FirmaLogistyczna.mapper.ZgloszenieMapper;
import com.firmalogistyczna.FirmaLogistyczna.repository.KlientRepository;
import com.firmalogistyczna.FirmaLogistyczna.repository.PaczkaRepository;
import com.firmalogistyczna.FirmaLogistyczna.repository.ZgloszenieRepository;
import com.firmalogistyczna.FirmaLogistyczna.service.ZgloszenieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ZgloszenieServiceImpl implements ZgloszenieService {

    private final ZgloszenieRepository repository;
    private final KlientRepository klientRepository;
    private final ZgloszenieMapper mapper;

    @Override
    public List<ZgloszenieDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ZgloszenieDto getById(Long idZgloszenia) {
        return mapper.toDto(repository.findById(idZgloszenia).orElseThrow(EntityNotFoundException::new));
    }

    @Override
    public ZgloszenieDto add(ZgloszenieDto zgloszenieDto) {
        return mapper.toDto(repository.save(Zgloszenie.builder()
                        .nadawca(klientRepository.getReferenceById(zgloszenieDto.getIdNadawcy()))
                        .odbiorca(klientRepository.getReferenceById(zgloszenieDto.getIdOdbiorcy()))
                        .paczka(null)
                        .planPrzewozowy(null)
                .build()));
    }

    @Override
    public ZgloszenieDto update(ZgloszenieDto zgloszenieDto) {
        return null;
    }
}
