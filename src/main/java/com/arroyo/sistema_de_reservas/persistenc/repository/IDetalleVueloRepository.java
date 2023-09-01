package com.arroyo.sistema_de_reservas.persistenc.repository;

import com.arroyo.sistema_de_reservas.persistenc.entity.DetalleVuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleVueloRepository extends JpaRepository<DetalleVuelo, Long> {
    DetalleVuelo findByPasajeroId(Long pasajeroId);
}
