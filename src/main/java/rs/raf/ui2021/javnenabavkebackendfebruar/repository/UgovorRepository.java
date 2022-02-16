package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ugovor;

@Repository
public interface UgovorRepository  extends JpaRepository<Ugovor, Long> {
    Ugovor findUgovorById(Long id);
}
