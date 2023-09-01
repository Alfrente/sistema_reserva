package com.arroyo.sistema_de_reservas.service.dao.request;

import com.arroyo.sistema_de_reservas.service.dao.TipoDocumentoEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PasajeroRequestDao {

    @NotNull(message = "El nombre es necesario")
    @NotBlank(message = "El nombre es necesario")
    @Size(max = 20, message = "El nombre supera el rango admitido")
    private String nombre;
    private TipoDocumentoEnum tipoDocumento;
    @NotNull(message = "El numero del documento es necesario")
    @NotBlank(message = "El numero del documento es necesario")
    @Size(min = 10, max = 10, message = "El nombre no cumple con el rango admitido")
    private String numeroDocumento;
    private Character genero;
    private LocalDate fechaNacimiento;

}
