/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.escuelanueva.entity.gestion;

 
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
@JsonPropertyOrder({"codigo","nombre","apellidopaterno","apellidomaterno","documento","fecha","direccion","telefono","celular","correo","sexo","estado"})
@Entity(name = "ApoderadoEntity")
@Table(name = "apoderado")
public class ApoderadoEntity  extends PersonaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codapo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

}
