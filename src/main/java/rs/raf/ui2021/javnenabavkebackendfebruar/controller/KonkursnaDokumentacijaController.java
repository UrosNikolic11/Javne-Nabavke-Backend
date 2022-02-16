package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.KonkursnaDokumentacijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KonkursnaDokumentacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.KonkursnaDokumentacijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.KonkursnaDokumentacijaService;

import javax.validation.Valid;

@RestController
@RequestMapping("/konkursnadokumentacija")
public class KonkursnaDokumentacijaController {

    private KonkursnaDokumentacijaService konkursnaDokumentacijaService;

    public KonkursnaDokumentacijaController(KonkursnaDokumentacijaService konkursnaDokumentacijaService) {
        this.konkursnaDokumentacijaService = konkursnaDokumentacijaService;
    }

    @GetMapping
    public ResponseEntity<Page<KonkursnaDokumentacijaDto>> getAll(Pageable pageable) {
        return new ResponseEntity<>(konkursnaDokumentacijaService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KonkursnaDokumentacijaDto> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(konkursnaDokumentacijaService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<KonkursnaDokumentacijaDto> post(@RequestBody @Valid KonkursnaDokumentacijaCreateDto konkursnaDokumentacijaCreateDto) {
        return new ResponseEntity<>(konkursnaDokumentacijaService.create(konkursnaDokumentacijaCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        konkursnaDokumentacijaService.delete(id);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<KonkursnaDokumentacijaDto> put(@RequestBody @Valid KonkursnaDokumentacijaUpdateDto konkursnaDokumentacijaUpdateDto, @PathVariable Long id) {
        return new ResponseEntity<>(konkursnaDokumentacijaService.update(id, konkursnaDokumentacijaUpdateDto), HttpStatus.OK);
    }
}
