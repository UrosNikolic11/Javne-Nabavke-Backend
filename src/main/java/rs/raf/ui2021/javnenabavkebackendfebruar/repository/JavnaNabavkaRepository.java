package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Komisija;

@Repository
public interface JavnaNabavkaRepository extends JpaRepository<JavnaNabavka, Long> {

    JavnaNabavka findJavnaNabavkaById(Long id);
}