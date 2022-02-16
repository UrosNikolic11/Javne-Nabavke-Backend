package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.OkvirniSporazumCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.OkvirniSporazumDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.OkvirniSporazumService;

import javax.validation.Valid;

@RestController
@RequestMapping("/okvirniSporazum")
public class OkvirniSporazumController {

    private OkvirniSporazumService okvirniSporazumService;

    public OkvirniSporazumController(OkvirniSporazumService okvirniSporazumService) {
        this.okvirniSporazumService = okvirniSporazumService;
    }

    @GetMapping
    public ResponseEntity<Page<OkvirniSporazumDto>> sviOS(Pageable pageable) {
        return new ResponseEntity<>(okvirniSporazumService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OkvirniSporazumDto> os(@PathVariable("id") Long id) {
        return new ResponseEntity<>(okvirniSporazumService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<OkvirniSporazumDto> napraviUgovor(@RequestBody @Valid OkvirniSporazumCreateDto okvirniSporazumCreateDto) {
        return new ResponseEntity<>(okvirniSporazumService.create(okvirniSporazumCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void obrisiUgovor(@PathVariable("id") Long id){
        okvirniSporazumService.delete(id);
    }
}
