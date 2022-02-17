package rs.raf.ui2021.javnenabavkebackendfebruar.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.StavkaJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.StavkaJavneNabavkeDto;

public interface StavkaJavneNabavkeService{

    Page<StavkaJavneNabavkeDto> findAll(Pageable pageable);

    StavkaJavneNabavkeDto add(StavkaJavneNabavkeCreateDto stavkaJavneNabavkeCreateDto) ;

    StavkaJavneNabavkeDto findById(Long id);

    void deleteById(Long id);

    void updateStavkaJavneNabavke(Long id, StavkaJavneNabavkeCreateDto stavkaJavneNabavkeCreateDto);

}
