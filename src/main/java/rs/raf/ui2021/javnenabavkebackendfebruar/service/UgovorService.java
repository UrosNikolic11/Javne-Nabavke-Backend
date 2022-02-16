package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.UgovorCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.UgovorDto;

public interface UgovorService {
    Page<UgovorDto> findAll(Pageable pageable);

    UgovorDto findById(Long id);

    UgovorDto create(UgovorCreateDto ugovorCreateDto);

    void delete(Long id);
}
