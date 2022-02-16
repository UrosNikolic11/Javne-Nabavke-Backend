package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.VrstaJavnogNaruciocaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaJavnogNaruciocaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.VrstaJavnogNarucioca;
@Component // dodao sam anotaciju posto bez nje ne moze da se pokrene program, moras da imas bean da bi u konstruktoru u impl
// mogao spring da instancira beanove
public class VrstaJavnogNaruciocaMapper {
	
public VrstaJavnogNaruciocaDto vrstaJavnogNaruciocaToVJNDto(VrstaJavnogNarucioca vjn) {
				
		VrstaJavnogNaruciocaDto vjndto = new VrstaJavnogNaruciocaDto();
		vjndto.setNaziv(vjn.getNaziv());
		vjndto.setId(vjn.getId());
		return vjndto;
		
	}
	
	public VrstaJavnogNarucioca vrstaJavnogNaruciocaCreateDtoToVJN(VrstaJavnogNaruciocaCreateDto vjncdto) {
		
		VrstaJavnogNarucioca vjn = new VrstaJavnogNarucioca();
		vjn.setNaziv(vjncdto.getNaziv());

		return vjn;
		
	}

}
