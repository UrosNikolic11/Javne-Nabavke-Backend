package rs.raf.ui2021.javnenabavkebackendfebruar.service;


import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.StavkaJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.StavkaJavneNabavkeDto;

public interface StavkaJavneNabavkeService{

    Page<StavkaJavneNabavkeDto> findAll(Pageable pageable);

    StavkaJavneNabavkeDto add(StavkaJavneNabavkeCreateDto stavkaJavneNabavkeCreateDto) throws NotFoundException;

    StavkaJavneNabavkeDto findById(Long id);

    void deleteById(Long id);

    void updateStavkaJavneNabavke(Long id, StavkaJavneNabavkeCreateDto stavkaJavneNabavkeCreateDto);

}
