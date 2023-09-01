package com.arroyo.sistema_de_reservas.mappers.request;

import com.arroyo.sistema_de_reservas.persistenc.entity.Pasajero;
import com.arroyo.sistema_de_reservas.service.dao.response.PasajeroResponseDao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = IPasajeroRequestMapper.class)
public interface IPasajeroRequestMapper {

    @Mapping(target = "tipoDocumentoResponseDao", source = "tipoDocumento")
    @Mapping(target = "linkDetalleVuelo", source = "tipoDocumentoId")
    PasajeroResponseDao toPasajeroDao (Pasajero pasajero);
    List<PasajeroResponseDao> toPasajeroDaoList (List<Pasajero> pasajero);


}
