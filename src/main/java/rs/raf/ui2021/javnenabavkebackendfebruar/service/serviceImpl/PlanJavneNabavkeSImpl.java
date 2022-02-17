package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PlanJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PlanJavneNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.PlanJavneNabavkeMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.PlanJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.NarucilacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PlanJavneNabavkeRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PlanJavneNabavkeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class PlanJavneNabavkeSImpl implements PlanJavneNabavkeService {

    private PlanJavneNabavkeRepository planJavneNabavkeRepository;
    private PlanJavneNabavkeMapper planJavneNabavkeMapper;
    private NarucilacRepository narucilacRepository;

    public PlanJavneNabavkeSImpl(PlanJavneNabavkeRepository planJavneNabavkeRepository, PlanJavneNabavkeMapper planJavneNabavkeMapper, NarucilacRepository narucilacRepository) {
        this.planJavneNabavkeRepository = planJavneNabavkeRepository;
        this.planJavneNabavkeMapper = planJavneNabavkeMapper;
        this.narucilacRepository = narucilacRepository;
    }


    @Override
    public Page<PlanJavneNabavkeDto> findAll(Pageable pageable) {
        return planJavneNabavkeRepository.findAll(pageable)
                .map(planJavneNabavkeMapper::planJavneNabavkeToPlanJavneNabavkeDto);
    }

    @Override
    public PlanJavneNabavkeDto add(PlanJavneNabavkeCreateDto planJavneNabavkeCreateDto) throws javassist.NotFoundException {
        PlanJavneNabavke planJavneNabavke = planJavneNabavkeMapper.planJavneNabavkeCreateDtoToPlanJavneNabavke(planJavneNabavkeCreateDto);
        planJavneNabavkeRepository.save(planJavneNabavke);
        return planJavneNabavkeMapper.planJavneNabavkeToPlanJavneNabavkeDto(planJavneNabavke);
    }

    @Override
    public PlanJavneNabavkeDto findById(Long id) {
        return planJavneNabavkeRepository.findById(id)
                .map(planJavneNabavkeMapper::planJavneNabavkeToPlanJavneNabavkeDto)
                .orElseThrow(() -> new NotFoundException(String.format("Plan javne nabavke sa id: %d nije pronadjen.", id)));
    }

    @Override
    public void deleteById(Long id) {
        planJavneNabavkeRepository.deleteById(id);
    }

    @Override
    public void updatePlanJavneNabavke(Long id, PlanJavneNabavkeCreateDto planJavneNabavkeCreateDto) {
        PlanJavneNabavke planJavneNabavke = planJavneNabavkeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Plan javne nabavke sa id: %d nije pronadjen.", id)));
        planJavneNabavke.setGodinaPlana(planJavneNabavkeCreateDto.getGodinaPlana());
        planJavneNabavke.setStatusPlana(planJavneNabavkeCreateDto.getStatusPlana());
        planJavneNabavke.setVerzijaPlana(planJavneNabavkeCreateDto.getVerzijaPlana());
        planJavneNabavke.setDatumUsvajanja(planJavneNabavke.parseDate(planJavneNabavkeCreateDto.getDatumUsvajanja()));
        planJavneNabavke.setDatumSlanjaNaObjavu(planJavneNabavke.parseDate(planJavneNabavkeCreateDto.getDatumSlanjaNaObjavu()));
        planJavneNabavkeRepository.save(planJavneNabavke);
    }

    @Override
    public List<PlanJavneNabavkeDto> vrati(Long narucilacId) {
      List<PlanJavneNabavkeDto> lista = new ArrayList<>();
        Optional<Narucilac> narucilac = narucilacRepository.findById(narucilacId);
        for(PlanJavneNabavke p: planJavneNabavkeRepository.findPlanJavneNabavkesByNarucilac(narucilac.get())){
            lista.add(planJavneNabavkeMapper.planJavneNabavkeToPlanJavneNabavkeDto(p));
        }

        return lista;
    }
}
