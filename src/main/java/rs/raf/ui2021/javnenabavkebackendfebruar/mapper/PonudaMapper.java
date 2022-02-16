package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.PonudaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.PonudaUpdateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponuda;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponudjac;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.PonudjacRepository;

import java.util.Optional;

@Component
public class PonudaMapper {

    private PonudjacRepository ponudjacRepository;
    private JavnaNabavkaRepository javnaNabavkaRepository;

    public PonudaMapper(PonudjacRepository ponudjacRepository, JavnaNabavkaRepository javnaNabavkaRepository) {
        this.ponudjacRepository = ponudjacRepository;
        this.javnaNabavkaRepository = javnaNabavkaRepository;
    }

    public Ponuda createDtoToOriginal(PonudaCreateDto ponudaCreateDto){
        Ponuda ponuda = new Ponuda();

        Optional<JavnaNabavka> javnaNabavka = javnaNabavkaRepository.findById(ponudaCreateDto.getJavnaNabavkaId());
        Optional<Ponudjac> ponudjac = ponudjacRepository.findById(ponudaCreateDto.getPonudjacId());

        if(!javnaNabavka.isPresent()){
            throw new NotFoundException("Javna nabavka sa datim id ne postoji.");
        }
        if(!ponudjac.isPresent()){
            throw new NotFoundException("Ponudjac sa datim id ne postoji.");
        }

        ponuda.setInterniBr(ponudaCreateDto.getInterniBr());
        ponuda.setPonudjac(ponudjac.get());
        ponuda.setStatusPonude(ponudaCreateDto.getStatusPonude());
        ponuda.setNacinPlacanja(ponudaCreateDto.getNacinPlacanja());
        ponuda.setJavnaNabavka(javnaNabavka.get());

        ponuda.setRokPlacanja(ponuda.parseDate(ponudaCreateDto.getRokPlacanja()));
        ponuda.setRokVazenja(ponuda.parseDate(ponudaCreateDto.getRokVazenja()));

        ponuda.setSamostalnoIliGrupaPonudjaca(ponudaCreateDto.getSamostalnaIliGrupaPonudjaca());
        ponuda.setUkupnaCena(ponudaCreateDto.getUkupnaCena());
        ponuda.setUkupnaCenaPdv(ponudaCreateDto.getUkupnaCenaPdv());
        ponuda.setValuta(ponudaCreateDto.getValuta());
        if(ponudaCreateDto.getKoristeSePodIzvodjaci() != null)
            ponuda.setKoristeSePodIzvodjaci(ponudaCreateDto.getKoristeSePodIzvodjaci());

        return ponuda;
    }

    public PonudaDto originalToDto(Ponuda ponuda){
        PonudaDto ponudaDto = new PonudaDto();
        ponudaDto.setId(ponuda.getId());
        ponudaDto.setInterniBr(ponuda.getInterniBr());
        ponudaDto.setPonudjacId(ponuda.getPonudjac().getId());
        ponudaDto.setStatusPonude(ponuda.getStatusPonude());
        ponudaDto.setNacinPlacanja(ponuda.getNacinPlacanja());
        ponudaDto.setJavnaNabavkaId(ponuda.getJavnaNabavka().getId());
        ponudaDto.setRokPlacanja(ponuda.getRokPlacanja());
        ponudaDto.setRokVazenja(ponuda.getRokVazenja());
        ponudaDto.setSamostalnaIliGrupaPonudjaca(ponuda.getSamostalnoIliGrupaPonudjaca());
        ponudaDto.setUkupnaCena(ponuda.getUkupnaCena());
        ponudaDto.setUkupnaCenaPdv(ponuda.getUkupnaCenaPdv());
        ponudaDto.setValuta(ponuda.getValuta());
        ponudaDto.setKoristeSePodIzvodjaci(ponuda.getKoristeSePodIzvodjaci());

        return ponudaDto;
    }

    public Ponuda updateDtoToOriginal(PonudaUpdateDto ponudaUpdateDto , Ponuda ponuda){

        if(ponudaUpdateDto.getInterniBr() != null)
            ponuda.setInterniBr(ponudaUpdateDto.getInterniBr());
        if(ponudaUpdateDto.getStatusPonude() != null)
            ponuda.setStatusPonude(ponudaUpdateDto.getStatusPonude());
        if(ponudaUpdateDto.getNacinPlacanja() != null)
            ponuda.setNacinPlacanja(ponudaUpdateDto.getNacinPlacanja());
        if(ponudaUpdateDto.getRokPlacanja() != null)
            ponuda.setRokPlacanja(ponudaUpdateDto.getRokPlacanja());
        if(ponudaUpdateDto.getRokVazenja() != null)
            ponuda.setRokVazenja(ponudaUpdateDto.getRokVazenja());
        if(ponudaUpdateDto.getSamostalnaIliGrupaPonudjaca() != null)
            ponuda.setSamostalnoIliGrupaPonudjaca(ponudaUpdateDto.getSamostalnaIliGrupaPonudjaca());
        if(ponudaUpdateDto.getUkupnaCena() != null)
            ponuda.setUkupnaCena(ponudaUpdateDto.getUkupnaCena());
        if(ponudaUpdateDto.getUkupnaCenaPdv() != null)
            ponuda.setUkupnaCenaPdv(ponudaUpdateDto.getUkupnaCenaPdv());
        if(ponudaUpdateDto.getValuta() != null)
            ponuda.setValuta(ponudaUpdateDto.getValuta());
        if(ponudaUpdateDto.getKoristeSePodIzvodjaci() != null)
            ponuda.setKoristeSePodIzvodjaci(ponudaUpdateDto.getKoristeSePodIzvodjaci());

        return ponuda;
    }
}
