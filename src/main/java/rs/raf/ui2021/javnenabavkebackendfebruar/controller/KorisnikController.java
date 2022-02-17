package rs.raf.ui2021.javnenabavkebackendfebruar.controller;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KorisnikCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.LoginCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KorisnikDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KorisnikUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LoginDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.KorisnikService;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

@RestController
@RequestMapping("/korisnik")
@CrossOrigin
public class KorisnikController {

    private KorisnikService korisnikService;

    public KorisnikController(KorisnikService korisnikService) {
        this.korisnikService = korisnikService;
    }

    @GetMapping
    public ResponseEntity<Page<KorisnikDto>> findAll(@ApiIgnore Pageable pageable) {
        return new ResponseEntity<>(korisnikService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KorisnikDto> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(korisnikService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginDto> login(@RequestBody @Valid LoginCreateDto loginCreateDto){
        return new ResponseEntity<>(korisnikService.login(loginCreateDto), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<KorisnikDto> add(@RequestBody @Valid KorisnikCreateDto korisnikCreateDto) throws NotFoundException {
        return new ResponseEntity<>(korisnikService.createKorisnik(korisnikCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id) {
        korisnikService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/narucilac/{id}")
    public ResponseEntity<KorisnikDto> updateN(@PathVariable("id") Long id, @RequestBody @Valid KorisnikUpdateDto korisnikUpdateDto) {
        return new ResponseEntity<>(korisnikService.updateNarucilac(korisnikUpdateDto,id),HttpStatus.OK);
    }
    @PutMapping("/ponudjac/{id}")
    public ResponseEntity<KorisnikDto> updateP(@PathVariable("id") Long id, @RequestBody @Valid KorisnikUpdateDto korisnikUpdateDto) {
        return new ResponseEntity<>(korisnikService.updatePonudjac(korisnikUpdateDto,id),HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody @Valid KorisnikCreateDto korisnikCreateDto) {
        korisnikService.update(id, korisnikCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}