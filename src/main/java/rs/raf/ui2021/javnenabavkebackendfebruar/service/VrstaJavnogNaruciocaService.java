package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.VrstaJavnogNaruciocaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaJavnogNaruciocaDto;

public interface VrstaJavnogNaruciocaService {
	
	//create
	VrstaJavnogNaruciocaDto addVrstaJavnogNarucioca(VrstaJavnogNaruciocaCreateDto vjncdto);
	
	//read
	Page<VrstaJavnogNaruciocaDto> findAll(Pageable pageable);
	
	//update
	public VrstaJavnogNaruciocaDto update(Long id, VrstaJavnogNaruciocaDto vjnUpdateDto);

	//delete
	void remove(Long id);
	
	

}
