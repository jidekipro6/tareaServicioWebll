 
package pe.com.escuelanueva.dao.gestion;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
 
import lombok.experimental.SuperBuilder;
import pe.com.escuelanueva.dao.generico.genericoDto;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonPropertyOrder({"codigo","nombre","estado"})

public class gradoDto extends genericoDto{
    private String nombre  ;
    private boolean estado;
    
    
}
