package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.DokumentacijaPartijeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.DokumentacijaPartijeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.DokumentacijaPartijeUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.DokumentacijaPartijeMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.DokumentacijaPartije;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.DokumentacijaPartijeRepo;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.DokumentacijaPartijeService;

import java.util.Optional;

@Service

public class DokumentacijaPartijeServiceImpl implements DokumentacijaPartijeService {

    private DokumentacijaPartijeMapper mapper;
    private DokumentacijaPartijeRepo repository;

    public DokumentacijaPartijeServiceImpl(DokumentacijaPartijeMapper mapper, DokumentacijaPartijeRepo repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    @Override
    public Page<DokumentacijaPartijeDto> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::dokumentacijaPartijeToDokumentacijaPartijeDto);
    }

    @Override
    public DokumentacijaPartijeDto findById(Long id) {
        return repository.findById(id).map(mapper::dokumentacijaPartijeToDokumentacijaPartijeDto)
                .orElseThrow(() -> new NotFoundException(String.format("Dokumentacija partije sa id: %d nije pronadjena.", id)));
    }

    @Override
    public DokumentacijaPartijeDto create(DokumentacijaPartijeCreateDto dokumentacijaPartijeCreateDto) {
        DokumentacijaPartije dokumentacijaPartije = mapper.dokumentacijaPartijeCreateDtoToDokumentacijaPartije(dokumentacijaPartijeCreateDto);
        repository.save(dokumentacijaPartije);
        return mapper.dokumentacijaPartijeToDokumentacijaPartijeDto(dokumentacijaPartije);
    }

    @Override
    public void delete(Long id) {
        Optional<DokumentacijaPartije> dokumentacijaPartije = repository.findById(id);
        if(!dokumentacijaPartije.isPresent())
            throw new NotFoundException("Dokumentacija partije sa datim id ne postoji.");
        repository.delete(dokumentacijaPartije.get());
    }

    @Override
    public DokumentacijaPartijeDto update(Long id, DokumentacijaPartijeUpdateDto dokumentacijaPartijeUpdateDto) {

        Optional<DokumentacijaPartije> dokumentacijaPartije = repository.findById(id);
        if(!dokumentacijaPartije.isPresent())
            throw new NotFoundException("Dokumentacija partije sa datim id ne postoji.");

        DokumentacijaPartije dp = mapper.updateDtoToOriginal(dokumentacijaPartijeUpdateDto, dokumentacijaPartije.get());
        repository.save(dp);
        return mapper.dokumentacijaPartijeToDokumentacijaPartijeDto(dp);
    }
}
