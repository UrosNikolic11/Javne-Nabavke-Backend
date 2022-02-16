package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;

import javassist.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.RadnikCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.RadnikDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.RadnikUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponudjac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Radnik;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.KorisnikRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PreduzeceRepository;

@Component
public class RadnikMapper {
	
	KorisnikRepository kr;
	PreduzeceRepository pr;
	
	
	public RadnikMapper(KorisnikRepository kr, PreduzeceRepository pr) {
		this.kr=kr;
        this.pr=pr;	}
	
	public Radnik radnikCreateDtoToRadnik(RadnikCreateDto rcd) throws NotFoundException {
		Radnik radnik = new Radnik();

		radnik.setUlogaUPreduzecu(rcd.getUlogaUPreduzecu());
		radnik.setKreiranOdStrane(rcd.getKreiranOdStrane());
		radnik.setOdgovornoLice(rcd.getOdgovornoLice());



		radnik.setKorisnik(kr.findById(rcd.getKorisnik_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Korisnik sa ID-jem '%d' ne postoji.", rcd.getKorisnik_id()))));
		radnik.setPreduzece(pr.findById(rcd.getPreduzece_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Preduzece sa ID-jem '%d' ne postoji.", rcd.getPreduzece_id()))));

		return radnik;
	}
	
	public RadnikDto radnikToRadnikDto(Radnik radnik) {
		RadnikDto radnikDto= new RadnikDto();
		radnikDto.setId(radnik.getId());
		radnikDto.setKreiranOdStrane(radnik.getKreiranOdStrane());
		radnikDto.setOdgovornoLice(radnik.getOdgovornoLice());
	    radnikDto.setUlogaUPreduzecu(radnik.getUlogaUPreduzecu());
		radnikDto.setKorisnik_id(radnik.getKorisnik().getId());
	    radnikDto.setPreduzece_id(radnik.getPreduzece().getId());
	    return radnikDto;
	}

	
	public Radnik updateDtoToOriginal(RadnikUpdateDto updateDto, Radnik radnik) {
		if(updateDto.getKreiranOdStrane() != 0)
         radnik.setKreiranOdStrane(updateDto.getKreiranOdStrane());
		if(updateDto.getOdgovornoLice() != 0)
	         radnik.setOdgovornoLice(updateDto.getOdgovornoLice());
		if(updateDto.getUlogaUPreduzecu() != null)
			radnik.setUlogaUPreduzecu(updateDto.getUlogaUPreduzecu());
		
		
		return radnik;
	}

}
