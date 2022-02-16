package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.OsnovnaDelatnostCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.OsnovnaDelatnostDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.OsnovnaDelatnostUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.RadnikUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.OsnovnaDelatnost;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Radnik;

@Component
public class OsnovnaDelatnostMapper {
	

	public OsnovnaDelatnost osnovnaDelatnostCreateDtoToOD(OsnovnaDelatnostCreateDto odcd) {
		OsnovnaDelatnost od = new OsnovnaDelatnost();
		od.setNaziv(odcd.getNaziv());
		return od;
	}
	
	public OsnovnaDelatnostDto osnovnaDelatnostToODD(OsnovnaDelatnost od) {
		OsnovnaDelatnostDto odd = new OsnovnaDelatnostDto();
		odd.setId(od.getId());
		odd.setNaziv(od.getNaziv());
		return odd;
	}
	
	public OsnovnaDelatnost updateDtoToOriginal(OsnovnaDelatnostCreateDto osnovnaDelatnostUpdateDto, OsnovnaDelatnost OD) {
		if(osnovnaDelatnostUpdateDto.getNaziv() != null)
         OD.setNaziv(osnovnaDelatnostUpdateDto.getNaziv());
		
		return OD;
	}
	
	

}
