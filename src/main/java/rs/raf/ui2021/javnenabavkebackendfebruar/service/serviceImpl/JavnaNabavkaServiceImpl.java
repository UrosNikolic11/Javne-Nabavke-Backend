package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.JavnaNabavkaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.JavnaNabavkaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.JavnaNabavkaService;

import java.util.Optional;

@Service
public class JavnaNabavkaServiceImpl implements JavnaNabavkaService {

    private JavnaNabavkaRepository javnaNabavkaRepository;
    private JavnaNabavkaMapper javnaNabavkaMapper;

    public JavnaNabavkaServiceImpl(JavnaNabavkaRepository javnaNabavkaRepository, JavnaNabavkaMapper javnaNabavkaMapper) {
        this.javnaNabavkaRepository = javnaNabavkaRepository;
        this.javnaNabavkaMapper = javnaNabavkaMapper;
    }

    @Override
    public JavnaNabavkaDto create(JavnaNabavkaCreateDto javnaNabavkaCreateDto) {

        JavnaNabavka javnaNabavka = javnaNabavkaMapper.javnaNabavkaCreateDtoToJavnaNabavka(javnaNabavkaCreateDto);
        javnaNabavkaRepository.save(javnaNabavka);
        return javnaNabavkaMapper.javnaNabavkaToJavnaNabavkaDto(javnaNabavka);
    }

    @Override
    public JavnaNabavkaDto findById(Long id) {
        Optional<JavnaNabavka> javnaNabavka = javnaNabavkaRepository.findById(id);
        if(!javnaNabavka.isPresent())
            throw new NotFoundException("Javna nabavka sa zadatim ID ne postoji.");
        JavnaNabavka jn = javnaNabavkaRepository.findJavnaNabavkaById(id);
        return javnaNabavkaMapper.javnaNabavkaToJavnaNabavkaDto(jn);
    }

    @Override
    public Page<JavnaNabavkaDto> findAll(Pageable pageable) {
        return javnaNabavkaRepository.findAll(pageable)
                .map(javnaNabavkaMapper::javnaNabavkaToJavnaNabavkaDto);
    }

    @Override
    public JavnaNabavkaDto update(Long id, JavnaNabavkaUpdateDto javnaNabavkaUpdateDto) {
        Optional<JavnaNabavka> javnaNabavka = javnaNabavkaRepository.findById(id);
        if(!javnaNabavka.isPresent())
            throw new NotFoundException("Javna nabavka sa zadatim ID ne postoji.");
        JavnaNabavka jn = javnaNabavkaMapper.javnaNabavkaUpdateDtoToJavnaNabavka(javnaNabavkaUpdateDto, javnaNabavka.get());
        javnaNabavkaRepository.save(jn);
        return javnaNabavkaMapper.javnaNabavkaToJavnaNabavkaDto(jn);
    }

    @Override
    public void delete(Long id) {
        Optional<JavnaNabavka> javnaNabavka = javnaNabavkaRepository.findById(id);
        if(!javnaNabavka.isPresent())
            throw new NotFoundException("Javna nabavka sa zadatim ID ne postoji.");
        javnaNabavkaRepository.deleteById(id);
    }
}
