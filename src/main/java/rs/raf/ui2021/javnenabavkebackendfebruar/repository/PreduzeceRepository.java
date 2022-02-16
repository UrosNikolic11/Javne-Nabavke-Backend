package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Preduzece;

import java.util.Optional;

@Repository
public interface PreduzeceRepository extends JpaRepository<Preduzece, Long> {
    Optional<Preduzece> findByNarucilac(Narucilac narucilac);
}
