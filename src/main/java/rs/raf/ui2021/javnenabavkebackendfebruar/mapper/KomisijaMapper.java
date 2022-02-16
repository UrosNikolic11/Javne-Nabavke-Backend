package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KomisijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KomisijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KomisijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Komisija;

@Component
public class KomisijaMapper {

    public KomisijaDto komisijaToKomisijaDto(Komisija komisija){

        KomisijaDto komisijaDto = new KomisijaDto();
        komisijaDto.setId(komisija.getId());
        komisijaDto.setGlavni(komisija.getGlavni());

        return komisijaDto;
    }

    public Komisija komisijaCreateDtoToKomisija(KomisijaCreateDto komisijaCreateDto){

        Komisija komisija = new Komisija();

        komisija.setGlavni(komisijaCreateDto.getGlavni());

        return komisija;
    }

    public Komisija komisijaUpdateDtoToKomisija(KomisijaUpdateDto komisijaUpdateDto, Komisija komisija){

        if(komisijaUpdateDto.getGlavni() != null)
            komisija.setGlavni(komisijaUpdateDto.getGlavni());

        return komisija;
    }
}
