package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Korisnik;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponudjac;

import java.util.Optional;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {
    Optional<Korisnik> findKorisnikByKorisnickoImeAndLozinka(String username, String password);
    Korisnik findKorisnikByNarucilac(Narucilac narucilac);
    Korisnik findKorisnikByPonudjac(Ponudjac ponudjac);
}
