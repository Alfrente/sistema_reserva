package com.arroyo.sistema_de_reservas.mappers.response;

import com.arroyo.sistema_de_reservas.persistenc.entity.DetalleVuelo;
import com.arroyo.sistema_de_reservas.service.dao.response.DetalleVueloResponseDao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDetalleVueloResponseMapper {

    @Mapping(target = "linkPasajero", source = "pasajeroId")
    DetalleVueloResponseDao toDetalleVueloDao(DetalleVuelo detalleVuelo);

    List<DetalleVueloResponseDao> toDetalleVueloDaoList(List<DetalleVuelo> detalleVueloList);
}
