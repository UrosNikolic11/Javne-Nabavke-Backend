package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.VrstaPostupkaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaPostupkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaPostupkaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.BadRequestException;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.VrstaPostupkaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.VrstaPostupka;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.VrstaPostupkaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.VrstaPostupkaService;

import java.util.Optional;

@Service

public class VrstaPostupkaServiceImpl implements VrstaPostupkaService {

    private VrstaPostupkaMapper mapper;
    private VrstaPostupkaRepository repository;

    public VrstaPostupkaServiceImpl(VrstaPostupkaMapper mapper, VrstaPostupkaRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    @Override
    public Page<VrstaPostupkaDto> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(mapper :: originalToDto);
    }

    @Override
    public VrstaPostupkaDto findById(Long id) {
        Optional<VrstaPostupka> vrstaPostupka = repository.findById(id);
        if(!vrstaPostupka.isPresent())
            throw new NotFoundException("Vrsta postupka sa datim id ne postoji.");
        return mapper.originalToDto(vrstaPostupka.get());
    }

    @Override
    public VrstaPostupkaDto create(VrstaPostupkaCreateDto vrstaPostupkaCreateDto) {
        Optional<VrstaPostupka> vrstaPostupkaExist = repository.findByNaziv(vrstaPostupkaCreateDto.getNaziv());
        if(vrstaPostupkaExist.isPresent())
            throw new BadRequestException("Vrsta postupka sa datim nazivom vec postoji.");
        VrstaPostupka vrstaPostupka = mapper.createDtoToOriginal(vrstaPostupkaCreateDto);
        repository.save(vrstaPostupka);
        return mapper.originalToDto(vrstaPostupka);
    }

    @Override
    public void delete(Long id) {
        Optional<VrstaPostupka> vrstaPostupka = repository.findById(id);
        if(!vrstaPostupka.isPresent())
            throw new NotFoundException("Vrsta postupka sa datim id ne postoji.");
        repository.delete(vrstaPostupka.get());
    }

    @Override
    public VrstaPostupkaDto update(Long id, VrstaPostupkaUpdateDto vrstaPostupkaUpdateDto) {
        Optional<VrstaPostupka> vrstaPostupkaExist = repository.findById(id);
        if(!vrstaPostupkaExist.isPresent())
            throw new NotFoundException("Vrsta postupka sa datim id ne postoji.");

        VrstaPostupka vrstaPostupka = mapper.updateDtoToOriginal(vrstaPostupkaUpdateDto, vrstaPostupkaExist.get());
        repository.save(vrstaPostupka);
        return mapper.originalToDto(vrstaPostupka);

    }
}
