package com.arroyo.sistema_de_reservas.persistenc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class DetalleVuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String medioTransporte;
    @Column(nullable = false)
    private Integer numeroAsiento;
    //private LocalTime horaLlegada;
    //private LocalTime horarioSalida;
    private LocalDate fechaSalida;
    private String lugarSalida;
    private Long pasajeroId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pasajeroId", insertable = false, updatable = false)
    private Pasajero pasajero;

}
