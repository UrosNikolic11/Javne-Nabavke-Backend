package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ZalbaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ZalbaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.ZalbaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Zalba;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.ZalbaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.ZalbaService;

@Service

public class ZalbaSImpl implements ZalbaService {

    private ZalbaRepository zalbaRepository;
    private ZalbaMapper zalbaMapper;

    public ZalbaSImpl(ZalbaRepository zalbaRepository, ZalbaMapper zalbaMapper) {
        this.zalbaRepository = zalbaRepository;
        this.zalbaMapper = zalbaMapper;
    }

    @Override
    public Page<ZalbaDto> findAll(Pageable pageable) {
        return zalbaRepository.findAll(pageable)
                .map(zalbaMapper::zalbaToZalbaDto);
    }

    @Override
    public ZalbaDto add(ZalbaCreateDto zalbaCreateDto) throws javassist.NotFoundException {
        Zalba zalba = zalbaMapper.zalbaCreateDtoToZalba(zalbaCreateDto);
        zalbaRepository.save(zalba);
        return zalbaMapper.zalbaToZalbaDto(zalba);
    }

    @Override
    public ZalbaDto findById(Long id) {
        return zalbaRepository.findById(id)
                .map(zalbaMapper::zalbaToZalbaDto)
                .orElseThrow(() -> new NotFoundException(String.format("Zalba sa id: %d nije pronadjena.", id)));
    }

    @Override
    public void deleteById(Long id) {
        zalbaRepository.deleteById(id);
    }

    @Override
    public void updateZalba(Long id, ZalbaCreateDto zalbaCreateDto) {
        Zalba zalba = zalbaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Zalba sa id: %d nije pronadjena.", id)));
        // Mozda obrisati jer su sva polja entiteta strani kljucevi.
        zalbaRepository.save(zalba);
    }
}
