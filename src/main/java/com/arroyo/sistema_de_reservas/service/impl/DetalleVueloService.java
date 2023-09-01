package com.arroyo.sistema_de_reservas.service.impl;

import com.arroyo.sistema_de_reservas.mappers.response.IDetalleVueloResponseMapper;
import com.arroyo.sistema_de_reservas.persistenc.entity.DetalleVuelo;
import com.arroyo.sistema_de_reservas.persistenc.repository.IDetalleVueloRepository;
import com.arroyo.sistema_de_reservas.service.ICrudService;
import com.arroyo.sistema_de_reservas.service.dao.response.DetalleVueloResponseDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVueloService implements ICrudService<DetalleVuelo, DetalleVueloResponseDao> {

    private final IDetalleVueloRepository repository;
    private final IDetalleVueloResponseMapper mapper;

    public DetalleVueloService(IDetalleVueloRepository repository, IDetalleVueloResponseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public DetalleVueloResponseDao save(DetalleVuelo detalleVuelo) {
        return mapper.toDetalleVueloDao(repository.save(detalleVuelo));
    }

    @Override
    public List<DetalleVueloResponseDao> getAll() {
        return mapper.toDetalleVueloDaoList(repository.findAll());
    }

    @Override
    public Optional<DetalleVueloResponseDao> getById(Long id) {
        return Optional.ofNullable(mapper.toDetalleVueloDao((repository.findById(id)).orElse(null)));
    }

    @Override
    public DetalleVueloResponseDao update(DetalleVuelo detalleVuelo) {
        return mapper.toDetalleVueloDao(repository.save(detalleVuelo));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Optional<DetalleVueloResponseDao> findByPasajeroId(Long id){
        return Optional.ofNullable(mapper.toDetalleVueloDao(repository.findByPasajeroId(id)));
    }

    @Override
    public DetalleVueloResponseDao save(String s) {
        return null;
    }
}
