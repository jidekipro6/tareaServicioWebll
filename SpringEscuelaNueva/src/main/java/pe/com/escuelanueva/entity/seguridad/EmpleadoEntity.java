 
package pe.com.escuelanueva.entity.seguridad;

  
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;
import lombok.experimental.SuperBuilder;

import pe.com.escuelanueva.entity.base.PersonaEntity;

@SuperBuilder
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
 
@Entity(name = "EmpleadoEntity")
@Table(name = "empleado")
public class EmpleadoEntity extends PersonaEntity implements Serializable{
   
    
     private static final long serialVersionUID=1L;
    @Id
    @Column(name = "codemp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @ManyToOne
    @JoinColumn(name="codrol",nullable =false)
    private RolEntity rol;
     
    
}
