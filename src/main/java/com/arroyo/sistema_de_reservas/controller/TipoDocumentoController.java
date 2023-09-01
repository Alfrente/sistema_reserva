package com.arroyo.sistema_de_reservas.controller;

import com.arroyo.sistema_de_reservas.persistenc.entity.TipoDocumento;
import com.arroyo.sistema_de_reservas.service.ICrudService;
import com.arroyo.sistema_de_reservas.service.dao.response.TipoDocumentoResponseDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipos_documento")
public class TipoDocumentoController {

    private final ICrudService<TipoDocumento, TipoDocumentoResponseDao> service;

    public TipoDocumentoController(ICrudService<TipoDocumento, TipoDocumentoResponseDao> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TipoDocumentoResponseDao>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<TipoDocumentoResponseDao>> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TipoDocumentoResponseDao> save(@RequestParam String tipoDocumento) {
        return new ResponseEntity<>(service.save(tipoDocumento), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<TipoDocumentoResponseDao> update(@RequestParam String tipoDocumento) {
        return new ResponseEntity<>(service.save(tipoDocumento), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return HttpStatus.OK;
    }
}
