package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PonudjacCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudjacDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudjacUpdateDto;

public interface PonudjacService {
	public PonudjacDto create(PonudjacCreateDto ponudjacCreateDto) throws NotFoundException;
	public PonudjacDto update(Long id, PonudjacUpdateDto ponudjacUpdateDto);
	public void delete(Long id);
	
	Page<PonudjacDto> findAll(Pageable pageable);

}
