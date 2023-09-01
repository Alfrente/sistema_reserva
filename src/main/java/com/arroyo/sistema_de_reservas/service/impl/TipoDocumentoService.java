package com.arroyo.sistema_de_reservas.service.impl;

import com.arroyo.sistema_de_reservas.mappers.response.ITipoDocumentoResponseMapper;
import com.arroyo.sistema_de_reservas.persistenc.entity.TipoDocumento;
import com.arroyo.sistema_de_reservas.persistenc.repository.ITipoDocumentoRepository;
import com.arroyo.sistema_de_reservas.service.ICrudService;
import com.arroyo.sistema_de_reservas.service.dao.response.TipoDocumentoResponseDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService implements ICrudService<TipoDocumento, TipoDocumentoResponseDao> {

    private final ITipoDocumentoRepository repository;
    private final ITipoDocumentoResponseMapper mapper;

    public TipoDocumentoService(ITipoDocumentoRepository repository, ITipoDocumentoResponseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<TipoDocumentoResponseDao> getAll() {
        return mapper.toTipoDocumentoDaoList(repository.findAll());
    }

    @Override
    public Optional<TipoDocumentoResponseDao> getById(Long id) {
        return Optional.ofNullable(mapper.toTipoDocumentoDao(repository.findById(id).orElse(null)));
    }

    @Override
    public TipoDocumentoResponseDao save(TipoDocumento tipoDocumento) {
        return mapper.toTipoDocumentoDao(repository.save(tipoDocumento));
    }

    @Override
    public TipoDocumentoResponseDao update(TipoDocumento tipoDocumento) {
        return mapper.toTipoDocumentoDao(repository.save(tipoDocumento));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TipoDocumentoResponseDao> findByPasajeroId(Long id) {
        return Optional.empty();
    }

    @Override
    public TipoDocumentoResponseDao save(String tipoDocumento) {
        TipoDocumento documento = new TipoDocumento(null, tipoDocumento);
        return mapper.toTipoDocumentoDao(repository.save(documento));
    }


}
