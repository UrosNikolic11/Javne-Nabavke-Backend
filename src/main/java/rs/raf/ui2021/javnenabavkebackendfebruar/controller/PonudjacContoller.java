package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PonudjacCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudjacDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PonudjacService;

@RestController
@RequestMapping("/ponudjac")
@CrossOrigin

public class PonudjacContoller {
	
	PonudjacService ponudjacService;
	
	public PonudjacContoller(PonudjacService ponudjacSevice) {
		this.ponudjacService= ponudjacSevice;
	}
	
	@ApiOperation(value = "Add")
    @PostMapping("/add")
	public ResponseEntity<PonudjacDto> add(@RequestBody @Valid PonudjacCreateDto ponudjacCreateDto ) throws NotFoundException{
		return new ResponseEntity<>(ponudjacService.create(ponudjacCreateDto), HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Get all")
	@GetMapping
    public ResponseEntity<Page<PonudjacDto>> getAll(Pageable pageable) {
        return new ResponseEntity<>(ponudjacService.findAll(pageable), HttpStatus.OK);
    }

	@GetMapping("/{id}")
	public ResponseEntity<PonudjacDto> getById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(ponudjacService.findById(id), HttpStatus.OK);
	}
	
	@ApiOperation(value = "Delete")
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id){
	        ponudjacService.delete(id);
	   }

}
