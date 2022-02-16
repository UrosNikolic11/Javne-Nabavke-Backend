package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.stereotype.Service;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.StatusJavneNabavke;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.StatusJavneNabavkeRepo;
import java.util.List;

@Service
public class StatusJavneNabavkeService {
    private StatusJavneNabavkeRepo repo;

    public StatusJavneNabavkeService(StatusJavneNabavkeRepo repo) {
        this.repo = repo;
    }

    public List<StatusJavneNabavke> findAll() {
        return repo.findAll();
    }

    public StatusJavneNabavke save(StatusJavneNabavke statusJavneNabavke) {
        repo.save(statusJavneNabavke);
        return statusJavneNabavke;
    }

    public StatusJavneNabavke update(Long id, StatusJavneNabavke statusJavneNabavke) {
        if (repo.existsById(id)) {
            StatusJavneNabavke saved = repo.findById(id).get();
            saved.setNaziv(statusJavneNabavke.getNaziv());
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