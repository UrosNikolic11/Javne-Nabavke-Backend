package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.OsnovnaDelatnostCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.OsnovnaDelatnostDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.OsnovnaDelatnostMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.OsnovnaDelatnost;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Radnik;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.OsnovnaDelatnostRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.OsnovnaDelatnostService;

@Service
public class OsnovnaDelatnostSImpl implements OsnovnaDelatnostService {
	
	OsnovnaDelatnostRepository osnovnaDelatnostRepository;
	OsnovnaDelatnostMapper osnovnaDelatnostMapper;
	
	
   public OsnovnaDelatnostSImpl(OsnovnaDelatnostRepository osnovnaDelatnostRepository, OsnovnaDelatnostMapper osnovnaDelatnostMapper) {
	   this.osnovnaDelatnostRepository=osnovnaDelatnostRepository;
	   this.osnovnaDelatnostMapper=osnovnaDelatnostMapper;
    }

	@Override
	public OsnovnaDelatnostDto create(OsnovnaDelatnostCreateDto osnovnaDelatnostCreateDto) {

		OsnovnaDelatnost osnovnaDelatnost = osnovnaDelatnostMapper.osnovnaDelatnostCreateDtoToOD(osnovnaDelatnostCreateDto);
		osnovnaDelatnostRepository.save(osnovnaDelatnost);

		return osnovnaDelatnostMapper.osnovnaDelatnostToODD(osnovnaDelatnost);
	}

	

	@Override
	public Page<OsnovnaDelatnostDto> findAll(Pageable pageable) {
		return osnovnaDelatnostRepository.findAll(pageable)
				.map(osnovnaDelatnostMapper :: osnovnaDelatnostToODD);
	}

	@Override
	public void delete(Long id) {
		osnovnaDelatnostRepository.deleteById(id);		
	}

	@Override
	public OsnovnaDelatnostDto update(Long id, OsnovnaDelatnostCreateDto osnovnaDelatnostUpdateDto) {
		Optional<OsnovnaDelatnost> od = osnovnaDelatnostRepository.findById(id);
        OsnovnaDelatnost updOD = osnovnaDelatnostMapper.updateDtoToOriginal(osnovnaDelatnostUpdateDto, od.get());
        osnovnaDelatnostRepository.save(updOD);
        return osnovnaDelatnostMapper.osnovnaDelatnostToODD(updOD);
	}
	

}
