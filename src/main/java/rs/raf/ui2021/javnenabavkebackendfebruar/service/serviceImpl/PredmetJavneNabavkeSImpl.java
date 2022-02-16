package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PredmetJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PredmetJavneNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.PredmetJavneNabavkeMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.PredmetJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PredmetJavneNabavkeRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PredmetJavneNabavkeService;

@Service

public class PredmetJavneNabavkeSImpl implements PredmetJavneNabavkeService {

    private PredmetJavneNabavkeRepository predmetJavneNabavkeRepository;
    private PredmetJavneNabavkeMapper predmetJavneNabavkeMapper;

    public PredmetJavneNabavkeSImpl(PredmetJavneNabavkeRepository predmetJavneNabavkeRepository, PredmetJavneNabavkeMapper predmetJavneNabavkeMapper) {
        this.predmetJavneNabavkeRepository = predmetJavneNabavkeRepository;
        this.predmetJavneNabavkeMapper = predmetJavneNabavkeMapper;
    }

    @Override
    public Page<PredmetJavneNabavkeDto> findAll(Pageable pageable) {
        return predmetJavneNabavkeRepository.findAll(pageable)
                .map(predmetJavneNabavkeMapper::predmetJNToPredmetJNDto);
    }

    @Override
    public PredmetJavneNabavkeDto add(PredmetJavneNabavkeCreateDto predmetJavneNabavkeCreateDto) throws javassist.NotFoundException {
        PredmetJavneNabavke predmetJavneNabavke = predmetJavneNabavkeMapper.predmetJNCreateDtoToPredmetJN(predmetJavneNabavkeCreateDto);
        predmetJavneNabavkeRepository.save(predmetJavneNabavke);
        return predmetJavneNabavkeMapper.predmetJNToPredmetJNDto(predmetJavneNabavke);
    }

    @Override
    public PredmetJavneNabavkeDto findById(Long id) {
        return predmetJavneNabavkeRepository.findById(id)
                .map(predmetJavneNabavkeMapper::predmetJNToPredmetJNDto)
                .orElseThrow(() -> new NotFoundException(String.format("Predmet javne nabavke sa id: %d nije pronadjen.", id)));
    }

    @Override
    public void deleteById(Long id) {
        predmetJavneNabavkeRepository.deleteById(id);
    }

    @Override
    public void updatePredmetJavneNabavke(Long id, PredmetJavneNabavkeCreateDto predmetJavneNabavkeCreateDto) {
        PredmetJavneNabavke predmetJavneNabavke = predmetJavneNabavkeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Predmet javne nabavke sa id: %d nije pronadjen.", id)));
        predmetJavneNabavke.setNaziv(predmetJavneNabavkeCreateDto.getNaziv());
        predmetJavneNabavke.setVrsta(predmetJavneNabavkeCreateDto.getVrsta());
        predmetJavneNabavke.setKategorija(predmetJavneNabavkeCreateDto.getKategorija());
        predmetJavneNabavkeRepository.save(predmetJavneNabavke);
    }
}
