package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KorisnikCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KorisnikDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Korisnik;

@Component
public class KorisnikMapper {

    public KorisnikDto korisnikToKorisnikDto(Korisnik korisnik){
        KorisnikDto korisnikDto = new KorisnikDto();
        korisnikDto.setId(korisnik.getId());
        korisnikDto.setKorisnickoIme(korisnik.getKorisnickoIme());
        korisnikDto.setIme(korisnik.getIme());
        korisnikDto.setPrezime(korisnik.getPrezime());
        korisnikDto.setPol(korisnik.getPol());
        korisnikDto.setNaziv(korisnik.getNaziv());
        korisnikDto.setMaticniBroj(korisnik.getMaticniBroj());
        korisnikDto.setEmail(korisnik.getEmail());
        korisnikDto.setTelefon(korisnik.getTelefon());
        korisnikDto.setFaks(korisnik.getFaks());
        korisnikDto.setTip(korisnik.getTip());
        korisnikDto.setInternetStranica(korisnik.getInternetStranica());
        korisnikDto.setPoreskiIdBroj(korisnik.getPoreskiIdBroj());
        korisnikDto.setNstjOznaka(korisnik.getNstjOznaka());
        korisnikDto.setOsobaZaKontakt(korisnik.getOsobaZaKontakt());


        return korisnikDto;

    }

    public Korisnik korisnikCreateDtoToKorisnik(KorisnikCreateDto korisnikCreateDto){
        Korisnik korisnik = new Korisnik();
        korisnik.setKorisnickoIme(korisnikCreateDto.getKorisnickoIme());
        korisnik.setIme(korisnikCreateDto.getIme());
        korisnik.setLozinka(korisnikCreateDto.getLozinka());
        korisnik.setPrezime(korisnikCreateDto.getPrezime());
        korisnik.setPol(korisnikCreateDto.getPol());
        korisnik.setNaziv(korisnikCreateDto.getNaziv());
        korisnik.setMaticniBroj(korisnikCreateDto.getMaticniBroj());
        korisnik.setEmail(korisnikCreateDto.getEmail());
        korisnik.setTelefon(korisnikCreateDto.getTelefon());
        korisnik.setFaks(korisnikCreateDto.getFaks());
        korisnik.setTip(korisnikCreateDto.getTip());
        korisnik.setInternetStranica(korisnikCreateDto.getInternetStranica());
        korisnik.setPoreskiIdBroj(korisnikCreateDto.getPoreskiIdBroj());
        korisnik.setNstjOznaka(korisnikCreateDto.getNstjOznaka());
        korisnik.setOsobaZaKontakt(korisnikCreateDto.getOsobaZaKontakt());
        return korisnik;

    }



}
