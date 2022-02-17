package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.JavnaNabavkaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.GodisnjiPlanJavnihNabavkiDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.JavnaNabavkaService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/javna-nabavka")
@CrossOrigin
public class JavnaNabavkaController {

    private JavnaNabavkaService javnaNabavkaService;

    public JavnaNabavkaController(JavnaNabavkaService javnaNabavkaService) {
        this.javnaNabavkaService = javnaNabavkaService;
    }

    @GetMapping
    public ResponseEntity<Page<JavnaNabavkaDto>> sveJavneNabavke(Pageable pageable) {
        return new ResponseEntity<>(javnaNabavkaService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JavnaNabavkaDto> javnaNabavka(@PathVariable("id") Long id) {
        return new ResponseEntity<>(javnaNabavkaService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<JavnaNabavkaDto> kreirajJavnuNabavku(@RequestBody @Valid JavnaNabavkaCreateDto javnaNabavkaCreateDto) {
        return new ResponseEntity<>(javnaNabavkaService.create(javnaNabavkaCreateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void obrisiJavnuNabavku(@PathVariable("id") Long id){
        javnaNabavkaService.delete(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<JavnaNabavkaDto> update(@PathVariable("id") Long id
            , @RequestBody @Valid JavnaNabavkaUpdateDto javnaNabavkaUpdateDto) {

        return new ResponseEntity<>(javnaNabavkaService.update(id, javnaNabavkaUpdateDto), HttpStatus.OK);
    }
    @GetMapping("/jn/{id}")
    public ResponseEntity<List<JavnaNabavkaDto>> jn(@PathVariable("id") Long id){
        return new ResponseEntity<>(javnaNabavkaService.vrati(id), HttpStatus.OK);
    }
}
