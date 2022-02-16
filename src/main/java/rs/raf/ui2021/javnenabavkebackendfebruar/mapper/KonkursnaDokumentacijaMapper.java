package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KonkursnaDokumentacijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KonkursnaDokumentacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KonkursnaDokumentacijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.KonkursnaDokumentacija;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;

import java.util.Optional;

@Component
public class KonkursnaDokumentacijaMapper {

    private JavnaNabavkaRepository javnaNabavkaRepository;

    public KonkursnaDokumentacijaMapper(JavnaNabavkaRepository javnaNabavkaRepository) {
        this.javnaNabavkaRepository = javnaNabavkaRepository;
    }

    public KonkursnaDokumentacija createDtoToOriginal(KonkursnaDokumentacijaCreateDto konkursnaDokumentacijaCreateDto){
        KonkursnaDokumentacija konkursnaDokumentacija = new KonkursnaDokumentacija();
        if(konkursnaDokumentacijaCreateDto.getDoc1() != null){
            konkursnaDokumentacija.setDoc1(konkursnaDokumentacijaCreateDto.getDoc1());
        }
        if(konkursnaDokumentacijaCreateDto.getDoc2() != null) {
            konkursnaDokumentacija.setDoc2(konkursnaDokumentacijaCreateDto.getDoc2());
        }

        Optional<JavnaNabavka> javnaNabavka = javnaNabavkaRepository.findById(konkursnaDokumentacijaCreateDto.getJavnaNabavkaId());
        if(!javnaNabavka.isPresent()){
                throw new NotFoundException("Javna nabavka sa datim id ne postoji.");
        }
        konkursnaDokumentacija.setJavnaNabavka(javnaNabavka.get());

        return konkursnaDokumentacija;
    }

    public KonkursnaDokumentacijaDto originalToDto(KonkursnaDokumentacija konkursnaDokumentacija){
        KonkursnaDokumentacijaDto konkursnaDokumentacijaDto = new KonkursnaDokumentacijaDto();
        konkursnaDokumentacijaDto.setId(konkursnaDokumentacija.getId());
        konkursnaDokumentacijaDto.setDoc1(konkursnaDokumentacija.getDoc1());
        konkursnaDokumentacijaDto.setDoc2(konkursnaDokumentacija.getDoc2());
        konkursnaDokumentacijaDto.setJavnaNabavkaId(konkursnaDokumentacija.getJavnaNabavka().getId());
        return konkursnaDokumentacijaDto;
    }

    public KonkursnaDokumentacija updateDtoToOriginal(KonkursnaDokumentacijaUpdateDto konkursnaDokumentacijaUpdateDto,
                                                      KonkursnaDokumentacija konkursnaDokumentacija){
        if(konkursnaDokumentacijaUpdateDto.getDoc1() != null){
            konkursnaDokumentacija.setDoc1(konkursnaDokumentacijaUpdateDto.getDoc1());
        }
        if(konkursnaDokumentacijaUpdateDto.getDoc2() != null){
            konkursnaDokumentacija.setDoc2(konkursnaDokumentacijaUpdateDto.getDoc2());
        }
        return konkursnaDokumentacija;
    }
}
