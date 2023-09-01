package com.arroyo.sistema_de_reservas.mappers.response;

import com.arroyo.sistema_de_reservas.persistenc.entity.TipoDocumento;
import com.arroyo.sistema_de_reservas.service.dao.response.TipoDocumentoResponseDao;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITipoDocumentoResponseMapper {
    TipoDocumentoResponseDao toTipoDocumentoDao (TipoDocumento tipoDocumento);
    List<TipoDocumentoResponseDao> toTipoDocumentoDaoList (List<TipoDocumento> tipoDocumento);
}
