package rs.raf.ui2021.javnenabavkebackendfebruar.service;


import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PredmetJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PredmetJavneNabavkeDto;

public interface PredmetJavneNabavkeService{

    Page<PredmetJavneNabavkeDto> findAll(Pageable pageable);

    PredmetJavneNabavkeDto add(PredmetJavneNabavkeCreateDto predmetJavneNabavkeCreateDto) throws NotFoundException;

    PredmetJavneNabavkeDto findById(Long id);

    void deleteById(Long id);

    void updatePredmetJavneNabavke(Long id, PredmetJavneNabavkeCreateDto predmetJavneNabavkeCreateDto);

}
