package pe.com.escuelanueva.repository.gestion;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.escuelanueva.entity.gestion.GradoEntity;
import pe.com.escuelanueva.repository.generic.GenericoRepository;
@Repository
public interface GradoRepository extends GenericoRepository<GradoEntity, Long>{
    //personalizamos consultas, todos los grados habilitados
    //ejemplo la consulta para todos los grados
    //select * from grado where codgra=1
    @Query("select g from GradoEntity g where g.estado=true")
    List<GradoEntity> findAllCustom();
    
}
