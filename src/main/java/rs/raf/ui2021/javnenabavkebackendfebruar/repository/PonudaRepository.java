package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponuda;

import java.util.Optional;

@Repository
public interface PonudaRepository extends JpaRepository<Ponuda, Long> {
    Ponuda findPonudaById(Long id);
    Optional<Ponuda> findPonudaByJavnaNabavka(JavnaNabavka javnaNabavka);
}
