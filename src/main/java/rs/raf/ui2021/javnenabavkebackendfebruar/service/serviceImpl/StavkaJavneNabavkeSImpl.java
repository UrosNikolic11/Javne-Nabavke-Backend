package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.StavkaJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.StavkaJavneNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.StavkaJavneNabavkeMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.StavkaJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.StavkaJavneNabavkeRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.StavkaJavneNabavkeService;

@Service

public class StavkaJavneNabavkeSImpl implements StavkaJavneNabavkeService {

    private StavkaJavneNabavkeRepository stavkaJavneNabavkeRepository;
    private StavkaJavneNabavkeMapper stavkaJavneNabavkeMapper;

    public StavkaJavneNabavkeSImpl(StavkaJavneNabavkeRepository stavkaJavneNabavkeRepository, StavkaJavneNabavkeMapper stavkaJavneNabavkeMapper) {
        this.stavkaJavneNabavkeRepository = stavkaJavneNabavkeRepository;
        this.stavkaJavneNabavkeMapper = stavkaJavneNabavkeMapper;
    }

    @Override
    public Page<StavkaJavneNabavkeDto> findAll(Pageable pageable) {
        return stavkaJavneNabavkeRepository.findAll(pageable)
                .map(stavkaJavneNabavkeMapper::stavkaJNToStavkaJNDto);
    }

    @Override
    public StavkaJavneNabavkeDto add(StavkaJavneNabavkeCreateDto stavkaJavneNabavkeCreateDto)  {

        StavkaJavneNabavke stavkaJavneNabavke = stavkaJavneNabavkeMapper.stavkaJNCreateDtoToStavkaJN(stavkaJavneNabavkeCreateDto);
        stavkaJavneNabavkeRepository.save(stavkaJavneNabavke);
        return stavkaJavneNabavkeMapper.stavkaJNToStavkaJNDto(stavkaJavneNabavke);
    }

    @Override
    public StavkaJavneNabavkeDto findById(Long id) {
        return stavkaJavneNabavkeRepository.findById(id)
                .map(stavkaJavneNabavkeMapper::stavkaJNToStavkaJNDto)
                .orElseThrow(() -> new NotFoundException(String.format("Stavka javne nabavke sa id: %d nije pronadjena.", id)));
    }

    @Override
    public void deleteById(Long id) {
        stavkaJavneNabavkeRepository.deleteById(id);
    }

    @Override
    public void updateStavkaJavneNabavke(Long id, StavkaJavneNabavkeCreateDto stavkaJavneNabavkeCreateDto) {
        StavkaJavneNabavke stavkaJavneNabavke = stavkaJavneNabavkeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Stavka javne nabavke sa id: %d nije pronadjena.", id)));
        stavkaJavneNabavke.setKomentar(stavkaJavneNabavkeCreateDto.getKomentar());
        stavkaJavneNabavke.setKratakOpis(stavkaJavneNabavkeCreateDto.getKratakOpis());
        stavkaJavneNabavke.setCpvOznaka(stavkaJavneNabavkeCreateDto.getCpvOznaka());
        stavkaJavneNabavke.setNstjOznaka(stavkaJavneNabavkeCreateDto.getNstjOznaka());
        stavkaJavneNabavke.setProcenjenaVrednost(stavkaJavneNabavkeCreateDto.getProcenjenaVrednost());
        stavkaJavneNabavke.setObjavaProcenjeneVrednosti(stavkaJavneNabavkeCreateDto.getObjavaProcenjeneVrednosti());
        stavkaJavneNabavke.setOkvirnoVreme(stavkaJavneNabavkeCreateDto.getOkvirnoVreme());
        stavkaJavneNabavkeRepository.save(stavkaJavneNabavke);
    }
}
