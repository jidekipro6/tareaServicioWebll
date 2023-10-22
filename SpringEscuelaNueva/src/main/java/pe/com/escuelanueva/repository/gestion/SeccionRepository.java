package pe.com.escuelanueva.repository.gestion;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.escuelanueva.entity.gestion.SeccionEntity;
import pe.com.escuelanueva.repository.generic.GenericoRepository;

@Repository
public interface SeccionRepository extends GenericoRepository<SeccionEntity, Long>{
    @Query("select s from SeccionEntity s where s.estado=true")
    List<SeccionEntity> findAllCustom();
}
