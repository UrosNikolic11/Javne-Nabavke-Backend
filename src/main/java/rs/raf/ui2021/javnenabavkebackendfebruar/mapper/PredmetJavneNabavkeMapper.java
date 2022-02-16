package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import javassist.NotFoundException;
import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PredmetJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PredmetJavneNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.PredmetJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.StavkaJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PredmetJavneNabavkeRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.StavkaJavneNabavkeRepository;

@Component
public class PredmetJavneNabavkeMapper {
    private final StavkaJavneNabavkeRepository stavkaJavneNabavkeRepository;

    public PredmetJavneNabavkeMapper(StavkaJavneNabavkeRepository stavkaJavneNabavkeRepository) {
        this.stavkaJavneNabavkeRepository = stavkaJavneNabavkeRepository;
    }

    public PredmetJavneNabavkeDto predmetJNToPredmetJNDto(PredmetJavneNabavke predmetJavneNabavke){
        PredmetJavneNabavkeDto predmetJavneNabavkeDto = new PredmetJavneNabavkeDto();
        predmetJavneNabavkeDto.setId(predmetJavneNabavke.getId());
        predmetJavneNabavkeDto.setNaziv(predmetJavneNabavke.getNaziv());
        predmetJavneNabavkeDto.setVrsta(predmetJavneNabavke.getVrsta());
        predmetJavneNabavkeDto.setKategorija(predmetJavneNabavke.getKategorija());
        predmetJavneNabavkeDto.setStavkaJavneNabavke_id(predmetJavneNabavke.getStavkaJavneNabavke().getId());
        return predmetJavneNabavkeDto;
    }

    public PredmetJavneNabavke predmetJNCreateDtoToPredmetJN(PredmetJavneNabavkeCreateDto predmetJNCreateDto) throws NotFoundException {
        PredmetJavneNabavke predmetJN = new PredmetJavneNabavke();
        predmetJN.setNaziv(predmetJNCreateDto.getNaziv());
        predmetJN.setVrsta(predmetJNCreateDto.getVrsta());
        predmetJN.setKategorija(predmetJNCreateDto.getKategorija());
        predmetJN.setStavkaJavneNabavke(stavkaJavneNabavkeRepository.findById(predmetJNCreateDto.getStavkaJavneNabavke_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("User with id: %d does not exists.", predmetJNCreateDto.getStavkaJavneNabavke_id()))));
        return predmetJN;
    }
}
