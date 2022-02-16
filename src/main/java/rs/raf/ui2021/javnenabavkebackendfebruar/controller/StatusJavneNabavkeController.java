package rs.raf.ui2021.javnenabavkebackendfebruar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.StatusJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.StatusJavneNabavkeService;
import java.util.List;

@RestController
@RequestMapping("/statusJavneNabavke")
@CrossOrigin
public class StatusJavneNabavkeController {
    private StatusJavneNabavkeService service;

    public StatusJavneNabavkeController(StatusJavneNabavkeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<StatusJavneNabavke>> getAllStatusJavneNabavke() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusJavneNabavke> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<StatusJavneNabavke> create(@RequestBody StatusJavneNabavke statusJavneNabavke) {
        statusJavneNabavke.setId(null);
        return new ResponseEntity<>(service.save(statusJavneNabavke), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StatusJavneNabavke> update(@PathVariable Long id,
                                                     @RequestBody StatusJavneNabavke statusJavneNabavke) {
        statusJavneNabavke.setId(null);
        return new ResponseEntity<>(service.update(id, statusJavneNabavke), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (service.delete(id))
            return ResponseEntity.status(HttpStatus.OK).body("Removed successfully!");
        else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error!");
    }
}