package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObavestenjeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.ObavestenjeMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Obavestenje;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.ObavestenjeRepo;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.ObavestenjeService;

import java.util.Optional;

@Service

public class ObavestenjeServiceImpl implements ObavestenjeService {

    private ObavestenjeMapper mapper;
    private ObavestenjeRepo repository;

    public ObavestenjeServiceImpl(ObavestenjeMapper mapper, ObavestenjeRepo repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public ObavestenjeMapper getMapper() {
        return mapper;
    }

    public void setMapper(ObavestenjeMapper mapper) {
        this.mapper = mapper;
    }

    public ObavestenjeRepo getRepository() {
        return repository;
    }

    public void setRepository(ObavestenjeRepo repository) {
        this.repository = repository;
    }

    @Override
    public Page<ObavestenjeDto> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(mapper :: obavestenjeToObavestenjeDto);
    }

    @Override
    public ObavestenjeDto findById(Long id) {
        return repository.findById(id).map(mapper::obavestenjeToObavestenjeDto)
                .orElseThrow(() -> new NotFoundException(String.format("Obavestenje sa id: %d nije pronadjena.", id)));
    }

    @Override
    public ObavestenjeDto create(ObavestenjeCreateDto obavestenjeCreateDto) {
        Obavestenje obavestenje = mapper.obavestenjeCreateDtoToObavestenje(obavestenjeCreateDto);
        repository.save(obavestenje);
        return mapper.obavestenjeToObavestenjeDto(obavestenje);
    }

    @Override
    public void delete(Long id) {
        Optional<Obavestenje> obavestenje = repository.findById(id);
        if(!obavestenje.isPresent())
            throw new NotFoundException("Obavestenje sa datim id ne postoji.");
        repository.delete(obavestenje.get());
    }

    @Override
    public ObavestenjeDto update(Long id, ObavestenjeUpdateDto obavestenjeUpdateDto) {

        Optional<Obavestenje> obavestenje = repository.findById(id);
        if(!obavestenje.isPresent())
            throw new NotFoundException("Obavestenje sa datim id ne postoji.");

        Obavestenje ob = mapper.updateDtoToOriginal(obavestenjeUpdateDto, obavestenje.get());
        repository.save(ob);
        return mapper.obavestenjeToObavestenjeDto(ob);
    }
}
