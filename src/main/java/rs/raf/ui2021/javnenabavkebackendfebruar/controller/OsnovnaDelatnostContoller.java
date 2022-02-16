package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiOperation;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.OsnovnaDelatnostCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PonudjacCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.OsnovnaDelatnostDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudjacDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.OsnovnaDelatnostService;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PonudjacService;

@RestController
@RequestMapping("/osnovnaDelatnost")
@CrossOrigin

public class OsnovnaDelatnostContoller {
	
	private OsnovnaDelatnostService osnovnaDelatnostService;
	
	public OsnovnaDelatnostContoller(OsnovnaDelatnostService osnovnaDelatnostService) {
		this.osnovnaDelatnostService=osnovnaDelatnostService;
	}
	
	@PostMapping
	public ResponseEntity<OsnovnaDelatnostDto> add(@RequestBody @Valid OsnovnaDelatnostCreateDto osnovnaDelatbostCreateDto ){
		System.out.println("Usao 111");
		return new ResponseEntity<>(osnovnaDelatnostService.create(osnovnaDelatbostCreateDto), HttpStatus.CREATED);
	}
	
	@GetMapping
    public ResponseEntity<Page<OsnovnaDelatnostDto>> getAll(Pageable pageable) {
		System.out.println("@2222222");
        return new ResponseEntity<>(osnovnaDelatnostService.findAll(pageable), HttpStatus.OK);
    }
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id){
	        osnovnaDelatnostService.delete(id);
	   }


}
