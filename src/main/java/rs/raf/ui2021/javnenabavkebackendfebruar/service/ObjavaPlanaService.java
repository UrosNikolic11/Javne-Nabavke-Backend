package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObjavaPlanaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObjavaPlanaDto;

public interface ObjavaPlanaService {

    Page<ObjavaPlanaDto> findAll(Pageable pageable);

    ObjavaPlanaDto add(ObjavaPlanaCreateDto objavaPlanaCreateDto) throws NotFoundException;

    ObjavaPlanaDto findById(Long id);

    void deleteById(Long id);

    void updateObjavaPlana(Long id, ObjavaPlanaCreateDto objavaPlanaCreateDto);

}
