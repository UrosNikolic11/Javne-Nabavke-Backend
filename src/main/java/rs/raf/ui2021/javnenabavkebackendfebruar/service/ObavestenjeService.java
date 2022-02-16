package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObavestenjeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeUpdateDto;


public interface ObavestenjeService {

    Page<ObavestenjeDto> findAll(Pageable pageable);

    ObavestenjeDto findById(Long id);

    ObavestenjeDto create(ObavestenjeCreateDto obavestenjeCreateDto);

    void delete(Long id);

    ObavestenjeDto update(Long id, ObavestenjeUpdateDto obavestenjeUpdateDto);
}
