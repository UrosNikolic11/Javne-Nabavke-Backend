package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PredlogNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PredlogNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.PredlogNabavkeMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.PredlogNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PredlogNabavkeRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PredlogNabavkeService;

@Service

public class PredlogNabavkeSImpl implements PredlogNabavkeService {

    private PredlogNabavkeRepository predlogNabavkeRepository;
    private PredlogNabavkeMapper predlogNabavkeMapper;

    public PredlogNabavkeSImpl(PredlogNabavkeRepository predlogNabavkeRepository, PredlogNabavkeMapper predlogNabavkeMapper) {
        this.predlogNabavkeRepository = predlogNabavkeRepository;
        this.predlogNabavkeMapper = predlogNabavkeMapper;
    }

    @Override
    public Page<PredlogNabavkeDto> findAll(Pageable pageable) {
        return predlogNabavkeRepository.findAll(pageable)
                .map(predlogNabavkeMapper::predlogNabavkeToPredlogNabavkeDto);
    }

    @Override
    public PredlogNabavkeDto add(PredlogNabavkeCreateDto predlogNabavkeCreateDto) throws javassist.NotFoundException {
        PredlogNabavke predlogNabavke = predlogNabavkeMapper.predlogNabavkeCreateDtoToPredlogNabavke(predlogNabavkeCreateDto);
        predlogNabavkeRepository.save(predlogNabavke);
        return predlogNabavkeMapper.predlogNabavkeToPredlogNabavkeDto(predlogNabavke);
    }

    @Override
    public PredlogNabavkeDto findById(Long id) {
        return predlogNabavkeRepository.findById(id)
                .map(predlogNabavkeMapper::predlogNabavkeToPredlogNabavkeDto)
                .orElseThrow(() -> new NotFoundException(String.format("Godisnji plan sa id: %d nije pronadjen.", id)));
    }

    @Override
    public void deleteById(Long id) {
        predlogNabavkeRepository.deleteById(id);
    }

    @Override
    public void updatePredlogNabavke(Long id, PredlogNabavkeCreateDto predlogNabavkeCreateDto) {
        PredlogNabavke predlogNabavke = predlogNabavkeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Predlog nabavke sa id: %d nije pronadjen.", id)));
        predlogNabavke.setOdobren(predlogNabavkeCreateDto.getOdobren());
        predlogNabavkeRepository.save(predlogNabavke);
    }
}
