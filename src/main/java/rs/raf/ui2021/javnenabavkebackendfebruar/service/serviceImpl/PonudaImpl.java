package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PonudaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.PonudaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponuda;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.NarucilacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PonudaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PonudaService;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class PonudaImpl implements PonudaService {

    private PonudaMapper ponudaMapper;
    private PonudaRepository ponudaRepository;
    private JavnaNabavkaRepository javnaNabavkaRepository;
    private NarucilacRepository narucilacRepository;

    public PonudaImpl(PonudaMapper ponudaMapper, PonudaRepository ponudaRepository, JavnaNabavkaRepository javnaNabavkaRepository, NarucilacRepository narucilacRepository) {
        this.ponudaMapper = ponudaMapper;
        this.ponudaRepository = ponudaRepository;
        this.javnaNabavkaRepository = javnaNabavkaRepository;
        this.narucilacRepository = narucilacRepository;
    }

    @Override
    public Page<PonudaDto> findAll(Pageable pageable) {
        return ponudaRepository.findAll(pageable)
                .map(ponudaMapper::originalToDto);
    }

    @Override
    public PonudaDto findById(Long id) {
        Optional<Ponuda> ponuda = ponudaRepository.findById(id);
        if (!ponuda.isPresent()){
            throw new NotFoundException("Ponuda sa datim id ne postoji");
        }
        Ponuda p = ponudaRepository.findPonudaById(id);
        return ponudaMapper.originalToDto(p);
    }

    @Override
    public PonudaDto create(PonudaCreateDto ponudaCreateDto) {
        Ponuda ponuda = ponudaMapper.createDtoToOriginal(ponudaCreateDto);
        ponudaRepository.save(ponuda);
        return ponudaMapper.originalToDto(ponuda);
    }

    @Override
    public void delete(Long id) {
        Optional<Ponuda> p = ponudaRepository.findById(id);
        if (!p.isPresent()){
            throw new NotFoundException("Ponuda sa datim id ne postoji.");
        }
        ponudaRepository.deleteById(id);
    }

    @Override
    public PonudaDto update(Long id, PonudaUpdateDto ponudaUpdateDto) {
        Optional<Ponuda> ponudaPostoji = ponudaRepository.findById(id);
        if(!ponudaPostoji.isPresent())
            throw new NotFoundException("Ponuda sa datim id ne postoji.");

        Ponuda ponuda = ponudaMapper.updateDtoToOriginal(ponudaUpdateDto, ponudaPostoji.get());
        ponudaRepository.save(ponuda);
        return ponudaMapper.originalToDto(ponuda);
    }

    @Override
    public List<PonudaDto> findByNarucilac(Long id) {
        Optional<Narucilac> narucilac = narucilacRepository.findById(id);
        if(!narucilac.isPresent()){
            throw new NotFoundException("Narucilac sa datim id ne postoji.");
        }
        List<JavnaNabavka> javnaNabavkaList = javnaNabavkaRepository.findJavnaNabavkasByNarucilac(narucilac.get());

        List<PonudaDto> ponudaDtos = new ArrayList<>();
        for(JavnaNabavka jn: javnaNabavkaList){
            Optional<Ponuda> ponuda = ponudaRepository.findPonudaByJavnaNabavka(jn);
            if(ponuda.isPresent())
                ponudaDtos.add(ponudaMapper.originalToDto(ponuda.get()));
        }
        return ponudaDtos;
    }
}
