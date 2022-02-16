package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KorisnikCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.LoginCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KorisnikDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LoginDto;

public interface KorisnikService {

    KorisnikDto createKorisnik(KorisnikCreateDto korisnikCreateDto);
    Page<KorisnikDto> findAll(Pageable pageable);
    public KorisnikDto update(Long id, KorisnikCreateDto korisnikCreateDto);
    void delete(Long id);
    LoginDto login(LoginCreateDto loginCreateDto);
}