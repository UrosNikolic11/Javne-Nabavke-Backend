package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PreduzeceCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PreduzeceDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PreduzeceUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.PreduzeceMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Preduzece;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.NarucilacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PreduzeceRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PreduzeceService;

@Service
public class PreduzeceServiceImpl implements PreduzeceService{

	private PreduzeceRepository preduzeceRepo;
	private PreduzeceMapper preduzeceMapper;
	private NarucilacRepository narucilacRepository;

	public PreduzeceServiceImpl(PreduzeceRepository preduzeceRepo, PreduzeceMapper preduzeceMapper, NarucilacRepository narucilacRepository) {
		this.preduzeceRepo = preduzeceRepo;
		this.preduzeceMapper = preduzeceMapper;
		this.narucilacRepository = narucilacRepository;
	}

	@Override
	public PreduzeceDto addPreduzece(PreduzeceCreateDto preduzeceCreateDto) {
		Preduzece p = preduzeceMapper.preduzeceCreateDtoToPreduzece(preduzeceCreateDto);
		preduzeceRepo.save(p);
		PreduzeceDto pdto = preduzeceMapper.preduzeceToPreduzeceDto(p);
		return pdto;
	}

	@Override
	public Page<PreduzeceDto> findAll(Pageable pageable) {
		return preduzeceRepo.findAll(pageable)
				.map(preduzeceMapper::preduzeceToPreduzeceDto);
	}

	@Override
	public void remove(Long id) {
		preduzeceRepo.deleteById(id);
	}

	@Override
	public PreduzeceDto findByNarucilac(Long id) {
		PreduzeceDto preduzeceDto;
		Optional<Narucilac> narucilac = narucilacRepository.findById(id);
		if(!narucilac.isPresent())
			throw new NotFoundException("Narucilac sa datim id ne postoji.");
		Optional<Preduzece> preduzece = preduzeceRepo.findByNarucilac(narucilac.get());
		if(!preduzece.isPresent())
			throw new NotFoundException("Ovaj naricilac nema preduzece.");
		else
		{
			preduzeceDto = preduzeceMapper.preduzeceToPreduzeceDto(preduzece.get());
		}
		return preduzeceDto;
	}

	@Override
	public PreduzeceDto update(Long id, PreduzeceUpdateDto preduzeceUpdateDto) {
		//ToDo
		//throw custom Exception
		Optional<Preduzece> p = preduzeceRepo.findById(id);
		if(p != null) {
			p.get().setNazivPreduzeca(preduzeceUpdateDto.getNazivPreduzeca());
		}
		preduzeceRepo.save(p.get());
		return preduzeceMapper.preduzeceToPreduzeceDto(p.get());
	}

	


	
	

}
