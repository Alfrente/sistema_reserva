package com.arroyo.sistema_de_reservas.service.dao.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PasajeroResponseDao {

    private String nombre;
    private String numeroDocumento;
    private Character genero;
    private LocalDate fechaNacimiento;
    private String linkDetalleVuelo;

    private TipoDocumentoResponseDao tipoDocumentoResponseDao;

}
