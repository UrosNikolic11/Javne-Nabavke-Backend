package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PlanJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PlanJavneNabavkeDto;

public interface PlanJavneNabavkeService {

    Page<PlanJavneNabavkeDto> findAll(Pageable pageable);

    PlanJavneNabavkeDto add(PlanJavneNabavkeCreateDto planJavneNabavkeCreateDto) throws NotFoundException;

    PlanJavneNabavkeDto findById(Long id);

    void deleteById(Long id);

    void updatePlanJavneNabavke(Long id, PlanJavneNabavkeCreateDto planJavneNabavkeCreateDto);

}
