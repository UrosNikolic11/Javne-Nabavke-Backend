package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KomisijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KomisijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KomisijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.KomisijaService;

import javax.validation.Valid;

@RestController
@RequestMapping("/komisija")
@CrossOrigin
public class KomisijaController {

    private KomisijaService komisijaService;

    public KomisijaController(KomisijaService komisijaService) {
        this.komisijaService = komisijaService;
    }

    @GetMapping
    public ResponseEntity<Page<KomisijaDto>> sveKomisije(Pageable pageable) {
        return new ResponseEntity<>(komisijaService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KomisijaDto> komisija(@PathVariable("id") Long id) {
        return new ResponseEntity<>(komisijaService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<KomisijaDto> kreirajKomisiju(@RequestBody @Valid KomisijaCreateDto komisijaCreateDto) {
        return new ResponseEntity<>(komisijaService.create(komisijaCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void obrisiKomisiju(@PathVariable("id") Long id){
        komisijaService.delete(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<KomisijaDto> update(@PathVariable("id") Long id
            , @RequestBody @Valid KomisijaUpdateDto komisijaUpdateDto) {

        return new ResponseEntity<>(komisijaService.update(id, komisijaUpdateDto), HttpStatus.OK);
    }
}
