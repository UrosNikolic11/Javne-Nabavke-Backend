package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.NarucilacCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.NarucilacDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.NarucilacUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.NarucilacMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.StatusJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.NarucilacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.NarucilacService;

@Service
public class NarucilacServiceImpl implements NarucilacService{
	
	private NarucilacRepository narucilacRepo;
	private NarucilacMapper narucilacMapper;
	
	public NarucilacServiceImpl(NarucilacRepository narucilacRepo, NarucilacMapper narucilacMapper) {
		this.narucilacRepo = narucilacRepo;
		this.narucilacMapper = narucilacMapper;
	}

	@Override
	public NarucilacDto addNarucilac(NarucilacCreateDto narucilacCreateDto) {
		Narucilac n = narucilacMapper.narucilacCreateDtoToNarucilac(narucilacCreateDto);
		narucilacRepo.save(n);
		NarucilacDto ndto = narucilacMapper.narucilacToNarucilacDto(n);
		return ndto;
	}

	@Override
	public Page<NarucilacDto> findAll(Pageable pageable) {
		return narucilacRepo.findAll(pageable)
				.map(narucilacMapper::narucilacToNarucilacDto);	}

	@Override
	public NarucilacDto findById(Long id) {
		Optional<Narucilac> narucilac = narucilacRepo.findById(id);
		if(!narucilac.isPresent())
			throw new NotFoundException("Narucilac sa datim id ne postoji");
		return narucilacMapper.narucilacToNarucilacDto(narucilac.get());
	}

	@Override
	public void remove(Long id) {
		narucilacRepo.deleteById(id);

	}

	@Override
	public NarucilacDto update(Long id, NarucilacUpdateDto narucilacUpdateDto) {
		//ToDo
		//throw custom Exception
		Optional<Narucilac> n = narucilacRepo.findById(id);
		if(n != null) {
			n.get().setObavljaSektorskuDelatnost(narucilacUpdateDto.getObavljaSektorskuDelatnost());
		}
		narucilacRepo.save(n.get());
		return narucilacMapper.narucilacToNarucilacDto(n.get());
	}

}
