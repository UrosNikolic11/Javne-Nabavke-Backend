package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.OkvirniSporazum;

import java.util.Optional;

@Repository
public interface OkvirniSporazumRepository extends JpaRepository<OkvirniSporazum, Long> {
    Optional<OkvirniSporazum> findOkvirniSporazumByJavnaNabavka_Id(Long javnaNabavkaId);
    OkvirniSporazum findOkvirniSporazumById(Long id);
}
