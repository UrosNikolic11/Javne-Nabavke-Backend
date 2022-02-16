package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.NarucilacCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.NarucilacDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.StatusJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.NarucilacService;

@RestController
@RequestMapping("/narucilac")
@CrossOrigin
public class NarucilacController {
	
	private NarucilacService narucilacService;

	public NarucilacController(NarucilacService narucilacService) {
		this.narucilacService = narucilacService;
	} 
	
	@GetMapping
	public ResponseEntity<Page<NarucilacDto>> findAll(Pageable pageable){
	    return new ResponseEntity<>(narucilacService.findAll(pageable), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<NarucilacDto> getById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(narucilacService.findById(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<NarucilacDto> add(@RequestBody @Valid NarucilacCreateDto narucilacCreateDto) throws NotFoundException {
	    return new ResponseEntity<>(narucilacService.addNarucilac(narucilacCreateDto), HttpStatus.CREATED);
	    
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<NarucilacDto> delete(@PathVariable Long narucilacId){
		narucilacService.remove(narucilacId);
		return new ResponseEntity<>( HttpStatus.OK);

	}

	
	

}
