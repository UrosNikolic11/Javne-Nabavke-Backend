package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.LokacijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Lokacija;

@Component
public class LokacijaMapper {


    public Lokacija createDtoToOriginal(LokacijaCreateDto lokacijaCreateDto){
        Lokacija lokacija = new Lokacija();
        lokacija.setDrzava(lokacijaCreateDto.getDrzava());
        lokacija.setAdresaSedista(lokacijaCreateDto.getAdresaSedista());
        lokacija.setMesto(lokacijaCreateDto.getMesto());
        lokacija.setPostanskiBr(lokacijaCreateDto.getPostanskiBr());
        return lokacija;
    }

    public LokacijaDto originalToDto(Lokacija lokacija){
        LokacijaDto lokacijaDto = new LokacijaDto();
        lokacijaDto.setId(lokacija.getId());
        lokacijaDto.setDrzava(lokacija.getDrzava());
        lokacijaDto.setMesto(lokacija.getMesto());
        lokacijaDto.setAdresaSedista(lokacija.getAdresaSedista());
        lokacijaDto.setPostanskiBr(lokacija.getPostanskiBr());
        return lokacijaDto;
    }

    public Lokacija updateDtoToOriginal(LokacijaUpdateDto lokacijaUpdateDto, Lokacija lokacija){
        if(lokacijaUpdateDto.getDrzava() != null)
            lokacija.setDrzava(lokacijaUpdateDto.getDrzava());
        if(lokacijaUpdateDto.getMesto() != null)
            lokacija.setMesto(lokacijaUpdateDto.getMesto());
        if(lokacijaUpdateDto.getAdresaSedista() != null)
            lokacija.setAdresaSedista(lokacijaUpdateDto.getAdresaSedista());
        if(lokacijaUpdateDto.getPostanskiBr() != null)
            lokacija.setPostanskiBr(lokacijaUpdateDto.getPostanskiBr());

        return lokacija;
    }
}
