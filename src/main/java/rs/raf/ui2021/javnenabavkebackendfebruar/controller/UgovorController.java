package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.UgovorCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.UgovorDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.UgovorService;

import javax.validation.Valid;

@RestController
@RequestMapping("/ugovor")
@CrossOrigin
public class UgovorController {

    private UgovorService ugovorService;

    public UgovorController(UgovorService ugovorService) {
        this.ugovorService = ugovorService;
    }

    @GetMapping
    public ResponseEntity<Page<UgovorDto>> sviUgovori(Pageable pageable) {
        return new ResponseEntity<>(ugovorService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UgovorDto> ugovor(@PathVariable("id") Long id) {
        return new ResponseEntity<>(ugovorService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<UgovorDto> napraviUgovor(@RequestBody @Valid UgovorCreateDto ugovorCreateDto) {
        return new ResponseEntity<>(ugovorService.create(ugovorCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void obrisiUgovor(@PathVariable("id") Long id){
        ugovorService.delete(id);
    }
}
