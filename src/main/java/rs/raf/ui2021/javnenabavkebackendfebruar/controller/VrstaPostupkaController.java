package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.VrstaPostupkaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaPostupkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaPostupkaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.VrstaPostupkaService;

import javax.validation.Valid;

@RestController
@RequestMapping("/vrstapostupka")
@CrossOrigin
public class VrstaPostupkaController {

    private VrstaPostupkaService vrstaPostupkaService;

    public VrstaPostupkaController(VrstaPostupkaService vrstaPostupkaService) {
        this.vrstaPostupkaService = vrstaPostupkaService;
    }

    @GetMapping
    public ResponseEntity<Page<VrstaPostupkaDto>> getAll(Pageable pageable) {
        return new ResponseEntity<>(vrstaPostupkaService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VrstaPostupkaDto> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(vrstaPostupkaService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VrstaPostupkaDto> post(@RequestBody @Valid VrstaPostupkaCreateDto vrstaPostupkaCreateDto) {
        return new ResponseEntity<>(vrstaPostupkaService.create(vrstaPostupkaCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        vrstaPostupkaService.delete(id);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<VrstaPostupkaDto> put(@RequestBody @Valid VrstaPostupkaUpdateDto vrstaPostupkaUpdateDto, @PathVariable Long id) {
        return new ResponseEntity<>(vrstaPostupkaService.update(id, vrstaPostupkaUpdateDto), HttpStatus.OK);
    }
}
