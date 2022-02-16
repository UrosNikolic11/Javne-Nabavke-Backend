package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ZalbaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ZalbaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.ZalbaService;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

@RestController
@RequestMapping("/zalbe")
public class ZalbaController {

    private ZalbaService zalbaService;

    public ZalbaController(ZalbaService zalbaService) {
        this.zalbaService = zalbaService;
    }

    @GetMapping
    public ResponseEntity<Page<ZalbaDto>> findAll(@ApiIgnore Pageable pageable){
        return new ResponseEntity<>(zalbaService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ZalbaDto> add(@RequestBody @Valid ZalbaCreateDto zalbaCreateDto) throws NotFoundException {
        return new ResponseEntity<>(zalbaService.add(zalbaCreateDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ZalbaDto> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(zalbaService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        zalbaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody @Valid ZalbaCreateDto zalbaCreateDto){
        zalbaService.updateZalba(id, zalbaCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
