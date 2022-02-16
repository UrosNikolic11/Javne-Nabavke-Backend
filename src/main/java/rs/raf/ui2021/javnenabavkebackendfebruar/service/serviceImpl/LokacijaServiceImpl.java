package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.LokacijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.BadRequestException;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.LokacijaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Lokacija;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.LokacijaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.LokacijaService;

import java.util.Optional;

@Service

public class LokacijaServiceImpl implements LokacijaService {

    private LokacijaMapper mapper;
    private LokacijaRepository repository;

    public LokacijaServiceImpl(LokacijaMapper mapper, LokacijaRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    @Override
    public Page<LokacijaDto> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(mapper :: originalToDto);
    }

    @Override
    public LokacijaDto findById(Long id) {
        Optional<Lokacija> lokacija = repository.findById(id);
        if(!lokacija.isPresent())
            throw new NotFoundException("Lokacija sa datim id ne postoji.");
        return mapper.originalToDto(lokacija.get());
    }

    @Override
    public LokacijaDto create(LokacijaCreateDto lokacijaCreateDto) {
        Optional<Lokacija> lokacijaExist = repository.findByAdresaSedistaAndMestoAndDrzava(lokacijaCreateDto.getAdresaSedista(),
                lokacijaCreateDto.getMesto(), lokacijaCreateDto.getDrzava());
        if(lokacijaExist.isPresent()){
            throw new BadRequestException("Lokacija sa datom adresom sedista, mestom i drzavom vec postoji.");
        }
        Lokacija lokacija = mapper.createDtoToOriginal(lokacijaCreateDto);
        repository.save(lokacija);

        return mapper.originalToDto(lokacija);
    }

    @Override
    public void delete(Long id) {
        Optional<Lokacija> lokacija = repository.findById(id);
        if(!lokacija.isPresent())
            throw new NotFoundException("Lokacija sa datim id ne postoji.");
        repository.delete(lokacija.get());
    }

    @Override
    public LokacijaDto update(Long id, LokacijaUpdateDto lokacijaUpdateDto) {
        Optional<Lokacija> lokacija = repository.findById(id);
        if(!lokacija.isPresent())
            throw new NotFoundException("Lokacija sa datim id ne postoji.");
        Lokacija updLokacija = mapper.updateDtoToOriginal(lokacijaUpdateDto, lokacija.get());
        repository.save(updLokacija);
        return mapper.originalToDto(updLokacija);
    }
}
