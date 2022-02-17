package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;


import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.StavkaJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.StavkaJavneNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.StavkaJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PlanJavneNabavkeRepository;

@Component
public class StavkaJavneNabavkeMapper {
    private final JavnaNabavkaRepository javnaNabavkaRepository;
    private final PlanJavneNabavkeRepository planJavneNabavkeRepository;

    public StavkaJavneNabavkeMapper(JavnaNabavkaRepository javnaNabavkaRepository, PlanJavneNabavkeRepository planJavneNabavkeRepository) {
        this.javnaNabavkaRepository = javnaNabavkaRepository;
        this.planJavneNabavkeRepository = planJavneNabavkeRepository;
    }

    public StavkaJavneNabavkeDto stavkaJNToStavkaJNDto(StavkaJavneNabavke stavkaJN){
        StavkaJavneNabavkeDto stavkaJNDto = new StavkaJavneNabavkeDto();
        stavkaJNDto.setId(stavkaJN.getId());
        stavkaJNDto.setProcenjenaVrednost(stavkaJN.getProcenjenaVrednost());
        stavkaJNDto.setObjavaProcenjeneVrednosti(stavkaJN.getObjavaProcenjeneVrednosti());
        stavkaJNDto.setOkvirnoVreme(stavkaJN.getOkvirnoVreme());
        stavkaJNDto.setKratakOpis(stavkaJN.getKratakOpis());
        stavkaJNDto.setCPVOznaka(stavkaJN.getCpvOznaka());
        stavkaJNDto.setNSTJIzvsenja(stavkaJN.getNstjOznaka());
        stavkaJNDto.setKomentar(stavkaJN.getKomentar());
        stavkaJNDto.setJavnaNabavka_id(stavkaJN.getJavnaNabavka().getId());
        stavkaJNDto.setPlanJavneNabavke_id(stavkaJN.getPlanJavneNabavke().getId());
        return stavkaJNDto;
    }

    public StavkaJavneNabavke stavkaJNCreateDtoToStavkaJN(StavkaJavneNabavkeCreateDto stavkaJavneNabavkeCreateDto) {
        System.out.println("primac " + stavkaJavneNabavkeCreateDto);
        StavkaJavneNabavke stavkaJavneNabavke = new StavkaJavneNabavke();
        stavkaJavneNabavke.setProcenjenaVrednost(stavkaJavneNabavkeCreateDto.getProcenjenaVrednost());
        stavkaJavneNabavke.setObjavaProcenjeneVrednosti(stavkaJavneNabavkeCreateDto.getObjavaProcenjeneVrednosti());
        stavkaJavneNabavke.setOkvirnoVreme(stavkaJavneNabavkeCreateDto.getOkvirnoVreme());
        stavkaJavneNabavke.setKratakOpis(stavkaJavneNabavkeCreateDto.getKratakOpis());
        stavkaJavneNabavke.setCpvOznaka(stavkaJavneNabavkeCreateDto.getCpvOznaka());
        stavkaJavneNabavke.setNstjOznaka(stavkaJavneNabavkeCreateDto.getNstjOznaka());
        stavkaJavneNabavke.setKomentar(stavkaJavneNabavkeCreateDto.getKomentar());
        stavkaJavneNabavke.setJavnaNabavka(javnaNabavkaRepository.findById(stavkaJavneNabavkeCreateDto.getJavnaNabavka_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Javna nabavka sa ID-jem '%d' ne postoji.", stavkaJavneNabavkeCreateDto.getJavnaNabavka_id()))));
        stavkaJavneNabavke.setPlanJavneNabavke(planJavneNabavkeRepository.findById(stavkaJavneNabavkeCreateDto.getPlanJavneNabavke_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Plan javne nabavke sa ID-jem '%d' ne postoji.", stavkaJavneNabavkeCreateDto.getPlanJavneNabavke_id()))));
        System.out.println(stavkaJavneNabavke);
        return stavkaJavneNabavke;
    }
}
