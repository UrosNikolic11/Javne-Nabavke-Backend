package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.OkvirniSporazumCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.OkvirniSporazumDto;


public interface OkvirniSporazumService {
    Page<OkvirniSporazumDto> findAll(Pageable pageable);

    OkvirniSporazumDto findById(Long id);

    OkvirniSporazumDto create(OkvirniSporazumCreateDto okvirniSporazumCreateDto);

    void delete(Long id);
}
