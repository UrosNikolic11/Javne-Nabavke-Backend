package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.DokumentacijaPartijeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.DokumentacijaPartijeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.DokumentacijaPartijeService;

import javax.validation.Valid;

@RestController
@RequestMapping("/dokumentacijapartije")
public class DokumentacijaPartijeController {

    private DokumentacijaPartijeService service;

    public DokumentacijaPartijeController(DokumentacijaPartijeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<DokumentacijaPartijeDto>> sveDokumentacijePartije(Pageable pageable) {
        return new ResponseEntity<>(service.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DokumentacijaPartijeDto> dokumentacijaPartije(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<DokumentacijaPartijeDto> kreirajDokumentacijuNabavke(@RequestBody @Valid DokumentacijaPartijeCreateDto dokumentacijaPartijeCreateDto) {
        return new ResponseEntity<>(service.create(dokumentacijaPartijeCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void obrisiDokumentacijuPartije(@PathVariable("id") Long id){
        service.delete(id);
    }
}
