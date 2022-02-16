package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObavestenjeOIzabranomPonudjacuCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeOIzabranomPonudjacuDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.BadRequestException;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.ObavestenjeOIzabranomPonudjacuMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.ObavestenjeOIzabranomPonudjacu;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.ObavestenjeOIzabranomPonudjacuRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.ObavestenjeOIzabranomPonudjacuService;

import java.util.Optional;

@Service

public class ObavestenjeOIzabranomPonudjacuServiceImpl implements ObavestenjeOIzabranomPonudjacuService {

    private ObavestenjeOIzabranomPonudjacuMapper mapper;
    private ObavestenjeOIzabranomPonudjacuRepository repository;

    public ObavestenjeOIzabranomPonudjacuServiceImpl(ObavestenjeOIzabranomPonudjacuMapper mapper, ObavestenjeOIzabranomPonudjacuRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    @Override
    public Page<ObavestenjeOIzabranomPonudjacuDto> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(mapper :: originalToDto);
    }

    @Override
    public ObavestenjeOIzabranomPonudjacuDto findById(Long id) {
        Optional<ObavestenjeOIzabranomPonudjacu> obavestenjeOIzabranomPonudjacu = repository.findById(id);
        if(!obavestenjeOIzabranomPonudjacu.isPresent())
            throw new NotFoundException("Obavestenje o izabranom ponudjacu sa datim id ne postoji.");

        return mapper.originalToDto(obavestenjeOIzabranomPonudjacu.get());
    }

    @Override
    public ObavestenjeOIzabranomPonudjacuDto create(ObavestenjeOIzabranomPonudjacuCreateDto obavestenjeOIzabranomPonudjacuCreateDto) {
        ObavestenjeOIzabranomPonudjacu obavestenjeOIzabranomPonudjacu = mapper.createDtoToOriginal(obavestenjeOIzabranomPonudjacuCreateDto);

        Optional<ObavestenjeOIzabranomPonudjacu> obavestenjeExist = repository.findByJavnaNabavkaAndKomisija(obavestenjeOIzabranomPonudjacu.getJavnaNabavka(),
                obavestenjeOIzabranomPonudjacu.getKomisija());

        if(obavestenjeExist.isPresent()){
            throw new BadRequestException("Obavestenje o izabranom ponudjacu za datu javnu nabavku i komisiju vec postoji.");
        }

        repository.save(obavestenjeOIzabranomPonudjacu);
        return mapper.originalToDto(obavestenjeOIzabranomPonudjacu);
    }

    @Override
    public void delete(Long id) {
        Optional<ObavestenjeOIzabranomPonudjacu> obavestenjeOIzabranomPonudjacu = repository.findById(id);
        if(!obavestenjeOIzabranomPonudjacu.isPresent())
            throw new NotFoundException("Obavestenje o izabranom ponudjacu sa datim id ne postoji.");
        repository.delete(obavestenjeOIzabranomPonudjacu.get());
    }
}
