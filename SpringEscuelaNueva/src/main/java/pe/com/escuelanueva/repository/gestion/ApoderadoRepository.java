 
package pe.com.escuelanueva.repository.gestion;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.escuelanueva.entity.gestion.ApoderadoEntity;
import pe.com.escuelanueva.entity.gestion.GradoEntity;
import pe.com.escuelanueva.repository.generic.GenericoRepository;

@Repository
public interface ApoderadoRepository extends GenericoRepository<ApoderadoEntity, Long>{
    @Query("select g from ApoderadoEntity g where g.estado=true")
    List<ApoderadoEntity> findAllCustom();
}
