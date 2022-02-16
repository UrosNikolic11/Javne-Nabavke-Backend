package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObjavaPlanaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObjavaPlanaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.ObjavaPlanaService;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

@RestController
@RequestMapping("/objave-plana")
public class ObjavaPlanaController {

    private ObjavaPlanaService objavaPlanaService;

    public ObjavaPlanaController(ObjavaPlanaService objavaPlanaService) {
        this.objavaPlanaService = objavaPlanaService;
    }

    @GetMapping
    public ResponseEntity<Page<ObjavaPlanaDto>> findAll(@ApiIgnore Pageable pageable){
        return new ResponseEntity<>(objavaPlanaService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ObjavaPlanaDto> add(@RequestBody @Valid ObjavaPlanaCreateDto objavaPlanaCreateDto) throws NotFoundException {
        return new ResponseEntity<>(objavaPlanaService.add(objavaPlanaCreateDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ObjavaPlanaDto> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(objavaPlanaService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        objavaPlanaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody @Valid ObjavaPlanaCreateDto objavaPlanaCreateDto){
        objavaPlanaService.updateObjavaPlana(id, objavaPlanaCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
