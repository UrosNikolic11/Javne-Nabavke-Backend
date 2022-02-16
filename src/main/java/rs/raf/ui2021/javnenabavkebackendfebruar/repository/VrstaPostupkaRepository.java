package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.VrstaPostupka;

import java.util.Optional;

@Repository
public interface VrstaPostupkaRepository extends JpaRepository<VrstaPostupka, Long> {

    Optional<VrstaPostupka> findByNaziv(String naziv);
}
