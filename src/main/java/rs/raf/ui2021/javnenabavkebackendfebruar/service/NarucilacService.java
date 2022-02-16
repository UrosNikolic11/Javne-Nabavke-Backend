package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.NarucilacCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.NarucilacDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.NarucilacUpdateDto;

public interface NarucilacService {
	
	//create
	NarucilacDto addNarucilac(NarucilacCreateDto narucilacCreateDto);
	
	//read
	Page<NarucilacDto> findAll(Pageable pageable);

	NarucilacDto findById(Long id);
	
	//update
	public NarucilacDto update(Long id, NarucilacUpdateDto narucilacUpdateDto);
	
	//delete
	void remove(Long id);
	
	
	
	
}
