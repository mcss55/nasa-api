package com.e.commerce.controller;

import com.e.commerce.model.Nasa;
import com.e.commerce.services.NasaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/nasa")
@RequiredArgsConstructor
public class NasaController {

    private final NasaService nasaService;

    @GetMapping("/{id}")
    public ResponseEntity<Nasa> getById(@PathVariable String id){
        return nasaService.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<Nasa>> getAll(){
        return nasaService.getByAll();
    }

}
