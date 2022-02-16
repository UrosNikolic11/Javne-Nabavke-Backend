package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.OkvirniSporazumCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.OkvirniSporazumDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.BadRequestException;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.OkvirniSporazumMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.OkvirniSporazum;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.OkvirniSporazumRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.OkvirniSporazumService;

import java.util.Optional;

@Service

public class OkvirniSporazumImpl implements OkvirniSporazumService {

    private OkvirniSporazumRepository okvirniSporazumRepository;
    private OkvirniSporazumMapper okvirniSporazumMapper;

    public OkvirniSporazumImpl(OkvirniSporazumRepository okvirniSporazumRepository, OkvirniSporazumMapper okvirniSporazumMapper) {
        this.okvirniSporazumRepository = okvirniSporazumRepository;
        this.okvirniSporazumMapper = okvirniSporazumMapper;
    }

    @Override
    public Page<OkvirniSporazumDto> findAll(Pageable pageable) {
        return okvirniSporazumRepository.findAll(pageable)
                .map(okvirniSporazumMapper::originalToDto);
    }

    @Override
    public OkvirniSporazumDto findById(Long id) {
        Optional<OkvirniSporazum> okvirniSporazum = okvirniSporazumRepository.findById(id);
        if (!okvirniSporazum.isPresent()){
            throw new NotFoundException("Okvirni sporazum sa datim id ne postoji.");
        }
        return okvirniSporazumMapper.originalToDto(okvirniSporazumRepository.findOkvirniSporazumById(id));
    }

    @Override
    public OkvirniSporazumDto create(OkvirniSporazumCreateDto okvirniSporazumCreateDto) {
        Optional<OkvirniSporazum> okvirniSporazum = okvirniSporazumRepository.findOkvirniSporazumByJavnaNabavka_Id(okvirniSporazumCreateDto.getJavnaNabavkaId());
        if(okvirniSporazum.isPresent()){
            //provera da se javna nabavka ne nalazi u vec postojecem sporazumu, cini mi se da nema smisla da se jn nalazi u vise sporazuma
            //narucilac i ponudjac mogu da se nadju na vise sporazuma
            throw new BadRequestException("Javna nabavka sa ovim id je vec u nekom okvirnom sporazumu.");
        }
        OkvirniSporazum okvirniSporazum1 = okvirniSporazumMapper.createToOriginal(okvirniSporazumCreateDto);
        okvirniSporazumRepository.save(okvirniSporazum1);
        return okvirniSporazumMapper.originalToDto(okvirniSporazum1);
    }

    @Override
    public void delete(Long id) {
        Optional<OkvirniSporazum> okvirniSporazum = okvirniSporazumRepository.findById(id);
        if (!okvirniSporazum.isPresent()){
            throw new NotFoundException("Okvirni sporazum sa datim id ne postoji.");
        }
        okvirniSporazumRepository.deleteById(id);
    }
}
