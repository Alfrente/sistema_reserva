package com.arroyo.sistema_de_reservas.service.impl;

import com.arroyo.sistema_de_reservas.mappers.response.IPasajeroResponseMapper;
import com.arroyo.sistema_de_reservas.persistenc.entity.Pasajero;
import com.arroyo.sistema_de_reservas.persistenc.repository.IPasajeroRepository;
import com.arroyo.sistema_de_reservas.service.ICrudService;
import com.arroyo.sistema_de_reservas.service.dao.response.PasajeroResponseDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasajeroService implements ICrudService<Pasajero, PasajeroResponseDao> {

    private final IPasajeroRepository repository;
    private final IPasajeroResponseMapper mapper;

    public PasajeroService(IPasajeroRepository repository, IPasajeroResponseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public PasajeroResponseDao save(Pasajero pasajero) {
        return mapper.toPasajeroDao(repository.save(pasajero));
    }

    @Override
    public List<PasajeroResponseDao> getAll() {
        return mapper.toPasajeroDaoList(repository.findAll());
    }

    @Override
    public Optional<PasajeroResponseDao> getById(Long id) {
        return Optional.ofNullable(mapper.toPasajeroDao(repository.findById(id).orElse(null)));
    }

    @Override
    public PasajeroResponseDao update(Pasajero pasajero) {
        return mapper.toPasajeroDao(repository.save(pasajero));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<PasajeroResponseDao> findByPasajeroId(Long id) {
        return Optional.empty();
    }

    @Override
    public PasajeroResponseDao save(String s) {
        return null;
    }


}
