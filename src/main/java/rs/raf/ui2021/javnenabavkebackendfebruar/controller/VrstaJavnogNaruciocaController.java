package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.VrstaJavnogNaruciocaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.VrstaJavnogNaruciocaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.VrstaJavnogNaruciocaService;

@RestController
@RequestMapping("/vrstaJavnogNarucioca")
@CrossOrigin
public class VrstaJavnogNaruciocaController {
	
	private VrstaJavnogNaruciocaService vjns;

	public VrstaJavnogNaruciocaController(VrstaJavnogNaruciocaService vjns) {
		this.vjns = vjns;
	}
	
	@GetMapping
	public ResponseEntity<Page<VrstaJavnogNaruciocaDto>> findAll(Pageable pageable){
	    return new ResponseEntity<>(vjns.findAll(pageable), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<VrstaJavnogNaruciocaDto> add(@RequestBody @Valid VrstaJavnogNaruciocaCreateDto vjnCreateDto) {
	    return new ResponseEntity<>(vjns.addVrstaJavnogNarucioca(vjnCreateDto), HttpStatus.CREATED);
	    
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<VrstaJavnogNaruciocaDto> delete(@PathVariable Long vjnId){
		vjns.remove(vjnId);
		return new ResponseEntity<>( HttpStatus.OK);

	}

	
	
	

}
