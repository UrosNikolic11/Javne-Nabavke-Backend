package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PreduzeceCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PreduzeceDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PreduzeceUpdateDto;

public interface PreduzeceService {

	//create
	PreduzeceDto addPreduzece(PreduzeceCreateDto preduzeceCreateDto);

	//read
	Page<PreduzeceDto> findAll(Pageable pageable);

	//update
	PreduzeceDto update(Long id, PreduzeceUpdateDto preduzeceUpdateDto);

	//delete
	void remove(Long id);


	PreduzeceDto findByNarucilac(Long id);
	

}
