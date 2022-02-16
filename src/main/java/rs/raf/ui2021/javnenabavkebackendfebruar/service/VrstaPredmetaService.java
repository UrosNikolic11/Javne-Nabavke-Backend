package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.stereotype.Service;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.VrstaPredmeta;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.VrstaPredmetaRepo;
import java.util.List;

@Service
public class VrstaPredmetaService {
    private VrstaPredmetaRepo repo;

    public VrstaPredmetaService(VrstaPredmetaRepo repo) {
        this.repo = repo;
    }

    public List<VrstaPredmeta> findAll() {
        return repo.findAll();
    }

    public VrstaPredmeta save(VrstaPredmeta vrstaPredmeta) {
        repo.save(vrstaPredmeta);
        return vrstaPredmeta;
    }

    public VrstaPredmeta update(Long id, VrstaPredmeta vrstaPredmeta) {
        if (repo.existsById(id)) {
            VrstaPredmeta saved = repo.findById(id).get();
            saved.setNaziv(vrstaPredmeta.getNaziv());
            repo.save(saved);
            return saved;
        }

        return null;
    }

    public Boolean delete(Long id) {
        if (repo.existsById(id)) {
            repo.delete(repo.findById(id).get());
            return true;
        }

        return false;
    }
}