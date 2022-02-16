package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.GodisnjiPlanJavnihNabavkiCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.GodisnjiPlanJavnihNabavkiDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.GodisnjiPlanJavnihNabavkiMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.GodisnjiPlanJavnihNabavki;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.GodisnjiPlanJavnihNabavkiRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.GodisnjiPlanJavnihNabavkiService;

@Service

public class GodisnjiPlanJavnihNabavkiSImpl implements GodisnjiPlanJavnihNabavkiService {

    private GodisnjiPlanJavnihNabavkiRepository godisnjiPlanJavnihNabavkiRepository;
    private GodisnjiPlanJavnihNabavkiMapper godisnjiPlanJavnihNabavkiMapper;

    public GodisnjiPlanJavnihNabavkiSImpl(GodisnjiPlanJavnihNabavkiRepository godisnjiPlanJavnihNabavkiRepository,
                                          GodisnjiPlanJavnihNabavkiMapper godisnjiPlanJavnihNabavkiMapper) {
        this.godisnjiPlanJavnihNabavkiRepository = godisnjiPlanJavnihNabavkiRepository;
        this.godisnjiPlanJavnihNabavkiMapper = godisnjiPlanJavnihNabavkiMapper;
    }

    @Override
    public Page<GodisnjiPlanJavnihNabavkiDto> findAll(Pageable pageable) {
        return godisnjiPlanJavnihNabavkiRepository.findAll(pageable)
                .map(godisnjiPlanJavnihNabavkiMapper::godisnjiPlanToGodisnjiPlanDto);
    }

    @Override
    public GodisnjiPlanJavnihNabavkiDto add(GodisnjiPlanJavnihNabavkiCreateDto godisnjiPlanJavnihNabavkiCreateDto) throws javassist.NotFoundException {
        GodisnjiPlanJavnihNabavki godisnjiPlanJavnihNabavki = godisnjiPlanJavnihNabavkiMapper.godisnjiPlanCreateDtoToGodisnjiPlan(godisnjiPlanJavnihNabavkiCreateDto);
        godisnjiPlanJavnihNabavkiRepository.save(godisnjiPlanJavnihNabavki);
        return godisnjiPlanJavnihNabavkiMapper.godisnjiPlanToGodisnjiPlanDto(godisnjiPlanJavnihNabavki);
    }

    @Override
    public GodisnjiPlanJavnihNabavkiDto findById(Long id) {
        return godisnjiPlanJavnihNabavkiRepository.findById(id)
                .map(godisnjiPlanJavnihNabavkiMapper::godisnjiPlanToGodisnjiPlanDto)
                .orElseThrow(() -> new NotFoundException(String.format("Godisnji plan sa id: %d nije pronadjen.", id)));
    }

    @Override
    public void deleteById(Long id) {
        godisnjiPlanJavnihNabavkiRepository.deleteById(id);
    }

    @Override
    public void updateGodisnjiPlanJavnihNabavki(Long id, GodisnjiPlanJavnihNabavkiCreateDto godisnjiPlanJavnihNabavkiCreateDto) {
        GodisnjiPlanJavnihNabavki godisnjiPlanJavnihNabavki = godisnjiPlanJavnihNabavkiRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Godisnji plan sa id: %d nije pronadjen.", id)));
        godisnjiPlanJavnihNabavki.setGodina(godisnjiPlanJavnihNabavkiCreateDto.getGodina());
        godisnjiPlanJavnihNabavki.setObjavljen(godisnjiPlanJavnihNabavkiCreateDto.getObjavljen());
        godisnjiPlanJavnihNabavkiRepository.save(godisnjiPlanJavnihNabavki);
    }
}
