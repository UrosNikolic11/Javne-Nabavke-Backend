package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PartijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.PartijaService;
import java.util.List;

@RestController
@RequestMapping("/partija")
public class PartijaController {
    private PartijaService service;

    public PartijaController(PartijaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<PartijaDto>> getAllPartija() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PartijaDto> create(@RequestBody PartijaDto partijaDto) {
        return new ResponseEntity<>(service.save(partijaDto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PartijaDto> update(@PathVariable Long id, @RequestBody PartijaDto partijaDto) {
        return new ResponseEntity<>(service.update(id, partijaDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (service.delete(id))
            return ResponseEntity.status(HttpStatus.OK).body("Removed successfully!");
        else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error!");
    }
}