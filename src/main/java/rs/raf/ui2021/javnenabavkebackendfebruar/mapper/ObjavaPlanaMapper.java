package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObjavaPlanaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObjavaPlanaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.ObjavaPlana;

@Component
public class ObjavaPlanaMapper {
    public ObjavaPlanaDto objavaPlanaToObjavaPlanaDto(ObjavaPlana objavaPlana) {
        ObjavaPlanaDto objavaPlanaDto = new ObjavaPlanaDto();
        objavaPlanaDto.setDatumObjave(objavaPlana.getDatumObjave());
        objavaPlanaDto.setStatusObjave(objavaPlana.getStatusObjave());
        objavaPlanaDto.setId(objavaPlana.getId());
        return objavaPlanaDto;
    }

    public ObjavaPlana objavaPlanaCreateDtoToObjavaPlana(ObjavaPlanaCreateDto objavaPlanaCreateDto) {
        ObjavaPlana objavaPlana = new ObjavaPlana();
        objavaPlana.setDatumObjave(objavaPlanaCreateDto.getDatumObjave());
        objavaPlana.setStatusObjave(objavaPlanaCreateDto.getStatusObjave());
        return objavaPlana;
    }
}
