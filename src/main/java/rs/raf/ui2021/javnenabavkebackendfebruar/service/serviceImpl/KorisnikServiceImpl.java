package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KorisnikCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.LoginCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KorisnikDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KorisnikUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LoginDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.KorisnikMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.NarucilacMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.PonudjacMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.RadnikMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Korisnik;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponudjac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Radnik;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.KorisnikRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.NarucilacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PonudjacRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.RadnikRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.KorisnikService;

import java.util.Optional;

@Service
public class KorisnikServiceImpl implements KorisnikService {

    private KorisnikRepository korisnikRepository;
    private KorisnikMapper korisnikMapper;
    private NarucilacRepository narucilacRepository;
    private PonudjacRepository ponudjacRepository;
    private NarucilacMapper narucilacMapper;
    private PonudjacMapper ponudjacMapper;
    private RadnikRepository radnikRepository;
    private RadnikMapper radnikMapper;

    public KorisnikServiceImpl(KorisnikRepository korisnikRepository, KorisnikMapper korisnikMapper, NarucilacRepository narucilacRepository, PonudjacRepository ponudjacRepository, NarucilacMapper narucilacMapper, PonudjacMapper ponudjacMapper, RadnikRepository radnikRepository, RadnikMapper radnikMapper) {
        this.korisnikRepository = korisnikRepository;
        this.korisnikMapper = korisnikMapper;
        this.narucilacRepository = narucilacRepository;
        this.ponudjacRepository = ponudjacRepository;
        this.narucilacMapper = narucilacMapper;
        this.ponudjacMapper = ponudjacMapper;
        this.radnikRepository = radnikRepository;
        this.radnikMapper = radnikMapper;
    }

    @Override
    public KorisnikDto createKorisnik(KorisnikCreateDto korisnikCreateDto) {
        Korisnik korisnik = korisnikMapper.korisnikCreateDtoToKorisnik(korisnikCreateDto);
        korisnikRepository.save(korisnik);
        return korisnikMapper.korisnikToKorisnikDto(korisnik);
    }

    @Override
    public KorisnikDto update(Long id,KorisnikCreateDto korisnikCreateDto) {

        return null;
    }

    @Override
    public void delete(Long id) {
        korisnikRepository.deleteById(id);
    }

    @Override
    public LoginDto login(LoginCreateDto loginCreateDto) {
        Optional<Korisnik> korisnik = korisnikRepository.findKorisnikByKorisnickoImeAndLozinka(loginCreateDto.getUsername(), loginCreateDto.getPassword());
        if(!korisnik.isPresent())
            throw new NotFoundException("Pogresni kredencijali.");

        Optional<Radnik> radnik = radnikRepository.findByKorisnik(korisnik.get());
        Optional<Narucilac> narucilac = narucilacRepository.findByKorisnik(korisnik.get());
        Optional<Ponudjac> ponudjac = ponudjacRepository.findByKorisnik(korisnik.get());
        LoginDto loginDto = new LoginDto();
        if(narucilac.isPresent()){
            loginDto.setNarucilac(narucilacMapper.narucilacToNarucilacDto(narucilac.get()));
            loginDto.setPonudjac(null);
            loginDto.setRadnik(null);
        }else if(ponudjac.isPresent()){
            loginDto.setNarucilac(null);
            loginDto.setPonudjac(ponudjacMapper.ponudjacToPonudjacDto(ponudjac.get()));
            loginDto.setRadnik(null);
        }
        else {
            loginDto.setNarucilac(null);
            loginDto.setRadnik(radnikMapper.radnikToRadnikDto(radnik.get()));
            loginDto.setPonudjac(null);
        }
        return loginDto;
    }

    @Override
    public Page<KorisnikDto> findAll(Pageable pageable) {
        return korisnikRepository.findAll(pageable)
                .map(korisnikMapper :: korisnikToKorisnikDto);
    }

    @Override
    public KorisnikDto findById(Long id) {
        Optional<Korisnik> korisnik = korisnikRepository.findById(id);
        if (!korisnik.isPresent())
            throw new NotFoundException("Korisnik sa datim id ne postoji");
        return korisnikMapper.korisnikToKorisnikDto(korisnik.get());
    }

    @Override
    public KorisnikDto updateNarucilac(KorisnikUpdateDto korisnikUpdateDto, Long id) {
        Optional<Narucilac> narucilac = narucilacRepository.findById(id);
        if (!narucilac.isPresent())
            throw new NotFoundException("Narucilac sa datim id ne postoji.");
        Korisnik korisnik = korisnikRepository.findKorisnikByNarucilac(narucilac.get());
        korisnik.setEmail(korisnikUpdateDto.getEmail());
        korisnik.setTelefon(korisnikUpdateDto.getTelefon());
        korisnik.setIme(korisnikUpdateDto.getIme());
        korisnik.setPrezime(korisnikUpdateDto.getPrezime());
        korisnik.setKorisnickoIme(korisnikUpdateDto.getKorisnickoIme());
        korisnikRepository.save(korisnik);
        return korisnikMapper.korisnikToKorisnikDto(korisnik);
    }

    @Override
    public KorisnikDto updatePonudjac(KorisnikUpdateDto korisnikUpdateDto, Long id) {
        Optional<Ponudjac> ponudjac = ponudjacRepository.findById(id);
        if (!ponudjac.isPresent())
            throw new NotFoundException("Ponudjac sa datim id ne postoji.");
        Korisnik korisnik = korisnikRepository.findKorisnikByPonudjac(ponudjac.get());
        korisnik.setEmail(korisnikUpdateDto.getEmail());
        korisnik.setTelefon(korisnikUpdateDto.getTelefon());
        korisnik.setIme(korisnikUpdateDto.getIme());
        korisnik.setPrezime(korisnikUpdateDto.getPrezime());
        korisnik.setKorisnickoIme(korisnikUpdateDto.getKorisnickoIme());
        korisnikRepository.save(korisnik);
        return korisnikMapper.korisnikToKorisnikDto(korisnik);
    }


}