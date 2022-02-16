package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObavestenjeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.ObavestenjeService;

import javax.validation.Valid;

@RestController
@RequestMapping("/obavestenje")
public class ObavestenjeController {

    private ObavestenjeService obavestenjeService;

    public ObavestenjeController(ObavestenjeService obavestenjeService) {
        this.obavestenjeService = obavestenjeService;
    }

    @GetMapping
    public ResponseEntity<Page<ObavestenjeDto>> svaObavestenja(Pageable pageable) {
        return new ResponseEntity<>(obavestenjeService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ObavestenjeDto> obavestenje(@PathVariable("id") Long id) {
        return new ResponseEntity<>(obavestenjeService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ObavestenjeDto> kreirajObavestenje(@RequestBody @Valid ObavestenjeCreateDto obavestenjeCreateDto) {
        return new ResponseEntity<>(obavestenjeService.create(obavestenjeCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void obrisiObavestenje(@PathVariable("id") Long id){
        obavestenjeService.delete(id);
    }

}
