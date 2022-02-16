package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.OkvirniSporazumCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.OkvirniSporazumDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.OkvirniSporazum;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponudjac;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.NarucilacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PonudjacRepository;

import java.util.Optional;

@Component
public class OkvirniSporazumMapper {

    private JavnaNabavkaRepository javnaNabavkaRepository;
    private NarucilacRepository narucilacRepository;
    private PonudjacRepository ponudjacRepository;

    public OkvirniSporazumMapper(JavnaNabavkaRepository javnaNabavkaRepository, NarucilacRepository narucilacRepository, PonudjacRepository ponudjacRepository) {
        this.javnaNabavkaRepository = javnaNabavkaRepository;
        this.narucilacRepository = narucilacRepository;
        this.ponudjacRepository = ponudjacRepository;
    }

    public OkvirniSporazum createToOriginal(OkvirniSporazumCreateDto okvirniSporazumCreateDto){
        OkvirniSporazum okvirniSporazum = new OkvirniSporazum();

        Optional<JavnaNabavka> javnaNabavka = javnaNabavkaRepository.findById(okvirniSporazumCreateDto.getJavnaNabavkaId());
        Optional<Narucilac> narucilac = narucilacRepository.findById(okvirniSporazumCreateDto.getNarucilacId());
        Optional<Ponudjac> ponudjac = ponudjacRepository.findById(okvirniSporazumCreateDto.getPonudjacId());

        if(!javnaNabavka.isPresent()){
            throw new NotFoundException("Javna nabavka sa datim id ne postoji.");
        }
        if(!narucilac.isPresent()){
            throw new NotFoundException("Narucilac sa datim id ne postoji.");
        }
        if(!ponudjac.isPresent()){
            throw new NotFoundException("Ponudjac sa datim id ne postoji.");
        }

        okvirniSporazum.setJavnaNabavka(javnaNabavka.get());
        okvirniSporazum.setNarucilac(narucilac.get());
        okvirniSporazum.setPonudjac(ponudjac.get());

        return okvirniSporazum;
    }

    public OkvirniSporazumDto originalToDto(OkvirniSporazum okvirniSporazum){
        OkvirniSporazumDto okvirniSporazumDto = new OkvirniSporazumDto();

        okvirniSporazumDto.setId(okvirniSporazum.getId());
        okvirniSporazumDto.setJavnaNabavkaId(okvirniSporazum.getJavnaNabavka().getId());
        okvirniSporazumDto.setNarucilacId(okvirniSporazum.getNarucilac().getId());
        okvirniSporazumDto.setPonudjacId(okvirniSporazum.getPonudjac().getId());

        return okvirniSporazumDto;
    }
}
