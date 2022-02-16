package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PredlogNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PredlogNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.PredlogNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PredlogNabavkeRepository;

@Component
public class PredlogNabavkeMapper {
    public PredlogNabavkeDto predlogNabavkeToPredlogNabavkeDto(PredlogNabavke predlogNabavke){
            PredlogNabavkeDto predlogNabavkeDto = new PredlogNabavkeDto();
            predlogNabavkeDto.setId(predlogNabavke.getId());
            predlogNabavkeDto.setOdobren(predlogNabavke.getOdobren());
        return predlogNabavkeDto;
    }

    public PredlogNabavke predlogNabavkeCreateDtoToPredlogNabavke(PredlogNabavkeCreateDto predlogNabavkeCreateDto){
        PredlogNabavke predlogNabavke = new PredlogNabavke();
        predlogNabavke.setOdobren(predlogNabavkeCreateDto.getOdobren());
        return predlogNabavke;
    }
}
