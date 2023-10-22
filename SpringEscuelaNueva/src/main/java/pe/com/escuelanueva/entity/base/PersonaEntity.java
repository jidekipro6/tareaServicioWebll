package pe.com.escuelanueva.entity.base;

import java.util.Date;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class PersonaEntity {

    @Column(name = "nombre", length = 40, nullable = false)
    @NotEmpty
    @Size(min = 5, max = 40)
    private String nombre;
    
    @Column(name = "apellidopaterno", length = 40, nullable = false)
    @NotEmpty
    @Size(min = 5, max = 40)
    private String apellidopaterno;
    
    @Column(name = "apellidomaterno", length = 40, nullable = false)
    @NotEmpty
    @Size(min = 5, max = 40)
    private String apellidomaterno;
    
    @Column(name = "documento", length = 11, nullable = false)
    @NotEmpty
    @Size(min = 5, max = 40)
    private String documento;
    
    @Column(name = "fecha")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fecha;
    
    @Column(name = "direccion", length = 80, nullable = false)
    @NotEmpty
    @Size(min = 5, max = 80)
    private String direccion;
    
    @Column(name = "telefono", length = 7, nullable = true)
    @NotEmpty

    private String telefono;
    @Column(name = "celular", length = 9, nullable = false)
    @NotEmpty

    private String celular;
    @Column(name = "correo", length = 60, nullable = false)
    @NotEmpty
    private String correo;
    
    @Column(name = "sexo", length = 20, nullable = false)
    @NotEmpty
    @Size(min = 5, max = 20)
    private String sexo;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;

}
