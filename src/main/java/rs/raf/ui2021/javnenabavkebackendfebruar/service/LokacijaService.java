package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.LokacijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaUpdateDto;

public interface LokacijaService {
    Page<LokacijaDto> findAll(Pageable pageable);

    LokacijaDto findById(Long id);

    LokacijaDto create(LokacijaCreateDto lokacijaCreateDto);

    void delete(Long id);

    LokacijaDto update(Long id, LokacijaUpdateDto lokacijaUpdateDto);
}
