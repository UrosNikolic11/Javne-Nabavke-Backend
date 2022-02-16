package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.LokacijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.VrstaPredmeta;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.VrstaPredmetaService;
import java.util.List;

@RestController
@RequestMapping("/vrstaPredmeta")
@CrossOrigin
public class VrstaPredmetaController {
    private VrstaPredmetaService service;

    public VrstaPredmetaController(VrstaPredmetaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<VrstaPredmeta>> getAllVrstaPredmeta() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VrstaPredmeta> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VrstaPredmeta> create(@RequestBody VrstaPredmeta vrstaPredmeta) {
        vrstaPredmeta.setId(null);
        return new ResponseEntity<>(service.save(vrstaPredmeta), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VrstaPredmeta> update(@PathVariable Long id, @RequestBody VrstaPredmeta vrstaPredmeta) {
        vrstaPredmeta.setId(null);
        return new ResponseEntity<>(service.update(id, vrstaPredmeta), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (service.delete(id))
            return ResponseEntity.status(HttpStatus.OK).body("Removed successfully!");
        else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error!");
    }
}