package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KonkursnaDokumentacijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KonkursnaDokumentacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KonkursnaDokumentacijaUpdateDto;

public interface KonkursnaDokumentacijaService {

    Page<KonkursnaDokumentacijaDto> findAll(Pageable pageable);

    KonkursnaDokumentacijaDto findById(Long id);

    KonkursnaDokumentacijaDto create(KonkursnaDokumentacijaCreateDto konkursnaDokumentacijaCreateDto);

    void delete(Long id);

    KonkursnaDokumentacijaDto update(Long id, KonkursnaDokumentacijaUpdateDto konkursnaDokumentacijaUpdateDto);

}
