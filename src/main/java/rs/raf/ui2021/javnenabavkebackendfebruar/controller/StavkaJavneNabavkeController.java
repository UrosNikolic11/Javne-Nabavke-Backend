package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.StavkaJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.StavkaJavneNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.StavkaJavneNabavkeService;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

@RestController
@RequestMapping("/stavke-nabavke")
@CrossOrigin
public class StavkaJavneNabavkeController {

    private StavkaJavneNabavkeService stavkaJavneNabavkeService;

    public StavkaJavneNabavkeController(StavkaJavneNabavkeService stavkaJavneNabavkeService) {
        this.stavkaJavneNabavkeService = stavkaJavneNabavkeService;
    }

    @GetMapping
    public ResponseEntity<Page<StavkaJavneNabavkeDto>> findAll(@ApiIgnore Pageable pageable){
        return new ResponseEntity<>(stavkaJavneNabavkeService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<StavkaJavneNabavkeDto> add(@RequestBody  StavkaJavneNabavkeCreateDto stavkaJavneNabavkeCreateDto)  {
        return new ResponseEntity<>(stavkaJavneNabavkeService.add(stavkaJavneNabavkeCreateDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StavkaJavneNabavkeDto> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(stavkaJavneNabavkeService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        stavkaJavneNabavkeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody @Valid StavkaJavneNabavkeCreateDto stavkaJavneNabavkeCreateDto){
        stavkaJavneNabavkeService.updateStavkaJavneNabavke(id, stavkaJavneNabavkeCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
