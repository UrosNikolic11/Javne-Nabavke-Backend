package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.PlanJavneNabavke;

import java.util.List;

@Repository
public interface PlanJavneNabavkeRepository  extends JpaRepository<PlanJavneNabavke, Long> {
    List<PlanJavneNabavke> findPlanJavneNabavkesByNarucilac(Narucilac narucilac);
}
