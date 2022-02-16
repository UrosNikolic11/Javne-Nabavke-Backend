package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PreduzeceCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PreduzeceDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.BadRequestException;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Preduzece;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.NarucilacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PreduzeceRepository;

import java.util.Optional;

@Component // dodao sam anotaciju posto bez nje ne moze da se pokrene program, moras da imas bean da bi u konstruktoru u impl
// mogao spring da instancira beanove
public class PreduzeceMapper {
	private NarucilacRepository narucilacRepository;
	private PreduzeceRepository preduzeceRepository;

	public PreduzeceMapper(NarucilacRepository narucilacRepository, PreduzeceRepository preduzeceRepository) {
		this.narucilacRepository = narucilacRepository;
		this.preduzeceRepository = preduzeceRepository;
	}

	public PreduzeceDto preduzeceToPreduzeceDto(Preduzece p) {
		
		PreduzeceDto pdto = new PreduzeceDto();
		pdto.setNarucilac_id(p.getNarucilac().getId());
		pdto.setId(p.getId());
		pdto.setNazivPreduzeca(p.getNazivPreduzeca());
		
		return pdto;
	}
	
	public Preduzece preduzeceCreateDtoToPreduzece(PreduzeceCreateDto pcdto) {
		Optional<Narucilac> narucilac = narucilacRepository.findById(pcdto.getNarucilac_id());
		Optional<Preduzece> preduzece = preduzeceRepository.findByNarucilac(narucilac.get());
		if(!narucilac.isPresent())
			throw new NotFoundException("Narucilac sa datim id-em ne postoji!");

		if(preduzece.isPresent())
			throw new BadRequestException("Ovaj narucilac sa ovim preduzecem vec postoji!");

		Preduzece p = new Preduzece();
		p.setNazivPreduzeca(pcdto.getNazivPreduzeca());
		p.setNarucilac(narucilac.get());
		
		return p;
	}

}
