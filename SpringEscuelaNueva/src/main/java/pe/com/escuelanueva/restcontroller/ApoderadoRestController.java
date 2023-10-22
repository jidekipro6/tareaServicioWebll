 
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
import pe.com.escuelanueva.dao.gestion.apoderadoDto;
 
import pe.com.escuelanueva.service.gestion.ApoderadoService;
 
@RestController
@RequestMapping("/apoderado")
public class ApoderadoRestController {
    @Autowired
     private ApoderadoService servicio;
     @GetMapping 
     public List<apoderadoDto>funAll(){
     return servicio.findAll();}
     @GetMapping ("/custom")
     public List<apoderadoDto>findAllCustom(){
     return servicio.findAllCustom();}
     @GetMapping("/{id}")
     public apoderadoDto finById(@PathVariable long id){
     return servicio.findById(id);}
    @PostMapping 
    public apoderadoDto add(@RequestBody apoderadoDto g){
    return servicio.add(g);}
    
    @PutMapping("/{id}")
     public apoderadoDto update(@PathVariable long id,@RequestBody apoderadoDto g){
     return servicio.update(g,id);}
    
     @DeleteMapping("/{id}")
     public apoderadoDto delete(@PathVariable long id){
     return servicio.delete(id);}
     
     @PutMapping("/enable/{id}")
     public apoderadoDto enable(@PathVariable long id){
     return servicio.enable(id);}
    
}
