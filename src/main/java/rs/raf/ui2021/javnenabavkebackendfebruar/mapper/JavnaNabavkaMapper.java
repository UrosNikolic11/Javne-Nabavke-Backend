package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.JavnaNabavkaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.JavnaNabavkaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;

@Component
public class JavnaNabavkaMapper {

    private JavnaNabavkaRepository javnaNabavkaRepository;

    public JavnaNabavkaDto javnaNabavkaToJavnaNabavkaDto(JavnaNabavka javnaNabavka){

        JavnaNabavkaDto javnaNabavkaDto = new JavnaNabavkaDto();

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

        javnaNabavka.setNijePredvidjenaUPlanu(javnaNabavkaCreateDto.getNijePredvidjenaUPlanu());
        javnaNabavka.setNaziv(javnaNabavkaCreateDto.getNaziv());
        javnaNabavka.setInterniBroj(javnaNabavkaCreateDto.getInterniBroj());
        javnaNabavka.setProcenjenaVrednost(javnaNabavkaCreateDto.getProcenjenaVrednost());
        javnaNabavka.setObjavaProcenjeneVrednosti(javnaNabavkaCreateDto.getObjavaProcenjeneVrednosti());
        javnaNabavka.setZahtevZaElekKomunikaciju(javnaNabavkaCreateDto.getZahtevZaElekKomunikaciju());
        javnaNabavka.setKratakOpis(javnaNabavkaCreateDto.getKratakOpis());
        javnaNabavka.setRokZaPodnosenjePonuda(javnaNabavkaCreateDto.getRokZaPodnosenjePonuda());
        javnaNabavka.setRokVazenjaPonudeUDanima(javnaNabavkaCreateDto.getRokVazenjaPonudeUDanima());
        javnaNabavka.setDatumOtvaranjaPonuda(javnaNabavkaCreateDto.getDatumOtvaranjaPonuda());
        javnaNabavka.setOpis(javnaNabavkaCreateDto.getOpis());
        javnaNabavka.setJelMala(javnaNabavkaCreateDto.getJelMala());
        javnaNabavka.getKomisija().setId(javnaNabavkaCreateDto.getKomisija_id());
        javnaNabavka.setKomisijaOdobrila(javnaNabavkaCreateDto.getKomisijaOdobrila());
        javnaNabavka.getStatusJavneNabavke().setId(javnaNabavkaCreateDto.getStatusJavneNabavke_id());
        javnaNabavka.getVrstaPostupka().setId(javnaNabavkaCreateDto.getVrstaPostupka_id());
        javnaNabavka.getVrstaPredmeta().setId(javnaNabavkaCreateDto.getVrstaPredmeta_id());
        javnaNabavka.getNarucilac().setId(javnaNabavkaCreateDto.getNarucilac_id());

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
