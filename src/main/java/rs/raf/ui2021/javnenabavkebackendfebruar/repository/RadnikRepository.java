package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.raf.ui2021.javnenabavkebackendfebruar.model.Korisnik;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Radnik;

import java.util.Optional;

@Repository
public interface RadnikRepository extends JpaRepository<Radnik, Long> {
    Optional<Radnik> findByKorisnik(Korisnik korisnik);
}