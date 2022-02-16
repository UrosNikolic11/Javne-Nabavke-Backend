package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.VrstaPostupkaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaPostupkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaPostupkaUpdateDto;


public interface VrstaPostupkaService {

    Page<VrstaPostupkaDto> findAll(Pageable pageable);

    VrstaPostupkaDto findById(Long id);

    VrstaPostupkaDto create(VrstaPostupkaCreateDto vrstaPostupkaCreateDto);

    void delete(Long id);

    VrstaPostupkaDto update(Long id, VrstaPostupkaUpdateDto vrstaPostupkaUpdateDto);
}
