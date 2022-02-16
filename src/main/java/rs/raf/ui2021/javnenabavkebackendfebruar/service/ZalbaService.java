package rs.raf.ui2021.javnenabavkebackendfebruar.service;


import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ZalbaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ZalbaDto;

public interface ZalbaService{

    Page<ZalbaDto> findAll(Pageable pageable);

    ZalbaDto add(ZalbaCreateDto zalbaCreateDto) throws NotFoundException;

    ZalbaDto findById(Long id);

    void deleteById(Long id);

    void updateZalba(Long id, ZalbaCreateDto zalbaCreateDto);

}
