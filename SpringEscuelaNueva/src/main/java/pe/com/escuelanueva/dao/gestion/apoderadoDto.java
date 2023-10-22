 
package pe.com.escuelanueva.dao.gestion;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

 @SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonPropertyOrder({"codigo","nombre","apellidopaterno","apellidomaterno","documento","fecha","direccion","telefono","celular","correo","sexo","estado"})
public class apoderadoDto {
     private boolean estado;
      
 }
    

