package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.JavnaNabavkaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.*;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.*;

import java.util.Optional;

@Component
public class JavnaNabavkaMapper {

    private JavnaNabavkaRepository javnaNabavkaRepository;
    private KomisijaRepository komisijaRepository;
    private VrstaPostupkaRepository vrstaPostupkaRepository;
    private VrstaPredmetaRepo vrstaPredmetaRepo;
    private NarucilacRepository narucilacRepository;
    private StatusJavneNabavkeRepo statusJavneNabavkeRepo;

    public JavnaNabavkaMapper(JavnaNabavkaRepository javnaNabavkaRepository, KomisijaRepository komisijaRepository, VrstaPostupkaRepository vrstaPostupkaRepository, VrstaPredmetaRepo vrstaPredmetaRepo, NarucilacRepository narucilacRepository, StatusJavneNabavkeRepo statusJavneNabavkeRepo) {
        this.javnaNabavkaRepository = javnaNabavkaRepository;
        this.komisijaRepository = komisijaRepository;
        this.vrstaPostupkaRepository = vrstaPostupkaRepository;
        this.vrstaPredmetaRepo = vrstaPredmetaRepo;
        this.narucilacRepository = narucilacRepository;
        this.statusJavneNabavkeRepo = statusJavneNabavkeRepo;
    }

    public JavnaNabavkaDto javnaNabavkaToJavnaNabavkaDto(JavnaNabavka javnaNabavka){

        JavnaNabavkaDto javnaNabavkaDto = new JavnaNabavkaDto();

        javnaNabavkaDto.setId(javnaNabavka.getId());
        javnaNabavkaDto.setNijePredvidjenaUPlanu(javnaNabavka.getNijePredvidjenaUPlanu());
        javnaNabavkaDto.setNaziv(javnaNabavka.getNaziv());
        javnaNabavkaDto.setInterniBroj(javnaNabavka.getInterniBroj());
        javnaNabavkaDto.setProcenjenaVrednost(javnaNabavka.getProcenjenaVrednost());
        javnaNabavkaDto.setObjavaProcenjeneVrednosti(javnaNabavka.getObjavaProcenjeneVrednosti());
        javnaNabavkaDto.setZahtevZaElekKomunikaciju(javnaNabavka.getZahtevZaElekKomunikaciju());
        javnaNabavkaDto.setKratakOpis(javnaNabavka.getKratakOpis());
        javnaNabavkaDto.setRokZaPodnosenjePonuda(javnaNabavka.getRokZaPodnosenjePonuda());
        javnaNabavkaDto.setRokVazenjaPonudeUDanima(javnaNabavka.getRokVazenjaPonudeUDanima());
        javnaNabavkaDto.setDatumOtvaranjaPonuda(javnaNabavka.getDatumOtvaranjaPonuda());
        javnaNabavkaDto.setOpis(javnaNabavka.getOpis());
        javnaNabavkaDto.setJelMala(javnaNabavka.getJelMala());
        javnaNabavkaDto.setKomisija_id(javnaNabavka.getKomisija().getId());
        javnaNabavkaDto.setKomisijaOborila(javnaNabavka.getKomisijaOdobrila());
        javnaNabavkaDto.setStatusJavneNabavke_id(javnaNabavka.getStatusJavneNabavke().getId());
        javnaNabavkaDto.setVrstaPostupka_id(javnaNabavka.getVrstaPostupka().getId());
        javnaNabavkaDto.setVrstaPredmeta_id(javnaNabavka.getVrstaPredmeta().getId());
        javnaNabavkaDto.setNarucilac_id(javnaNabavka.getNarucilac().getId());

        return javnaNabavkaDto;
    }

    public JavnaNabavka javnaNabavkaCreateDtoToJavnaNabavka(JavnaNabavkaCreateDto javnaNabavkaCreateDto){

        JavnaNabavka javnaNabavka = new JavnaNabavka();

        Optional<Komisija> komisija = komisijaRepository.findById(javnaNabavkaCreateDto.getKomisija_id());
        Optional<Narucilac> narucilac = narucilacRepository.findById(javnaNabavkaCreateDto.getNarucilac_id());
        Optional<VrstaPredmeta> vrstaPredmeta = vrstaPredmetaRepo.findById(javnaNabavkaCreateDto.getVrstaPredmeta_id());
        Optional<VrstaPostupka> vrstaPostupka = vrstaPostupkaRepository.findById(javnaNabavkaCreateDto.getVrstaPostupka_id());
        Optional<StatusJavneNabavke> statusJavneNabavke = statusJavneNabavkeRepo.findById(javnaNabavkaCreateDto.getStatusJavneNabavke_id());

        if (!komisija.isPresent())
            throw new NotFoundException("Komisija sa datim id ne postoji");
        if (!narucilac.isPresent())
            throw new NotFoundException("Narucilac sa datim id ne postoji");
        if (!vrstaPostupka.isPresent())
            throw new NotFoundException("Vrsta postupka sa datim id ne postoji");
        if (!vrstaPredmeta.isPresent())
            throw new NotFoundException("Vrsta predmeta sa datim id ne postoji");
        if (!statusJavneNabavke.isPresent())
            throw new NotFoundException("Status javne nabavke sa datim id ne postoji");


        javnaNabavka.setNijePredvidjenaUPlanu(javnaNabavkaCreateDto.getNijePredvidjenaUPlanu());
        javnaNabavka.setNaziv(javnaNabavkaCreateDto.getNaziv());
        javnaNabavka.setInterniBroj(javnaNabavkaCreateDto.getInterniBroj());
        javnaNabavka.setProcenjenaVrednost(javnaNabavkaCreateDto.getProcenjenaVrednost());
        javnaNabavka.setObjavaProcenjeneVrednosti(javnaNabavkaCreateDto.getObjavaProcenjeneVrednosti());
        javnaNabavka.setZahtevZaElekKomunikaciju(javnaNabavkaCreateDto.getZahtevZaElekKomunikaciju());
        javnaNabavka.setKratakOpis(javnaNabavkaCreateDto.getKratakOpis());

        javnaNabavka.setRokZaPodnosenjePonuda(javnaNabavka.parseDate(javnaNabavkaCreateDto.getRokZaPodnosenjePonuda()));

        javnaNabavka.setRokVazenjaPonudeUDanima(javnaNabavkaCreateDto.getRokVazenjaPonudeUDanima());

        javnaNabavka.setDatumOtvaranjaPonuda(javnaNabavka.parseDate(javnaNabavkaCreateDto.getDatumOtvaranjaPonuda()));

        javnaNabavka.setOpis(javnaNabavkaCreateDto.getOpis());
        javnaNabavka.setJelMala(javnaNabavkaCreateDto.getJelMala());
        javnaNabavka.setKomisijaOdobrila(javnaNabavkaCreateDto.getKomisijaOdobrila());

        javnaNabavka.setKomisija(komisija.get());
        javnaNabavka.setNarucilac(narucilac.get());
        javnaNabavka.setVrstaPredmeta(vrstaPredmeta.get());
        javnaNabavka.setVrstaPostupka(vrstaPostupka.get());
        javnaNabavka.setStatusJavneNabavke(statusJavneNabavke.get());



        return javnaNabavka;
    }

    public JavnaNabavka javnaNabavkaUpdateDtoToJavnaNabavka(JavnaNabavkaUpdateDto javnaNabavkaUpdateDto, JavnaNabavka javnaNabavka){

        if(javnaNabavkaUpdateDto.getNijePredvidjenaUPlanu() != null)
            javnaNabavka.setNijePredvidjenaUPlanu(javnaNabavkaUpdateDto.getNijePredvidjenaUPlanu());
        if(javnaNabavkaUpdateDto.getNaziv() != null)
            javnaNabavka.setNaziv(javnaNabavkaUpdateDto.getNaziv());
        if(javnaNabavkaUpdateDto.getInterniBroj() != null)
            javnaNabavka.setInterniBroj(javnaNabavkaUpdateDto.getInterniBroj());
        if(javnaNabavkaUpdateDto.getProcenjenaVrednost() != null)
            javnaNabavka.setProcenjenaVrednost(javnaNabavkaUpdateDto.getProcenjenaVrednost());
        if(javnaNabavkaUpdateDto.getObjavaProcenjeneVrednosti() != null)
            javnaNabavka.setObjavaProcenjeneVrednosti(javnaNabavkaUpdateDto.getObjavaProcenjeneVrednosti());
        if(javnaNabavkaUpdateDto.getZahtevZaElekKomunikaciju() != null)
            javnaNabavka.setZahtevZaElekKomunikaciju(javnaNabavkaUpdateDto.getZahtevZaElekKomunikaciju());
        if(javnaNabavkaUpdateDto.getKratakOpis() != null)
            javnaNabavka.setKratakOpis(javnaNabavkaUpdateDto.getKratakOpis());
        if(javnaNabavkaUpdateDto.getRokZaPodnosenjePonuda() != null)
            javnaNabavka.setRokZaPodnosenjePonuda(javnaNabavkaUpdateDto.getRokZaPodnosenjePonuda());
        if(javnaNabavkaUpdateDto.getRokVazenjaPonudeUDanima() != null)
            javnaNabavka.setRokVazenjaPonudeUDanima(javnaNabavkaUpdateDto.getRokVazenjaPonudeUDanima());
        if(javnaNabavkaUpdateDto.getDatumOtvaranjaPonuda() != null)
            javnaNabavka.setDatumOtvaranjaPonuda(javnaNabavkaUpdateDto.getDatumOtvaranjaPonuda());
        if(javnaNabavkaUpdateDto.getOpis() != null)
            javnaNabavka.setOpis(javnaNabavkaUpdateDto.getOpis());
        if(javnaNabavkaUpdateDto.getJelMala() != null)
            javnaNabavka.setJelMala(javnaNabavkaUpdateDto.getJelMala());
        if(javnaNabavkaUpdateDto.getKomisijaOborila() != null)
            javnaNabavka.setKomisijaOdobrila(javnaNabavkaUpdateDto.getKomisijaOborila());

        return javnaNabavka;
    }
}
