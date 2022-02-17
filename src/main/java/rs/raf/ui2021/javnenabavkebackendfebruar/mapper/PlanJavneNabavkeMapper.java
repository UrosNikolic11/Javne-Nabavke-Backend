package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import javassist.NotFoundException;
import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PlanJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PlanJavneNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.PlanJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.GodisnjiPlanJavnihNabavkiRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.NarucilacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.ObjavaPlanaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PredlogNabavkeRepository;

@Component
public class PlanJavneNabavkeMapper {

    private final GodisnjiPlanJavnihNabavkiRepository godisnjiPlanJavnihNabavkiRepository;
    private final PredlogNabavkeRepository predlogNabavkeRepository;
    private final NarucilacRepository narucilacRepository;
    private final ObjavaPlanaRepository objavaPlanaRepository;

    public PlanJavneNabavkeMapper(GodisnjiPlanJavnihNabavkiRepository godisnjiPlanJavnihNabavkiRepository, PredlogNabavkeRepository predlogNabavkeRepository, NarucilacRepository narucilacRepository, ObjavaPlanaRepository objavaPlanaRepository) {
        this.godisnjiPlanJavnihNabavkiRepository = godisnjiPlanJavnihNabavkiRepository;
        this.predlogNabavkeRepository = predlogNabavkeRepository;
        this.narucilacRepository = narucilacRepository;
        this.objavaPlanaRepository = objavaPlanaRepository;
    }

    public PlanJavneNabavkeDto planJavneNabavkeToPlanJavneNabavkeDto(PlanJavneNabavke planJavneNabavke) {
        PlanJavneNabavkeDto planJavneNabavkeDto = new PlanJavneNabavkeDto();
        planJavneNabavkeDto.setId(planJavneNabavke.getId());
        planJavneNabavkeDto.setGodinaPlana(planJavneNabavke.getGodinaPlana());
        planJavneNabavkeDto.setStatusPlana(planJavneNabavke.getStatusPlana());
        planJavneNabavkeDto.setVerzijaPlana(planJavneNabavke.getVerzijaPlana());
        planJavneNabavkeDto.setDatumUsvajanja(planJavneNabavke.getDatumUsvajanja());
        planJavneNabavkeDto.setDatumSlanjaNaObjavu(planJavneNabavke.getDatumSlanjaNaObjavu());
        planJavneNabavkeDto.setGodisnjiPlanJavnihNabavkiId(planJavneNabavke.getGodisnjiPlanJavnihNabavki().getId());
        planJavneNabavkeDto.setPredlogNabavkeId(planJavneNabavke.getPredlogNabavke().getId());
        planJavneNabavkeDto.setNarucilacId(planJavneNabavke.getNarucilac().getId());
//        planJavneNabavkeDto.setObjavaPlanaId(planJavneNabavke.getObjavaPlana().getId());
        return planJavneNabavkeDto;
    }

    public PlanJavneNabavke planJavneNabavkeCreateDtoToPlanJavneNabavke(PlanJavneNabavkeCreateDto planJavneNabavkeCreateDto) throws NotFoundException {
        PlanJavneNabavke planJavneNabavke = new PlanJavneNabavke();
        planJavneNabavke.setGodinaPlana(planJavneNabavkeCreateDto.getGodinaPlana());
        planJavneNabavke.setStatusPlana(planJavneNabavkeCreateDto.getStatusPlana());
        planJavneNabavke.setVerzijaPlana(planJavneNabavkeCreateDto.getVerzijaPlana());
        planJavneNabavke.setDatumUsvajanja(planJavneNabavke.parseDate(planJavneNabavkeCreateDto.getDatumUsvajanja()));
        planJavneNabavke.setDatumSlanjaNaObjavu(planJavneNabavke.parseDate(planJavneNabavkeCreateDto.getDatumSlanjaNaObjavu()));

        planJavneNabavke.setGodisnjiPlanJavnihNabavki(godisnjiPlanJavnihNabavkiRepository.findById(planJavneNabavkeCreateDto.getGodisnjiPlanJavnihNabavkiId())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Godisnji plan javnih nabavki sa ID-jem '%d' nije pronadjen.", planJavneNabavkeCreateDto.getGodisnjiPlanJavnihNabavkiId()))));

        planJavneNabavke.setPredlogNabavke(predlogNabavkeRepository.findById(planJavneNabavkeCreateDto.getPredlogNabavkeId())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Predlog nabavke sa ID-jem '%d' nije pronadjen.", planJavneNabavkeCreateDto.getPredlogNabavkeId()))));

        planJavneNabavke.setNarucilac(narucilacRepository.findById(planJavneNabavkeCreateDto.getNarucilacId())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Narucilac sa ID-jem '%d' nije pronadjen.", planJavneNabavkeCreateDto.getNarucilacId()))));

//        planJavneNabavke.setObjavaPlana(objavaPlanaRepository.findById(planJavneNabavkeCreateDto.getObjavaPlanaId())
//                .orElseThrow(() -> new NotFoundException(String
//                        .format("Objava plana sa ID-jem '%d' nije pronadjena.", planJavneNabavkeCreateDto.getObjavaPlanaId()))));
        return planJavneNabavke;
    }
}
