package rs.raf.ui2021.javnenabavkebackendfebruar.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.raf.ui2021.javnenabavkebackendfebruar.model.Korisnik;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;

@Repository
public interface NarucilacRepository extends JpaRepository<Narucilac, Long>{

    Optional<Narucilac> findByKorisnik(Korisnik korisnik);

}