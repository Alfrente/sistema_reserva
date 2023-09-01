package com.arroyo.sistema_de_reservas.service;

import java.util.List;
import java.util.Optional;

public interface ICrudService<I, O>{
    List<O> getAll();
    Optional<O> getById(Long id);
    O save (I i);
    O update(I i);
    void deleteById(Long id);
    Optional<O> findByPasajeroId(Long id);
    O save (String s);
}
