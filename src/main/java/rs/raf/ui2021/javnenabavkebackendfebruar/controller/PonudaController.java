package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PonudaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.UgovorCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.UgovorDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PonudaService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ponuda")
@CrossOrigin
public class PonudaController {

    private PonudaService ponudaService;

    public PonudaController(PonudaService ponudaService) {
        this.ponudaService = ponudaService;
    }

    @GetMapping
    public ResponseEntity<Page<PonudaDto>> svePonude(Pageable pageable) {
        return new ResponseEntity<>(ponudaService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PonudaDto> ponuda(@PathVariable("id") Long id) {
        return new ResponseEntity<>(ponudaService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<PonudaDto> napraviUgovor(@RequestBody @Valid PonudaCreateDto ponudaCreateDto) {
        return new ResponseEntity<>(ponudaService.create(ponudaCreateDto), HttpStatus.CREATED);
    }

    @GetMapping("/narucilac/{id}")
    public ResponseEntity<List<PonudaDto>> nadjiPonudePoNaruciocu(@PathVariable("id") Long id){
        return new ResponseEntity<>(ponudaService.findByNarucilac(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void obrisiUgovor(@PathVariable("id") Long id){
        ponudaService.delete(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PonudaDto> update(@PathVariable("id") Long id
            , @RequestBody @Valid PonudaUpdateDto ponudaUpdateDto) {

        return new ResponseEntity<>(ponudaService.update(id, ponudaUpdateDto), HttpStatus.OK);
    }
}
