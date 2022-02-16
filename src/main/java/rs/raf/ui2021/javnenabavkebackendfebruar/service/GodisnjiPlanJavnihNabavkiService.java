package rs.raf.ui2021.javnenabavkebackendfebruar.service;


import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.GodisnjiPlanJavnihNabavkiCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.GodisnjiPlanJavnihNabavkiDto;

import java.util.List;

public interface GodisnjiPlanJavnihNabavkiService{

    Page<GodisnjiPlanJavnihNabavkiDto> findAll(Pageable pageable);

    GodisnjiPlanJavnihNabavkiDto add(GodisnjiPlanJavnihNabavkiCreateDto godisnjiPlanJavnihNabavkiCreateDto) throws NotFoundException;

    GodisnjiPlanJavnihNabavkiDto findById(Long id);

    void deleteById(Long id);

    void updateGodisnjiPlanJavnihNabavki(Long id, GodisnjiPlanJavnihNabavkiCreateDto godisnjiPlanJavnihNabavkiCreateDto);

    List<GodisnjiPlanJavnihNabavkiDto> vrati(Long narucilacId);

}
