package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.VrstaPredmeta;

@Repository
public interface VrstaPredmetaRepo extends JpaRepository<VrstaPredmeta, Long> {}