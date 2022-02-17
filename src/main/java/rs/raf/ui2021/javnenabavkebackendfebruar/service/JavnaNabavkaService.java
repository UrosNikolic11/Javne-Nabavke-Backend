package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.JavnaNabavkaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.GodisnjiPlanJavnihNabavkiDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaUpdateDto;

import java.util.List;

public interface JavnaNabavkaService {

    JavnaNabavkaDto create(JavnaNabavkaCreateDto javnaNabavkaCreateDto);

    JavnaNabavkaDto findById(Long id);

    Page<JavnaNabavkaDto> findAll(Pageable pageable);

    JavnaNabavkaDto update(Long id, JavnaNabavkaUpdateDto javnaNabavkaUpdateDto);

    void delete(Long id);

    List<JavnaNabavkaDto> vrati(Long narucilacId);
}
