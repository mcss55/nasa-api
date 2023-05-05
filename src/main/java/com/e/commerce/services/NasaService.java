package com.e.commerce.services;

import com.e.commerce.NasaRepository;
import com.e.commerce.model.Nasa;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NasaService {

    private final NasaRepository nasaRepository;

    public ResponseEntity<Nasa> getById(String id) {
        if (nasaRepository.findById(id).isPresent()) {

            return new ResponseEntity<>(nasaRepository.findById(id).get(), HttpStatus.OK);
        }
        throw new RuntimeException("Data not found");
    }

    public ResponseEntity<List<Nasa>> getByAll() {
        return new ResponseEntity<>(nasaRepository.findAll(), HttpStatus.OK);
    }
}
