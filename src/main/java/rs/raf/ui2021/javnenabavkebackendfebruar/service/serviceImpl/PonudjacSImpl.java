package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PonudjacCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudjacDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudjacUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.PonudjacMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Lokacija;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponudjac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Radnik;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PonudjacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PonudjacService;

@Service
public class PonudjacSImpl implements PonudjacService{
	
	PonudjacRepository ponudjacRepository;
	PonudjacMapper ponudjacMapper;
	
	public PonudjacSImpl(PonudjacRepository ponudjacRepository, PonudjacMapper ponudjacMapper) {
		this.ponudjacRepository= ponudjacRepository;
		this.ponudjacMapper=ponudjacMapper;
	}

	@Override
	public PonudjacDto create(PonudjacCreateDto ponudjacCreateDto) throws NotFoundException, javassist.NotFoundException {
		Ponudjac ponudjac = ponudjacMapper.ponudjacCreateDtoToPonudjac(ponudjacCreateDto);
		ponudjacRepository.save(ponudjac);
		return ponudjacMapper.ponudjacToPonudjacDto(ponudjac);
	}

	

	@Override
	public Page<PonudjacDto> findAll(Pageable pageable) {
		return ponudjacRepository.findAll(pageable)
				.map(ponudjacMapper :: ponudjacToPonudjacDto);
	}

	@Override
	public void delete(Long id) {
		ponudjacRepository.deleteById(id);		
	}

	@Override
	public PonudjacDto findById(Long id) {
		Optional<Ponudjac> ponudjac = ponudjacRepository.findById(id);
		if(!ponudjac.isPresent())
			throw new NotFoundException("Ponudjac sa datim id ne postoji.");
		return ponudjacMapper.ponudjacToPonudjacDto(ponudjac.get());
	}

	@Override
	public PonudjacDto update(Long id, PonudjacUpdateDto ponudjacUpdateDto) {
		Optional<Ponudjac> ponudjac = ponudjacRepository.findById(id);
        Ponudjac updPonudjac = ponudjacMapper.updateDtoToOriginal(ponudjacUpdateDto, ponudjac.get());
        ponudjacRepository.save(updPonudjac);
        return ponudjacMapper.ponudjacToPonudjacDto(updPonudjac);	}
}

	
	


