package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.LokacijaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.LokacijaService;

import javax.validation.Valid;

@RestController
@RequestMapping("/lokacija")
@CrossOrigin

public class LokacijaController {

    private LokacijaService lokacijaService;

    public LokacijaController(LokacijaService lokacijaService) {
        this.lokacijaService = lokacijaService;
    }

    @GetMapping
    public ResponseEntity<Page<LokacijaDto>> getAll(Pageable pageable) {
        return new ResponseEntity<>(lokacijaService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LokacijaDto> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(lokacijaService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<LokacijaDto> post(@RequestBody @Valid LokacijaCreateDto lokacijaCreateDto) {
        return new ResponseEntity<>(lokacijaService.create(lokacijaCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        lokacijaService.delete(id);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<LokacijaDto> put(@RequestBody @Valid LokacijaUpdateDto lokacijaUpdateDto, @PathVariable Long id) {
        return new ResponseEntity<>(lokacijaService.update(id, lokacijaUpdateDto), HttpStatus.OK);
    }


}
