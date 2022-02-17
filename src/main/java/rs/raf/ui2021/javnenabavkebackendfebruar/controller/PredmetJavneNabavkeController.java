package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PredmetJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PredmetJavneNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PredmetJavneNabavkeService;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

@RestController
@RequestMapping("/predmeti-nabavke")
@CrossOrigin
public class PredmetJavneNabavkeController {

    private PredmetJavneNabavkeService predmetJavneNabavkeService;

    public PredmetJavneNabavkeController(PredmetJavneNabavkeService predmetJavneNabavkeService) {
        this.predmetJavneNabavkeService = predmetJavneNabavkeService;
    }

    @GetMapping
    public ResponseEntity<Page<PredmetJavneNabavkeDto>> findAll(@ApiIgnore Pageable pageable){
        return new ResponseEntity<>(predmetJavneNabavkeService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<PredmetJavneNabavkeDto> add(@RequestBody @Valid PredmetJavneNabavkeCreateDto predmetJavneNabavkeCreateDto) throws NotFoundException {
        return new ResponseEntity<>(predmetJavneNabavkeService.add(predmetJavneNabavkeCreateDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PredmetJavneNabavkeDto> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(predmetJavneNabavkeService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        predmetJavneNabavkeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody @Valid PredmetJavneNabavkeCreateDto predmetJavneNabavkeCreateDto){
        predmetJavneNabavkeService.updatePredmetJavneNabavke(id, predmetJavneNabavkeCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
