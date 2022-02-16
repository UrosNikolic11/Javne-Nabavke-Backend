package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import javassist.NotFoundException;
import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.GodisnjiPlanJavnihNabavkiCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.GodisnjiPlanJavnihNabavkiDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.GodisnjiPlanJavnihNabavki;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PreduzeceRepository;

import java.util.ArrayList;

@Component
public class GodisnjiPlanJavnihNabavkiMapper {

    private final PreduzeceRepository preduzeceReposotory;

    public GodisnjiPlanJavnihNabavkiMapper(PreduzeceRepository preduzeceReposotory) {
        this.preduzeceReposotory = preduzeceReposotory;
    }

    public GodisnjiPlanJavnihNabavkiDto godisnjiPlanToGodisnjiPlanDto(GodisnjiPlanJavnihNabavki godisnjiPlanJavnihNabavki) {
        GodisnjiPlanJavnihNabavkiDto godisnjiPlanJavnihNabavkiDto = new GodisnjiPlanJavnihNabavkiDto();
        godisnjiPlanJavnihNabavkiDto.setId(godisnjiPlanJavnihNabavki.getId());
        godisnjiPlanJavnihNabavkiDto.setGodina(godisnjiPlanJavnihNabavki.getGodina());
        godisnjiPlanJavnihNabavkiDto.setObjavljen(godisnjiPlanJavnihNabavki.getObjavljen());
        godisnjiPlanJavnihNabavkiDto.setPreduzeceId(godisnjiPlanJavnihNabavki.getPreduzece().getId());
        return godisnjiPlanJavnihNabavkiDto;
    }

    public GodisnjiPlanJavnihNabavki godisnjiPlanCreateDtoToGodisnjiPlan(GodisnjiPlanJavnihNabavkiCreateDto godisnjiPlanJavnihNabavkiCreateDto) throws NotFoundException {
        GodisnjiPlanJavnihNabavki godisnjiPlanJavnihNabavki = new GodisnjiPlanJavnihNabavki();
        godisnjiPlanJavnihNabavki.setGodina(godisnjiPlanJavnihNabavkiCreateDto.getGodina());
        godisnjiPlanJavnihNabavki.setObjavljen(godisnjiPlanJavnihNabavkiCreateDto.getObjavljen());
        godisnjiPlanJavnihNabavki.setPlanJavneNabavkeList(new ArrayList<>());

        godisnjiPlanJavnihNabavki.setPreduzece(preduzeceReposotory.findById(godisnjiPlanJavnihNabavkiCreateDto.getPreduzeceId())
                .orElseThrow(() -> new NotFoundException(String
                        .format("User with id: %d does not exists.", godisnjiPlanJavnihNabavkiCreateDto.getPreduzeceId()))));

        return godisnjiPlanJavnihNabavki;

    }
}
