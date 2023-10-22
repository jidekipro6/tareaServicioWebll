 
package pe.com.escuelanueva.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.escuelanueva.dao.gestion.gradoDto;
import pe.com.escuelanueva.service.gestion.GradoServicee;

 @RestController
 @RequestMapping("/grado")
public class GradoRestController {
     @Autowired
     private GradoServicee servicio;
     @GetMapping 
     public List<gradoDto>funAll(){
     return servicio.findAll();}
     @GetMapping ("/custom")
     public List<gradoDto>findAllCustom(){
     return servicio.findAllCustom();}
     @GetMapping("/{id}")
     public gradoDto finById(@PathVariable long id){
     return servicio.findById(id);}
    @PostMapping 
    public gradoDto add(@RequestBody gradoDto g){
    return servicio.add(g);}
    
    @PutMapping("/{id}")
     public gradoDto update(@PathVariable long id,@RequestBody gradoDto g){
     return servicio.update(g,id);}
    
     @DeleteMapping("/{id}")
     public gradoDto delete(@PathVariable long id){
     return servicio.delete(id);}
     
     @PutMapping("/enable/{id}")
     public gradoDto enable(@PathVariable long id){
     return servicio.enable(id);}
}
