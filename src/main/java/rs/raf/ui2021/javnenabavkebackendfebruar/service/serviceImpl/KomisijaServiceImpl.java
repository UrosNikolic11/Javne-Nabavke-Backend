package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KomisijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KomisijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KomisijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.KomisijaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Komisija;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.KomisijaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.KomisijaService;

import java.util.Optional;

@Service
public class KomisijaServiceImpl implements KomisijaService {

    private KomisijaRepository komisijaRepository;
    private KomisijaMapper komisijaMapper;

    public KomisijaServiceImpl(KomisijaRepository komisijaRepository, KomisijaMapper komisijaMapper) {
        this.komisijaRepository = komisijaRepository;
        this.komisijaMapper = komisijaMapper;
    }

    @Override
    public KomisijaDto create(KomisijaCreateDto komisijaCreateDto) {

        Komisija komisija = komisijaMapper.komisijaCreateDtoToKomisija(komisijaCreateDto);
        komisijaRepository.save(komisija);
        return komisijaMapper.komisijaToKomisijaDto(komisija);
    }

    @Override
    public Page<KomisijaDto> findAll(Pageable pageable) {
        return komisijaRepository.findAll(pageable)
                .map(komisijaMapper::komisijaToKomisijaDto);
    }

    @Override
    public KomisijaDto findById(Long id) {
        Optional<Komisija> komisija = komisijaRepository.findById(id);
        if(!komisija.isPresent())
            throw new NotFoundException("Komisija sa zadatim ID ne postoji.");
        Komisija k = komisijaRepository.findKomisijaById(id);
        return komisijaMapper.komisijaToKomisijaDto(k);
    }

    @Override
    public KomisijaDto update(Long id, KomisijaUpdateDto komisijaUpdateDto) {
        Optional<Komisija> komisija = komisijaRepository.findById(id);
        if(!komisija.isPresent())
            throw new NotFoundException("Komisija sa zadatim ID ne postoji.");
        Komisija k = komisijaMapper.komisijaUpdateDtoToKomisija(komisijaUpdateDto, komisija.get());
        komisijaRepository.save(k);
        return komisijaMapper.komisijaToKomisijaDto(k);
    }

    @Override
    public void delete(Long id) {
        Optional<Komisija> komisija = komisijaRepository.findById(id);
        if(!komisija.isPresent())
            throw new NotFoundException("Komisija sa zadatim ID ne postoji.");
        komisijaRepository.deleteById(id);
    }
}
