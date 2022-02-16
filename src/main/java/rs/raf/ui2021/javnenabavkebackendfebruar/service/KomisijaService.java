package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KomisijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KomisijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KomisijaUpdateDto;

public interface KomisijaService {

    KomisijaDto create(KomisijaCreateDto komisijaCreateDto);

    KomisijaDto findById(Long id);

    Page<KomisijaDto> findAll(Pageable pageable);

    KomisijaDto update(Long id, KomisijaUpdateDto komisijaUpdateDto);

    void delete(Long id);
}
