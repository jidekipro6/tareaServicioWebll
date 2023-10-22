 
package pe.com.escuelanueva.service.Impl.gestion;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.escuelanueva.dao.gestion.apoderadoDto;
import pe.com.escuelanueva.entity.gestion.ApoderadoEntity;
import pe.com.escuelanueva.repository.gestion.ApoderadoRepository;
import pe.com.escuelanueva.service.gestion.ApoderadoService;

@RequiredArgsConstructor

@Service
public class ApoderadoImpl implements ApoderadoService{
     @Autowired

    private ApoderadoRepository repository;

    @Autowired

    private ModelMapper mapper;

    @Override

    public List<apoderadoDto> findAll() {

        List<ApoderadoEntity> lista = repository.findAll();

        return lista.stream().map(c -> mapper.map(c, apoderadoDto.class)).collect(Collectors.toList());

    }

    @Override

    public List<apoderadoDto> findAllCustom() {

        List<ApoderadoEntity> lista = repository.findAllCustom();
        return lista.stream().
                map(c -> mapper.map(c, apoderadoDto.class))
                .collect(Collectors.toList());
    }

    @Override

    public apoderadoDto findById(Long id) {

        ApoderadoEntity lista = repository.findById(id).get();
        return mapper.map(lista, apoderadoDto.class);

    }

    @Override

    public apoderadoDto add(apoderadoDto t) {

        ApoderadoEntity grado = mapper.map(t, ApoderadoEntity.class);
        return mapper.map(repository.save(grado), apoderadoDto.class);

    }

    @Override

    public apoderadoDto update(apoderadoDto t, Long id) {

        ApoderadoEntity grado = repository.findById(id).get();
        mapper.map(t, grado);
        return mapper.map(repository.save(grado), apoderadoDto.class);
    }

    @Override

    public apoderadoDto delete(Long id) {

        // TODO Auto-generated method stub
        ApoderadoEntity grado = repository.findById(id).get();
        grado.setEstado(false);

        return mapper.map(repository.save(grado), apoderadoDto.class);
    }

    @Override
    public apoderadoDto enable(Long id) {

        ApoderadoEntity grado = repository.findById(id).get();
        grado.setEstado(true);

        return mapper.map(repository.save(grado), apoderadoDto.class);

    }

}
