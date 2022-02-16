package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KonkursnaDokumentacijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KonkursnaDokumentacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KonkursnaDokumentacijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.BadRequestException;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.KonkursnaDokumentacijaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.KonkursnaDokumentacija;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.KonkursnaDokumentacijaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.KonkursnaDokumentacijaService;

import java.util.Optional;

@Service

public class KonkursnaDokumentacijaServiceImpl implements KonkursnaDokumentacijaService {

    private KonkursnaDokumentacijaMapper mapper;
    private KonkursnaDokumentacijaRepository repository;

    public KonkursnaDokumentacijaServiceImpl(KonkursnaDokumentacijaMapper mapper, KonkursnaDokumentacijaRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    @Override
    public Page<KonkursnaDokumentacijaDto> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::originalToDto);
    }

    @Override
    public KonkursnaDokumentacijaDto findById(Long id) {
        Optional<KonkursnaDokumentacija> konkursnaDokumentacija = repository.findById(id);
        if(!konkursnaDokumentacija.isPresent())
            throw new NotFoundException("Konkursna dokumentacija sa datim id ne postoji.");
        return mapper.originalToDto(konkursnaDokumentacija.get());
    }

    @Override
    public KonkursnaDokumentacijaDto create(KonkursnaDokumentacijaCreateDto konkursnaDokumentacijaCreateDto) {
        KonkursnaDokumentacija konkursnaDokumentacija = mapper.createDtoToOriginal(konkursnaDokumentacijaCreateDto);
        Optional<KonkursnaDokumentacija> kDExist = repository.findByJavnaNabavka(konkursnaDokumentacija.getJavnaNabavka());
        if(kDExist.isPresent()){
            throw new BadRequestException("Konkursna dokumentacija sa datom javnom nabavkom vec postoji.");
        }
        repository.save(konkursnaDokumentacija);
        return mapper.originalToDto(konkursnaDokumentacija);
    }

    @Override
    public void delete(Long id) {
        Optional<KonkursnaDokumentacija> konkursnaDokumentacija = repository.findById(id);
        if(!konkursnaDokumentacija.isPresent())
            throw new NotFoundException("Konkursna dokumentacija sa datim id ne postoji.");
        repository.delete(konkursnaDokumentacija.get());
    }

    @Override
    public KonkursnaDokumentacijaDto update(Long id, KonkursnaDokumentacijaUpdateDto konkursnaDokumentacijaUpdateDto) {
        Optional<KonkursnaDokumentacija> konkursnaDokumentacija = repository.findById(id);
        if(!konkursnaDokumentacija.isPresent())
            throw new NotFoundException("Konkursna dokumentacija sa datim id ne postoji.");
        KonkursnaDokumentacija updated = mapper.updateDtoToOriginal(konkursnaDokumentacijaUpdateDto, konkursnaDokumentacija.get());
        repository.save(updated);
        return mapper.originalToDto(updated);
    }
}
