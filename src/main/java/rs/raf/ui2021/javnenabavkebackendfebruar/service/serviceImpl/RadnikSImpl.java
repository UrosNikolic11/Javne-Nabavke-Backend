package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import java.util.Optional;


import org.springframework.data.domain.Page;


import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.RadnikCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.RadnikDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.RadnikUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.RadnikMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Lokacija;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Radnik;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.RadnikRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.RadnikService;

@Service
public class RadnikSImpl implements RadnikService{
	
	 RadnikRepository radnikRepository;
	 RadnikMapper radnikMapper;
	
	public RadnikSImpl(RadnikRepository radnikRepository, RadnikMapper radnikMapper) {
		this.radnikRepository=radnikRepository;
		this.radnikMapper=radnikMapper;
	}

	@Override
	public RadnikDto create(RadnikCreateDto radnikCreateDto) throws NotFoundException {
		Radnik radnik=radnikMapper.radnikCreateDtoToRadnik(radnikCreateDto);
		radnikRepository.save(radnik);
		return radnikMapper.radnikToRadnikDto(radnik);

	}



	@Override
	public Page<RadnikDto> findAll(Pageable pageable) {
  	return	radnikRepository.findAll(pageable)
		.map(radnikMapper::radnikToRadnikDto);
	}

	@Override
	public void delete(Long id) {
		radnikRepository.deleteById(id);
		
	}

	@Override
	public RadnikDto update(Long id, RadnikUpdateDto radnikUpdateDto) {
		Optional<Radnik> radnik = radnikRepository.findById(id);
        Radnik updRadnik = radnikMapper.updateDtoToOriginal(radnikUpdateDto, radnik.get());
        radnikRepository.save(updRadnik);
        return radnikMapper.radnikToRadnikDto(updRadnik);
	}

	

}
