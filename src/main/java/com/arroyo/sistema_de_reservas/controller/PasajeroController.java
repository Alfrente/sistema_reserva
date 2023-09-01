package com.arroyo.sistema_de_reservas.controller;

import com.arroyo.sistema_de_reservas.persistenc.entity.Pasajero;
import com.arroyo.sistema_de_reservas.service.ICrudService;
import com.arroyo.sistema_de_reservas.service.dao.response.PasajeroResponseDao;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Pasajeros")
public class PasajeroController {

    private final ICrudService<Pasajero, PasajeroResponseDao> service;

    public PasajeroController(ICrudService<Pasajero, PasajeroResponseDao> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<PasajeroResponseDao>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<PasajeroResponseDao>> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PasajeroResponseDao> save(@RequestBody @Valid Pasajero pasajero) {
        return new ResponseEntity<>(service.save(pasajero), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PasajeroResponseDao> update(@PathVariable Long id, @RequestBody @Valid Pasajero pasajero) {
        return new ResponseEntity<>(service.update(pasajero), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return HttpStatus.OK;
    }
}
