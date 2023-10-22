 
package pe.com.escuelanueva.dao.generico;

 
import lombok.*;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class genericoDto {
    @Builder.Default
    private Long codigo=0L;
    
    
}
