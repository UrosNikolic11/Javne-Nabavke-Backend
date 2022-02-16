package rs.raf.ui2021.javnenabavkebackendfebruar.service;

import org.springframework.stereotype.Service;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PartijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.PartijaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Partija;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PartijaRepo;
import java.util.ArrayList;
import java.util.List;

@Service
public class PartijaService {
    private PartijaRepo repo;
    private PartijaMapper mapper;
    private JavnaNabavkaRepository jnRepo;

    public PartijaService(PartijaRepo repo, PartijaMapper mapper, JavnaNabavkaRepository jnRepo) {
        this.repo = repo;
        this.mapper = mapper;
        this.jnRepo = jnRepo;
    }

    public List<PartijaDto> findAll() {
        List<Partija> partijaList = repo.findAll();
        List<PartijaDto> dtoList = new ArrayList<>();

        for (Partija partija: partijaList)
            dtoList.add(mapper.toDto(partija));

        return dtoList;
    }

    public PartijaDto save(PartijaDto partijaDto) {
        repo.save(mapper.fromDto(partijaDto));
        return partijaDto;
    }

    public PartijaDto update(Long id, PartijaDto partijaDto) {
        if (repo.existsById(id)) {
            Partija saved = repo.findById(id).get();
            saved.setStatusPartije(partijaDto.getStatusPartije());
            saved.setNaziv(partijaDto.getNaziv());
            saved.setValuta(partijaDto.getValuta());
            saved.setKriterijumiZaDodeluUgovora(partijaDto.getKriterijumiZaDodeluUgovora());
            saved.setGlavnoMestoIzvrsenja(partijaDto.getGlavnoMestoIzvrsenja());
            saved.setNSTJIzvrsenja(partijaDto.getNSTJIzvrsenja());
            saved.setTrajanjeUgovoraUMesecima(partijaDto.getTrajanjeUgovoraUMesecima());
            saved.setDokumentiKojiSeZahtevaju(partijaDto.getDokumentiKojiSeZahtevaju());
            saved.setJavnaNabavka(jnRepo.findById(partijaDto.getJavnaNabavkaId()).get());
            repo.save(saved);
            return mapper.toDto(saved);
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