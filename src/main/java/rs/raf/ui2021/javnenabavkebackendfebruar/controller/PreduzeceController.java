package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PreduzeceCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PreduzeceDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PreduzeceService;

@RestController
@RequestMapping("/preduzece")
@CrossOrigin
public class PreduzeceController {
	
	private PreduzeceService preduzeceService;

	public PreduzeceController(PreduzeceService preduzeceService) {
		this.preduzeceService = preduzeceService;
	};
	
	@GetMapping
	public ResponseEntity<Page<PreduzeceDto>> findAll(Pageable pageable){
	    return new ResponseEntity<>(preduzeceService.findAll(pageable), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<PreduzeceDto> add(@RequestBody @Valid PreduzeceCreateDto preduzeceCreateDto) {
	    return new ResponseEntity<>(preduzeceService.addPreduzece(preduzeceCreateDto), HttpStatus.CREATED);
	    
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<PreduzeceDto> delete(@PathVariable Long narucilacId){
		preduzeceService.remove(narucilacId);
		return new ResponseEntity<>( HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<PreduzeceDto> fbn(@PathVariable Long id){
		return new ResponseEntity<>(preduzeceService.findByNarucilac(id), HttpStatus.OK);
	}
	
	

}
