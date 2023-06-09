package com.firmalogistyczna.FirmaLogistyczna.controller;

import com.firmalogistyczna.FirmaLogistyczna.entity.dto.PaczkaDto;
import com.firmalogistyczna.FirmaLogistyczna.service.PaczkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.firmalogistyczna.FirmaLogistyczna.configuration.Constants.API_BASE_CONSTANT;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = API_BASE_CONSTANT + "/paczki", produces = MediaType.APPLICATION_JSON_VALUE)
public class PaczkaController {
    private final PaczkaService service;

    @GetMapping("/all")
    public List<PaczkaDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{idPaczki}")
    public PaczkaDto getById(@PathVariable Long idPaczki) {
        return service.getById(idPaczki);
    }

    @PostMapping
    public PaczkaDto add(@RequestBody PaczkaDto paczkaDto) {
        return service.add(paczkaDto);
    }
}
