package pe.com.escuelanueva.service.Impl.gestion;

import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.com.escuelanueva.dao.gestion.gradoDto;

import pe.com.escuelanueva.entity.gestion.GradoEntity;

import pe.com.escuelanueva.repository.gestion.GradoRepository;

import pe.com.escuelanueva.service.gestion.GradoServicee;

@RequiredArgsConstructor

@Service

public class GradoServiceImpl implements GradoServicee {

    @Autowired

    private GradoRepository repository;

    @Autowired

    private ModelMapper mapper;

    @Override

    public List<gradoDto> findAll() {

        List<GradoEntity> lista = repository.findAll();

        return lista.stream().map(c -> mapper.map(c, gradoDto.class)).collect(Collectors.toList());

    }

    @Override

    public List<gradoDto> findAllCustom() {

        List<GradoEntity> lista = repository.findAllCustom();
        return lista.stream().
                map(c -> mapper.map(c, gradoDto.class))
                .collect(Collectors.toList());
    }

    @Override

    public gradoDto findById(Long id) {

        GradoEntity lista = repository.findById(id).get();
        return mapper.map(lista, gradoDto.class);

    }

    @Override

    public gradoDto add(gradoDto t) {

        GradoEntity grado = mapper.map(t, GradoEntity.class);
        return mapper.map(repository.save(grado), gradoDto.class);

    }

    @Override

    public gradoDto update(gradoDto t, Long id) {

        GradoEntity grado = repository.findById(id).get();
        mapper.map(t, grado);
        return mapper.map(repository.save(grado), gradoDto.class);
    }

    @Override

    public gradoDto delete(Long id) {

        // TODO Auto-generated method stub
        GradoEntity grado = repository.findById(id).get();
        grado.setEstado(false);

        return mapper.map(repository.save(grado), gradoDto.class);
    }

    @Override
    public gradoDto enable(Long id) {

        GradoEntity grado = repository.findById(id).get();
        grado.setEstado(true);

        return mapper.map(repository.save(grado), gradoDto.class);

    }

}
