package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.DokumentacijaPartijeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.DokumentacijaPartijeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.DokumentacijaPartijeUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PartijaRepo;

import java.util.Optional;

@Component
public class DokumentacijaPartijeMapper {

    private PartijaRepo partijaRepo;

    public DokumentacijaPartijeMapper(PartijaRepo partijaRepo) {
        this.partijaRepo = partijaRepo;
    }

    public DokumentacijaPartijeDto dokumentacijaPartijeToDokumentacijaPartijeDto(DokumentacijaPartije dokumentacijaPartije){

        DokumentacijaPartijeDto dpd = new DokumentacijaPartijeDto();
        dpd.setId(dokumentacijaPartije.getId());
        dpd.setDoc1(dokumentacijaPartije.getDoc1());
        dpd.setDoc2(dokumentacijaPartije.getDoc2());
        dpd.setPartija(dokumentacijaPartije.getPartija().getId());
        return dpd;
    }

    public DokumentacijaPartije dokumentacijaPartijeCreateDtoToDokumentacijaPartije(DokumentacijaPartijeCreateDto dokumentacijaPartijeCreateDto){

        Optional<Partija> partija = partijaRepo.findById(dokumentacijaPartijeCreateDto.getPartija());

        if(!partija.isPresent()){
            throw new NotFoundException("Partija sa datim id ne postoji.");
        }

        DokumentacijaPartije dp = new DokumentacijaPartije();
        dp.setDoc1(dokumentacijaPartijeCreateDto.getDoc1());
        dp.setDoc2(dokumentacijaPartijeCreateDto.getDoc2());
        dp.setPartija(partija.get());
        return dp;
    }

    public DokumentacijaPartije updateDtoToOriginal(DokumentacijaPartijeUpdateDto dokumentacijaPartijeUpdateDto , DokumentacijaPartije dokumentacijaPartije){

        if(dokumentacijaPartijeUpdateDto.getDoc1() != null)
            dokumentacijaPartije.setDoc1(dokumentacijaPartijeUpdateDto.getDoc1());
        if(dokumentacijaPartijeUpdateDto.getDoc2() != null)
            dokumentacijaPartije.setDoc2(dokumentacijaPartijeUpdateDto.getDoc2());

        return dokumentacijaPartije;
    }

}
