package com.firmalogistyczna.FirmaLogistyczna.controller;

import com.firmalogistyczna.FirmaLogistyczna.entity.dto.KlientDto;
import com.firmalogistyczna.FirmaLogistyczna.entity.dto.ZgloszenieDto;
import com.firmalogistyczna.FirmaLogistyczna.service.ZgloszenieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.firmalogistyczna.FirmaLogistyczna.configuration.Constants.API_BASE_CONSTANT;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = API_BASE_CONSTANT + "/zgloszenia", produces = MediaType.APPLICATION_JSON_VALUE)
public class ZgloszenieController {
    private final ZgloszenieService service;

    @GetMapping("/all")
    public List<ZgloszenieDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{idZgloszenia}")
    public ZgloszenieDto getById(@PathVariable Long idZgloszenia) {
        return service.getById(idZgloszenia);
    }

    @PostMapping
    public ZgloszenieDto add(@RequestBody ZgloszenieDto zgloszenieDto) {
        return service.add(zgloszenieDto);
    }

    @PutMapping
    public ZgloszenieDto update(@RequestBody ZgloszenieDto zgloszenieDto) {
        return service.update(zgloszenieDto);
    }
}
