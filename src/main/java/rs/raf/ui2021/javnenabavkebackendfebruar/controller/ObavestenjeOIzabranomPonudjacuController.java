package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.LokacijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObavestenjeOIzabranomPonudjacuCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeOIzabranomPonudjacuDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.ObavestenjeOIzabranomPonudjacuService;

import javax.validation.Valid;

@RestController
@RequestMapping("/obavestenjeoizabranomponudjacu")
public class ObavestenjeOIzabranomPonudjacuController {

    private ObavestenjeOIzabranomPonudjacuService obavestenjeOIzabranomPonudjacuService;

    public ObavestenjeOIzabranomPonudjacuController(ObavestenjeOIzabranomPonudjacuService obavestenjeOIzabranomPonudjacuService) {
        this.obavestenjeOIzabranomPonudjacuService = obavestenjeOIzabranomPonudjacuService;
    }

    @GetMapping
    public ResponseEntity<Page<ObavestenjeOIzabranomPonudjacuDto>> getAll(Pageable pageable) {
        return new ResponseEntity<>(obavestenjeOIzabranomPonudjacuService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ObavestenjeOIzabranomPonudjacuDto> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(obavestenjeOIzabranomPonudjacuService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ObavestenjeOIzabranomPonudjacuDto> post(@RequestBody @Valid ObavestenjeOIzabranomPonudjacuCreateDto obavestenjeOIzabranomPonudjacuCreateDto) {
        return new ResponseEntity<>(obavestenjeOIzabranomPonudjacuService.create(obavestenjeOIzabranomPonudjacuCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        obavestenjeOIzabranomPonudjacuService.delete(id);
    }
}
