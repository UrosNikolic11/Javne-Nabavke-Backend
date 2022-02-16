package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.VrstaJavnogNaruciocaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaJavnogNaruciocaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.VrstaJavnogNaruciocaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.VrstaJavnogNarucioca;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.VrstaJavnogNaruciocaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.VrstaJavnogNaruciocaService;

@Service
public class VrstaJavnogNaruciocaServiceImpl implements VrstaJavnogNaruciocaService {
	
	private VrstaJavnogNaruciocaRepository vjnRepo;
	private VrstaJavnogNaruciocaMapper vjnMapper;
	
	public VrstaJavnogNaruciocaServiceImpl(VrstaJavnogNaruciocaRepository vjnRepo, 
											VrstaJavnogNaruciocaMapper vjnMapper) {
			this.vjnRepo = vjnRepo;
			this.vjnMapper = vjnMapper;
	}

	@Override
	public VrstaJavnogNaruciocaDto addVrstaJavnogNarucioca(VrstaJavnogNaruciocaCreateDto vjncdto) {
		VrstaJavnogNarucioca vjn = vjnMapper.vrstaJavnogNaruciocaCreateDtoToVJN(vjncdto);
		vjnRepo.save(vjn);
		VrstaJavnogNaruciocaDto vjndto = vjnMapper.vrstaJavnogNaruciocaToVJNDto(vjn);
		return vjndto;
	}

	@Override
	public Page<VrstaJavnogNaruciocaDto> findAll(Pageable pageable) {
		return vjnRepo.findAll(pageable)
				.map(vjnMapper::vrstaJavnogNaruciocaToVJNDto);
	}

	@Override
	public void remove(Long id) {
		vjnRepo.deleteById(id);
	}

	@Override
	public VrstaJavnogNaruciocaDto update(Long id, VrstaJavnogNaruciocaDto vjnUpdateDto) {
		//ToDo
		//throw custom Exception
		Optional<VrstaJavnogNarucioca> vjn = vjnRepo.findById(id);
		if(vjn != null) {
			vjn.get().setNaziv(vjnUpdateDto.getNaziv());
		}
		vjnRepo.save(vjn.get());
		return vjnMapper.vrstaJavnogNaruciocaToVJNDto(vjn.get());
	}

}
