package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObavestenjeOIzabranomPonudjacuCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeOIzabranomPonudjacuDto;


public interface ObavestenjeOIzabranomPonudjacuService {
    Page<ObavestenjeOIzabranomPonudjacuDto> findAll(Pageable pageable);

    ObavestenjeOIzabranomPonudjacuDto findById(Long id);

    ObavestenjeOIzabranomPonudjacuDto create(ObavestenjeOIzabranomPonudjacuCreateDto obavestenjeOIzabranomPonudjacuCreateDto);

    void delete(Long id);
}
