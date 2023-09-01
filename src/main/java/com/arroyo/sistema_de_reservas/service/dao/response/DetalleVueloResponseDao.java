package com.arroyo.sistema_de_reservas.service.dao.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVueloResponseDao {

    private String medioTransporte;
    private Integer numeroAsiento;
    //private LocalTime horaLlegada;
    //private LocalTime horarioSalida;
    private LocalDate fechaSalida;
    private String lugarSalida;
    private Long linkPasajero;

}
