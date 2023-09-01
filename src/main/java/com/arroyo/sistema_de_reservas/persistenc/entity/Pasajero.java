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
public class Pasajero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 30)
    private String nombre;
    @Column(unique = true, nullable = false, length = 10)
    private String numeroDocumento;
    private Character genero;
    private LocalDate fechaNacimiento;
    @Column(nullable = false)
    private Long tipoDocumentoId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipoDocumentoId", insertable = false, updatable = false)
    private TipoDocumento tipoDocumento;
}
