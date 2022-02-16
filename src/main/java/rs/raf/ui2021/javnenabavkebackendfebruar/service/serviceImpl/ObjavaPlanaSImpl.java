package rs.raf.ui2021.javnenabavkebackendfebruar.service.serviceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObjavaPlanaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObjavaPlanaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.mapper.ObjavaPlanaMapper;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.ObjavaPlana;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.ObjavaPlanaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.service.ObjavaPlanaService;

@Service

public class ObjavaPlanaSImpl implements ObjavaPlanaService {

    private ObjavaPlanaRepository objavaPlanaRepository;
    private ObjavaPlanaMapper objavaPlanaMapper;

    public ObjavaPlanaSImpl(ObjavaPlanaRepository objavaPlanaRepository, ObjavaPlanaMapper objavaPlanaMapper) {
        this.objavaPlanaRepository = objavaPlanaRepository;
        this.objavaPlanaMapper = objavaPlanaMapper;
    }

    @Override
    public Page<ObjavaPlanaDto> findAll(Pageable pageable) {
        return objavaPlanaRepository.findAll(pageable)
                .map(objavaPlanaMapper::objavaPlanaToObjavaPlanaDto);
    }

    @Override
    public ObjavaPlanaDto add(ObjavaPlanaCreateDto objavaPlanaCreateDto) throws javassist.NotFoundException {
        ObjavaPlana objavaPlana = objavaPlanaMapper.objavaPlanaCreateDtoToObjavaPlana(objavaPlanaCreateDto);
        objavaPlanaRepository.save(objavaPlana);
        return objavaPlanaMapper.objavaPlanaToObjavaPlanaDto(objavaPlana);
    }

    @Override
    public ObjavaPlanaDto findById(Long id) {
        return objavaPlanaRepository.findById(id)
                .map(objavaPlanaMapper::objavaPlanaToObjavaPlanaDto)
                .orElseThrow(() -> new NotFoundException(String.format("Objava plana sa id: %d nije pronadjena.", id)));
    }

    @Override
    public void deleteById(Long id) {
        objavaPlanaRepository.deleteById(id);
    }

    @Override
    public void updateObjavaPlana(Long id, ObjavaPlanaCreateDto objavaPlanaCreateDto) {
        ObjavaPlana objavaPlana = objavaPlanaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Objava plana sa id: %d nije pronadjena.", id)));
        objavaPlana.setDatumObjave(objavaPlanaCreateDto.getDatumObjave());
        objavaPlana.setStatusObjave(objavaPlanaCreateDto.getStatusObjave());
        objavaPlanaRepository.save(objavaPlana);
    }
}
