package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.RadnikCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.RadnikDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.RadnikService;

@RestController
@RequestMapping("/radnik")
@CrossOrigin
public class RadnikController {
	
	RadnikService radnikService;
	
	public RadnikController(RadnikService radnikService) {
		this.radnikService=radnikService;
	}
	
	@ApiOperation(value = "Add")
	@PostMapping
	public ResponseEntity<RadnikDto> add(@RequestBody @Valid RadnikCreateDto radnikCreateDto ) throws NotFoundException{
		return new ResponseEntity<>(radnikService.create(radnikCreateDto), HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Get all")
	@GetMapping
    public ResponseEntity<Page<RadnikDto>> getAll(Pageable pageable) {
        return new ResponseEntity<>(radnikService.findAll(pageable), HttpStatus.OK);
    }
	
	@ApiOperation(value = "Delete")
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id){
	        radnikService.delete(id);
	   }

}
