package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.UgovorCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.UgovorDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.UgovorMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ugovor;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.UgovorRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.UgovorService;

import java.util.Optional;

@Service

public class UgovorImpl implements UgovorService {

    private UgovorRepository ugovorRepository;
    private UgovorMapper ugovorMapper;

    public UgovorImpl(UgovorRepository ugovorRepository, UgovorMapper ugovorMapper) {
        this.ugovorRepository = ugovorRepository;
        this.ugovorMapper = ugovorMapper;
    }

    @Override
    public Page<UgovorDto> findAll(Pageable pageable) {
        return ugovorRepository.findAll(pageable)
                .map(ugovorMapper::originalToDto);
    }

    @Override
    public UgovorDto findById(Long id) {
        Optional<Ugovor> u = ugovorRepository.findById(id);
        if (!u.isPresent()){
            throw new NotFoundException("Ugovor sa datim id ne postoji.");
        }
        Ugovor ugovor = ugovorRepository.findUgovorById(id);
        return ugovorMapper.originalToDto(ugovor);
    }

    @Override
    public UgovorDto create(UgovorCreateDto ugovorCreateDto) {
        Ugovor ugovor = ugovorMapper.createDtoToOriginal(ugovorCreateDto);
        ugovorRepository.save(ugovor);
        return ugovorMapper.originalToDto(ugovor);
    }

    @Override
    public void delete(Long id) {
        Optional<Ugovor> u = ugovorRepository.findById(id);
        if (!u.isPresent()){
            throw new NotFoundException("Ugovor sa datim id ne postoji.");
        }
        ugovorRepository.deleteById(id);
    }
}
