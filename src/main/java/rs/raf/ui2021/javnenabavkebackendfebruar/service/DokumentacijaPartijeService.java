package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.DokumentacijaPartijeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.DokumentacijaPartijeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.DokumentacijaPartijeUpdateDto;

public interface DokumentacijaPartijeService {

    Page<DokumentacijaPartijeDto> findAll(Pageable pageable);

    DokumentacijaPartijeDto findById(Long id);

    DokumentacijaPartijeDto create(DokumentacijaPartijeCreateDto dokumentacijaPartijeCreateDto);

    void delete(Long id);

    DokumentacijaPartijeDto update(Long id, DokumentacijaPartijeUpdateDto dokumentacijaPartijeUpdateDto);

}
