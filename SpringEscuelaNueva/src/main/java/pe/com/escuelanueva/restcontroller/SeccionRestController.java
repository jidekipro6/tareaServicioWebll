 
package pe.com.escuelanueva.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.escuelanueva.dao.gestion.seccionDto;
import pe.com.escuelanueva.service.gestion.SeccionService;

 

 @RestController
 @RequestMapping("/seccion")
public class SeccionRestController {
     @Autowired
     private SeccionService servicio;
     @GetMapping 
     public List<seccionDto>funAll(){
     return servicio.findAll();
     }
     @GetMapping ("/custom")
     public List<seccionDto>findAllCustom(){
     return servicio.findAllCustom();
     }
     @GetMapping("/{id}")
     public seccionDto finById(@PathVariable long id){
     return servicio.findById(id);
     }
    @PostMapping 
    public seccionDto add(@RequestBody seccionDto s){
    return servicio.add(s);
    }
    
}
