package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;

import javassist.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PonudjacCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudjacDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudjacUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Lokacija;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponudjac;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.KorisnikRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.LokacijaRepository;

@Component
public class PonudjacMapper {
	
	private final KorisnikRepository kr;
	LokacijaRepository lr;
	public PonudjacMapper(KorisnikRepository kr, LokacijaRepository lr) {
		this.kr=kr;
		this.lr=lr;
	}
	
	
	public Ponudjac ponudjacCreateDtoToPonudjac(PonudjacCreateDto pcd) throws NotFoundException {
		Ponudjac ponudjac = new Ponudjac();
		ponudjac.setOblastInteresovanja(pcd.getOblastInteresovanja());
		
		ponudjac.setKorisnik(kr.findById(pcd.getKorisnik_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Korisnik sa ID-jem '%d' ne postoji.", pcd.getKorisnik_id()))));
		System.out.println("*************");
		System.out.println(ponudjac.getKorisnik());
		ponudjac.setLokacija(lr.findById(pcd.getLokacija_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Lokacija sa ID-jem '%d' ne postoji.", pcd.getLokacija_id()))));	
		return ponudjac;
		
	}
	
	public PonudjacDto ponudjacToPonudjacDto(Ponudjac ponudjac) {
		PonudjacDto pd= new PonudjacDto();
		pd.setId(ponudjac.getId());
		pd.setKorisnik_id(ponudjac.getKorisnik().getId());
		pd.setLokacija_id(ponudjac.getLokacija().getId());
		pd.setOblastInteresovanja(ponudjac.getOblastInteresovanja());
		
		return pd;
	}
	

	
	public Ponudjac updateDtoToOriginal(PonudjacUpdateDto updateDto, Ponudjac ponudjac) {

		if(updateDto.getOblastInteresovanja() != null)
			ponudjac.setOblastInteresovanja(updateDto.getOblastInteresovanja());
      

      return ponudjac;
	}
	

}
