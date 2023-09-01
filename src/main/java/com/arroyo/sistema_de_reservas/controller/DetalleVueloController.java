package com.arroyo.sistema_de_reservas.controller;

import com.arroyo.sistema_de_reservas.persistenc.entity.DetalleVuelo;
import com.arroyo.sistema_de_reservas.service.ICrudService;
import com.arroyo.sistema_de_reservas.service.dao.response.DetalleVueloResponseDao;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalle_vuelos")
public class DetalleVueloController {

    private final ICrudService<DetalleVuelo, DetalleVueloResponseDao> service;

    public DetalleVueloController(ICrudService<DetalleVuelo, DetalleVueloResponseDao> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DetalleVueloResponseDao>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<DetalleVueloResponseDao>> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @GetMapping("/pasajero/{id}")
    public ResponseEntity<Optional<DetalleVueloResponseDao>> findByPasajeroId(@PathVariable Long id) {
        return new ResponseEntity<>(service.findByPasajeroId(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DetalleVueloResponseDao> save(@RequestBody @Valid DetalleVuelo detalleVuelo) {
        return new ResponseEntity<>(service.save(detalleVuelo), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<DetalleVueloResponseDao> update(@PathVariable Long id, @RequestBody @Valid DetalleVuelo detalleVuelo) {
        return new ResponseEntity<>(service.update(detalleVuelo), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return HttpStatus.OK;
    }
}
