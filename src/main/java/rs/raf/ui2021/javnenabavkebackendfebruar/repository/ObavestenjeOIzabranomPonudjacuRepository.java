package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Komisija;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.ObavestenjeOIzabranomPonudjacu;

import java.util.Optional;

@Repository
public interface ObavestenjeOIzabranomPonudjacuRepository  extends JpaRepository<ObavestenjeOIzabranomPonudjacu, Long> {

    Optional<ObavestenjeOIzabranomPonudjacu> findByJavnaNabavkaAndKomisija(JavnaNabavka javnaNabavka, Komisija komisija);
}
