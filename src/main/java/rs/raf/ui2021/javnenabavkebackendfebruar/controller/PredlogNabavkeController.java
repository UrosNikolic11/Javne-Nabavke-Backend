package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PredlogNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PredlogNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PredlogNabavkeService;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

@RestController
@RequestMapping("/predlozi-nabavke")
@CrossOrigin
public class PredlogNabavkeController {

    private PredlogNabavkeService predlogNabavkeService;

    public PredlogNabavkeController(PredlogNabavkeService predlogNabavkeService) {
        this.predlogNabavkeService = predlogNabavkeService;
    }

    @GetMapping
    public ResponseEntity<Page<PredlogNabavkeDto>> findAll(@ApiIgnore Pageable pageable){
        return new ResponseEntity<>(predlogNabavkeService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<PredlogNabavkeDto> add(@RequestBody @Valid PredlogNabavkeCreateDto predlogNabavkeCreateDto) throws NotFoundException {
        return new ResponseEntity<>(predlogNabavkeService.add(predlogNabavkeCreateDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PredlogNabavkeDto> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(predlogNabavkeService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        predlogNabavkeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody @Valid PredlogNabavkeCreateDto predlogNabavkeCreateDto){
        predlogNabavkeService.updatePredlogNabavke(id, predlogNabavkeCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
