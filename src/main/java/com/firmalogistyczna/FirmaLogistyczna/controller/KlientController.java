package com.firmalogistyczna.FirmaLogistyczna.controller;

import com.firmalogistyczna.FirmaLogistyczna.entity.dto.KlientDto;
import com.firmalogistyczna.FirmaLogistyczna.service.KlientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.firmalogistyczna.FirmaLogistyczna.configuration.Constants.API_BASE_CONSTANT;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = API_BASE_CONSTANT + "/klienci", produces = MediaType.APPLICATION_JSON_VALUE)
public class KlientController {
    private final KlientService service;

    @GetMapping("/all")
    public List<KlientDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{idKlienta}")
    public KlientDto getById(@PathVariable Long idKlienta) {
        return service.getById(idKlienta);
    }

    @PostMapping
    public KlientDto add(@RequestBody KlientDto klientDto) {
        return service.add(klientDto);
    }

    @PutMapping
    public KlientDto updte(@RequestBody KlientDto klientDto) {
        return service.update(klientDto);
    }
}
