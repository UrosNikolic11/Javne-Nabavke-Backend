package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.OsnovnaDelatnostCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.OsnovnaDelatnostDto;



public interface OsnovnaDelatnostService {
	
	public OsnovnaDelatnostDto create(OsnovnaDelatnostCreateDto osnovnaDelatnostCreateDto);
	public OsnovnaDelatnostDto update(Long id,OsnovnaDelatnostCreateDto osnovnaDelatnostUpdateDto);
	public void delete(Long id);
	
	Page<OsnovnaDelatnostDto> findAll(Pageable pageable);

}
