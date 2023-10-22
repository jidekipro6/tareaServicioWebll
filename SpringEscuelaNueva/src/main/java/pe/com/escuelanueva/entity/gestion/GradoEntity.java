package pe.com.escuelanueva.entity.gestion;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;
import lombok.experimental.SuperBuilder;
import pe.com.escuelanueva.entity.base.BaseEntity;

@SuperBuilder
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonPropertyOrder({"codigo","nombre","estado"})
@Entity(name = "GradoEntity")
@Table(name = "grado")
public class GradoEntity extends BaseEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "codgra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(name="nomgra",length = 30,nullable = false)
    private String nombre;
}
