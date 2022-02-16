package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.NarucilacCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.NarucilacDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.KorisnikRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.LokacijaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.OsnovnaDelatnostRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.VrstaJavnogNaruciocaRepository;

import java.util.Optional;

@Component // dodao sam anotaciju posto bez nje ne moze da se pokrene program, moras da imas bean da bi u konstruktoru u impl
// mogao spring da instancira beanove
public class NarucilacMapper {
	private LokacijaRepository lokacijaRepository;
	private KorisnikRepository korisnikRepository;
	private VrstaJavnogNaruciocaRepository vrstaJavnogNaruciocaRepository;
	private OsnovnaDelatnostRepository osnovnaDelatnostRepository;

	public NarucilacMapper(LokacijaRepository lokacijaRepository, KorisnikRepository korisnikRepository, VrstaJavnogNaruciocaRepository vrstaJavnogNaruciocaRepository, OsnovnaDelatnostRepository osnovnaDelatnostRepository) {
		this.lokacijaRepository = lokacijaRepository;
		this.korisnikRepository = korisnikRepository;
		this.vrstaJavnogNaruciocaRepository = vrstaJavnogNaruciocaRepository;
		this.osnovnaDelatnostRepository = osnovnaDelatnostRepository;
	}

	public NarucilacDto narucilacToNarucilacDto(Narucilac n) {
		
		//ToDo
		//dodati mapiranje za OsnovnaDelatnost
		
		NarucilacDto ndto = new NarucilacDto();
		ndto.setKorisnik_id(n.getKorisnik().getId());
		ndto.setId(n.getId());
		ndto.setLokacija_id(n.getLokacija().getId());
		ndto.setObavljaSektorskuDelatnost(n.getObavljaSektorskuDelatnost());
		ndto.setVrstaJavnogNarucioca_id(n.getVrstaJavnogNarucioca().getId());
		
		return ndto;
		
	}
	
	public Narucilac narucilacCreateDtoToNarucilac(NarucilacCreateDto ncdto) {
		Optional <Lokacija> lokacija = lokacijaRepository.findById(ncdto.getLokacija_id());
		if(!lokacija.isPresent())
			throw new NotFoundException("Lokacija sa datim id-om ne postoji!");

		Optional <Korisnik> korisnik = korisnikRepository.findById(ncdto.getKorisnik_id());
		if(!korisnik.isPresent())
			throw new NotFoundException("Korisnik sa datim id-om ne postoji!");

		Optional <OsnovnaDelatnost> osnovnaDelatnost = osnovnaDelatnostRepository.findById(ncdto.getOsnovnaDelatnost_id());
		if(!osnovnaDelatnost.isPresent())
			throw new NotFoundException("Osnovna Delatnost sa datim id-om ne postoji!");

		Optional <VrstaJavnogNarucioca> vrstaJavnogNarucioca = vrstaJavnogNaruciocaRepository.findById(ncdto.getVrstaJavnogNarucioca_id());
		if(!vrstaJavnogNarucioca.isPresent())
			throw new NotFoundException("Vrsta Javnog Narucioca sa datim id-om ne postoji!");

		Narucilac n = new Narucilac();
		n.setObavljaSektorskuDelatnost(ncdto.getObavljaSektorskuDelatnost());
		n.setLokacija(lokacija.get());
		n.setKorisnik(korisnik.get());
		n.setVrstaJavnogNarucioca(vrstaJavnogNarucioca.get());
		n.setOsnovnaDelatnost(osnovnaDelatnost.get());
		return n;
		
	}

}
