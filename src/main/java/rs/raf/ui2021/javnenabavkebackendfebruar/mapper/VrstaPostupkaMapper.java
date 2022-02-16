package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.VrstaPostupkaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaPostupkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaPostupkaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.VrstaPostupka;

@Component
public class VrstaPostupkaMapper {


    public VrstaPostupka createDtoToOriginal(VrstaPostupkaCreateDto vrstaPostupkaCreateDto){
        VrstaPostupka vrstaPostupka = new VrstaPostupka();
        vrstaPostupka.setNaziv(vrstaPostupkaCreateDto.getNaziv());
        return vrstaPostupka;
    }

    public VrstaPostupkaDto originalToDto(VrstaPostupka vrstaPostupka){
        VrstaPostupkaDto vrstaPostupkaDto = new VrstaPostupkaDto();
        vrstaPostupkaDto.setId(vrstaPostupka.getId());
        vrstaPostupkaDto.setNaziv(vrstaPostupka.getNaziv());
        return vrstaPostupkaDto;
    }

    public VrstaPostupka updateDtoToOriginal(VrstaPostupkaUpdateDto vrstaPostupkaUpdateDto, VrstaPostupka vrstaPostupka){
        if(vrstaPostupkaUpdateDto.getNaziv() != null)
        vrstaPostupka.setNaziv(vrstaPostupkaUpdateDto.getNaziv());
        return vrstaPostupka;
    }
}
