package rs.raf.ui2021.javnenabavkebackendfebruar.service;


import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PredlogNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PredlogNabavkeDto;

public interface PredlogNabavkeService {

    Page<PredlogNabavkeDto> findAll(Pageable pageable);

    PredlogNabavkeDto add(PredlogNabavkeCreateDto predlogNabavkeCreateDto) throws NotFoundException;

    PredlogNabavkeDto findById(Long id);

    void deleteById(Long id);

    void updatePredlogNabavke(Long id, PredlogNabavkeCreateDto predlogNabavkeCreateDto);

}
