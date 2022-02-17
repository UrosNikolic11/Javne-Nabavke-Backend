package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PlanJavneNabavkeCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PlanJavneNabavkeDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PlanJavneNabavkeService;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/planovi-nabavke")
@CrossOrigin
public class PlanJavneNabavkeController {

    private PlanJavneNabavkeService planJavneNabavkeService;

    public PlanJavneNabavkeController(PlanJavneNabavkeService planJavneNabavkeService) {
        this.planJavneNabavkeService = planJavneNabavkeService;
    }

    @GetMapping
    public ResponseEntity<Page<PlanJavneNabavkeDto>> findAll(@ApiIgnore Pageable pageable){
        return new ResponseEntity<>(planJavneNabavkeService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<PlanJavneNabavkeDto> add(@RequestBody @Valid PlanJavneNabavkeCreateDto planJavneNabavkeCreateDto) throws NotFoundException {
        return new ResponseEntity<>(planJavneNabavkeService.add(planJavneNabavkeCreateDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanJavneNabavkeDto> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(planJavneNabavkeService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        planJavneNabavkeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody @Valid PlanJavneNabavkeCreateDto planJavneNabavkeCreateDto){
        planJavneNabavkeService.updatePlanJavneNabavke(id, planJavneNabavkeCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/plan/{id}")
    public ResponseEntity<List<PlanJavneNabavkeDto>> palnn(@PathVariable("id") Long id){
        return new ResponseEntity<>(planJavneNabavkeService.vrati(id), HttpStatus.OK);
    }

}
