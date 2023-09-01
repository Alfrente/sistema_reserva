package com.arroyo.sistema_de_reservas.service.dao.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVueloRequestDao {

    @NotNull(message = "El medio de transporte es necesario")
    @NotBlank(message = "El medio de transporte es necesario")
    private String medioTransporte;
    @Max(value = 10, message = "Capacidad maxima superada")
    private Integer numeroAsiento;
    //private LocalTime horaLlegada;
    //private LocalTime horarioSalida;
    private LocalDate fechaSalida;
    @NotBlank(message = "El lugar de salida es necesario")
    private String lugarSalida;
}
