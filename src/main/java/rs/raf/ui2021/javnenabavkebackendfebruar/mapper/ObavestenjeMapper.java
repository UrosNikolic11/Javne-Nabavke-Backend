package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObavestenjeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Obavestenje;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;

import java.util.Optional;

@Component
public class ObavestenjeMapper {

    private JavnaNabavkaRepository javnaNabavkaRepository;

    public ObavestenjeMapper(JavnaNabavkaRepository javnaNabavkaRepository) {
        this.javnaNabavkaRepository = javnaNabavkaRepository;
    }

    public ObavestenjeDto obavestenjeToObavestenjeDto(Obavestenje obavestenje){

        ObavestenjeDto obd = new ObavestenjeDto();
        obd.setId(obavestenje.getId());
        obd.setNaziv(obavestenje.getNaziv());
        obd.setDatumSlanja(obavestenje.getDatumSlanja());
        obd.setTekst(obavestenje.getTekst());
        obd.setJavnaNabavka(obavestenje.getJavnaNabavka().getId());
        return obd;
    }

    public Obavestenje obavestenjeCreateDtoToObavestenje(ObavestenjeCreateDto obavestenjeCreateDto){

        Optional<JavnaNabavka> javnaNabavka = javnaNabavkaRepository.findById(obavestenjeCreateDto.getJavnaNabavka());

        if(!javnaNabavka.isPresent()){
            throw new NotFoundException("Javna nabavka sa datim id ne postoji.");
        }

        Obavestenje ob = new Obavestenje();
        ob.setNaziv(obavestenjeCreateDto.getNaziv());
        ob.setTekst(obavestenjeCreateDto.getTekst());
        ob.setDatumSlanja(obavestenjeCreateDto.getDatumSlanja());
        ob.setJavnaNabavka(javnaNabavka.get());

        return ob;
    }

    public Obavestenje updateDtoToOriginal(ObavestenjeUpdateDto obavestenjeUpdateDto , Obavestenje obavestenje){

        if(obavestenjeUpdateDto.getNaziv() != null)
            obavestenje.setNaziv(obavestenjeUpdateDto.getNaziv());
        if(obavestenjeUpdateDto.getTekst() != null)
            obavestenje.setTekst(obavestenjeUpdateDto.getTekst());
        if(obavestenjeUpdateDto.getDatumSlanja() != null)
            obavestenje.setDatumSlanja(obavestenjeUpdateDto.getDatumSlanja());


        return obavestenje;
    }

}
