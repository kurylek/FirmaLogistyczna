package com.firmalogistyczna.FirmaLogistyczna.controller;

import com.firmalogistyczna.FirmaLogistyczna.entity.dto.PlanPrzewozowyDto;
import com.firmalogistyczna.FirmaLogistyczna.service.PlanPrzewozowyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.firmalogistyczna.FirmaLogistyczna.configuration.Constants.API_BASE_CONSTANT;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = API_BASE_CONSTANT + "/planPrzewozowy", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlanPrzewozowyController {
    private final PlanPrzewozowyService service;

    @GetMapping("/all")
    public List<PlanPrzewozowyDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{idPlanuPrzewozowego}")
    public PlanPrzewozowyDto getById(@PathVariable Long idPlanuPrzewozowego) {
        return service.getById(idPlanuPrzewozowego);
    }

    @PostMapping
    public PlanPrzewozowyDto add(@RequestBody PlanPrzewozowyDto planPrzewozowyDto) {
        return service.add(planPrzewozowyDto);
    }
}
