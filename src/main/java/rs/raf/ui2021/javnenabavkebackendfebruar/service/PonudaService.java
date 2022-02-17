package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PonudaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudaUpdateDto;

import java.util.List;


public interface PonudaService {
    Page<PonudaDto> findAll(Pageable pageable);

    PonudaDto findById(Long id);

    PonudaDto create(PonudaCreateDto ponudaCreateDto);

    void delete(Long id);

    PonudaDto update(Long id, PonudaUpdateDto ponudaUpdateDto);

    List<PonudaDto> findByNarucilac(Long id);
}
