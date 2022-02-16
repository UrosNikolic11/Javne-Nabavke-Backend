package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.GodisnjiPlanJavnihNabavkiCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.GodisnjiPlanJavnihNabavkiDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.GodisnjiPlanJavnihNabavkiService;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/godisnji-planovi")
@CrossOrigin
public class GodisnjiPlanJavnihNabavkiController {

    private GodisnjiPlanJavnihNabavkiService godisnjiPlanJavnihNabavkiService;

    public GodisnjiPlanJavnihNabavkiController(GodisnjiPlanJavnihNabavkiService godisnjiPlanJavnihNabavkiService) {
        this.godisnjiPlanJavnihNabavkiService = godisnjiPlanJavnihNabavkiService;
    }

    @GetMapping
    public ResponseEntity<Page<GodisnjiPlanJavnihNabavkiDto>> findAll(@ApiIgnore Pageable pageable){
        return new ResponseEntity<>(godisnjiPlanJavnihNabavkiService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<GodisnjiPlanJavnihNabavkiDto> add(@RequestBody @Valid GodisnjiPlanJavnihNabavkiCreateDto godisnjiPlanJavnihNabavkiCreateDto) throws NotFoundException {
        return new ResponseEntity<>(godisnjiPlanJavnihNabavkiService.add(godisnjiPlanJavnihNabavkiCreateDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GodisnjiPlanJavnihNabavkiDto> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(godisnjiPlanJavnihNabavkiService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        godisnjiPlanJavnihNabavkiService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody @Valid GodisnjiPlanJavnihNabavkiCreateDto godisnjiPlanJavnihNabavkiCreateDto){
        godisnjiPlanJavnihNabavkiService.updateGodisnjiPlanJavnihNabavki(id, godisnjiPlanJavnihNabavkiCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/gp/{id}")
    public ResponseEntity<List<GodisnjiPlanJavnihNabavkiDto>> gp(@PathVariable("id") Long id){
        return new ResponseEntity<>(godisnjiPlanJavnihNabavkiService.vrati(id), HttpStatus.OK);
    }

}
