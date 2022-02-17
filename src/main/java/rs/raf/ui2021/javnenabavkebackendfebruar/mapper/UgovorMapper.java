package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.UgovorCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.UgovorDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.*;

import java.util.Optional;

@Component
public class UgovorMapper {

    private JavnaNabavkaRepository javnaNabavkaRepository;
    private NarucilacRepository narucilacRepository;
    private PonudjacRepository ponudjacRepository;
    private OkvirniSporazumRepository okvirniSporazumRepository;
    private PonudaRepository ponudaRepository;

    public UgovorMapper(JavnaNabavkaRepository javnaNabavkaRepository, NarucilacRepository narucilacRepository, PonudjacRepository ponudjacRepository,
                        OkvirniSporazumRepository okvirniSporazumRepository, PonudaRepository ponudaRepository) {
        this.javnaNabavkaRepository = javnaNabavkaRepository;
        this.narucilacRepository = narucilacRepository;
        this.ponudjacRepository = ponudjacRepository;
        this.okvirniSporazumRepository = okvirniSporazumRepository;
        this.ponudaRepository = ponudaRepository;
    }

    public Ugovor createDtoToOriginal(UgovorCreateDto ugovorCreateDto){
        Ugovor ugovor = new Ugovor();


        Optional<JavnaNabavka> javnaNabavka = javnaNabavkaRepository.findById(ugovorCreateDto.getJavnaNabavkaId());
        Optional<Ponudjac> ponudjac = ponudjacRepository.findById(ugovorCreateDto.getPonudjacId());
        Optional<Narucilac> narucilac = narucilacRepository.findById(ugovorCreateDto.getNarucilacId());

        if(!javnaNabavka.isPresent()){
            throw new NotFoundException("Javna nabavka sa datim id ne postoji.");
        }
        if(!ponudjac.isPresent()){
            throw new NotFoundException("Ponudjac sa datim id ne postoji.");
        }
        if(!narucilac.isPresent()){
            throw new NotFoundException("Narucilac sa datim id ne postoji.");
        }
        if(ugovorCreateDto.getOkvirniSporazumId() != null){
            Optional<OkvirniSporazum> okvirniSporazum = okvirniSporazumRepository.findById(ugovorCreateDto.getOkvirniSporazumId());

            if(!okvirniSporazum.isPresent())
                throw new NotFoundException("Okvirni sporazum sa datim id ne postoji.");

            ugovor.setOkvirniSporazum(okvirniSporazum.get());
        }
        ugovor.setJavnaNabavka(javnaNabavka.get());
        ugovor.setNarucilac(narucilac.get());
        ugovor.setPonudjac(ponudjac.get());

        Optional<Ponuda> ponuda = ponudaRepository.findPonudaByJavnaNabavka(javnaNabavka.get());
        ponudaRepository.delete(ponuda.get());
        return ugovor;
    }

    public UgovorDto originalToDto(Ugovor ugovor){
        UgovorDto ugovorDto = new UgovorDto();
        ugovorDto.setId(ugovor.getId());
        ugovorDto.setJavnaNabavkaId(ugovor.getJavnaNabavka().getId());
        ugovorDto.setNarucilacId(ugovor.getNarucilac().getId());
        ugovorDto.setPonudjacId(ugovor.getPonudjac().getId());
        if(ugovor.getOkvirniSporazum() != null)
            ugovorDto.setOkvirniSporazumId(ugovor.getOkvirniSporazum().getId());
        else
            ugovorDto.setOkvirniSporazumId(null);

        return ugovorDto;
    }
}
