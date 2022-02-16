package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.PredmetJavneNabavke;
@Repository
public interface PredmetJavneNabavkeRepository  extends JpaRepository<PredmetJavneNabavke, Long> {
}
