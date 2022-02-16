package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Lokacija;

import java.util.Optional;

@Repository
public interface LokacijaRepository extends JpaRepository<Lokacija, Long> {
    Optional<Lokacija> findByAdresaSedistaAndMestoAndDrzava(String adresaSedista, String mesto, String drzava);
}

