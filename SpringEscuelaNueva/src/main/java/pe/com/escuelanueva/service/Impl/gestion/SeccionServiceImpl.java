 
package pe.com.escuelanueva.service.Impl.gestion;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.escuelanueva.dao.gestion.seccionDto;
 
import pe.com.escuelanueva.entity.gestion.SeccionEntity;
import pe.com.escuelanueva.repository.gestion.SeccionRepository;
import pe.com.escuelanueva.service.gestion.SeccionService;

@RequiredArgsConstructor
@Service
public class SeccionServiceImpl implements SeccionService {

    @Autowired
    private SeccionRepository repositorio;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<seccionDto> findAll() {
        List<SeccionEntity> lista = repositorio.findAll();
        return lista.stream().
                map(c -> mapper.map(c, seccionDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<seccionDto> findAllCustom() {
        List<SeccionEntity> lista = repositorio.findAllCustom();
        return lista.stream().
                map(c -> mapper.map(c, seccionDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public seccionDto findById(Long id) {
        SeccionEntity lista = repositorio.findById(id).get();
        return mapper.map(lista, seccionDto.class);
    }

    @Override
    public seccionDto add(seccionDto t) {
        SeccionEntity grado = mapper.map(t, SeccionEntity.class);
        return mapper.map(repositorio.save(grado), seccionDto.class);
    }

    @Override
    public seccionDto update(seccionDto t,Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public seccionDto delete( Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public seccionDto enable(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

