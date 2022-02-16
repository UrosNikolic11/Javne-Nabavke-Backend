package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PartijaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Partija;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;

@Component
public class PartijaMapper {
    private JavnaNabavkaRepository repo;

    public Partija fromDto(PartijaDto dto) {
        Partija partija = new Partija();
        partija.setJavnaNabavka(repo.findById(dto.getJavnaNabavkaId()).get());
        partija.setValuta(dto.getValuta());
        partija.setStatusPartije(dto.getStatusPartije());
        partija.setDokumentiKojiSeZahtevaju(dto.getDokumentiKojiSeZahtevaju());
        partija.setNSTJIzvrsenja(dto.getNSTJIzvrsenja());
        partija.setTrajanjeUgovoraUMesecima(dto.getTrajanjeUgovoraUMesecima());
        partija.setGlavnoMestoIzvrsenja(dto.getGlavnoMestoIzvrsenja());
        partija.setKriterijumiZaDodeluUgovora(dto.getKriterijumiZaDodeluUgovora());
        partija.setNaziv(dto.getNaziv());
        return partija;
    }

    public PartijaDto toDto(Partija partija) {
        PartijaDto dto = new PartijaDto();
        dto.setJavnaNabavkaId(partija.getJavnaNabavka().getId());
        dto.setValuta(partija.getValuta());
        dto.setNaziv(partija.getNaziv());
        dto.setStatusPartije(partija.getStatusPartije());
        dto.setDokumentiKojiSeZahtevaju(partija.getDokumentiKojiSeZahtevaju());
        dto.setNSTJIzvrsenja(partija.getNSTJIzvrsenja());
        dto.setGlavnoMestoIzvrsenja(partija.getGlavnoMestoIzvrsenja());
        dto.setKriterijumiZaDodeluUgovora(partija.getKriterijumiZaDodeluUgovora());
        dto.setTrajanjeUgovoraUMesecima(dto.getTrajanjeUgovoraUMesecima());
        return dto;
    }
}