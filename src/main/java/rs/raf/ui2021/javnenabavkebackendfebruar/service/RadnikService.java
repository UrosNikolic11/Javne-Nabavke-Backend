package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.RadnikCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.RadnikDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.RadnikUpdateDto;


public interface RadnikService {
	
	public RadnikDto create(RadnikCreateDto radnikCreateDto) throws NotFoundException;
	public RadnikDto update(Long id,RadnikUpdateDto radnikUpdateDto);
    void delete(Long id);

	
	Page<RadnikDto> findAll(Pageable pageable);
	
	

}
