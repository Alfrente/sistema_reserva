package com.arroyo.sistema_de_reservas.persistenc.repository;

import com.arroyo.sistema_de_reservas.persistenc.entity.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPasajeroRepository extends JpaRepository<Pasajero, Long> {
}
