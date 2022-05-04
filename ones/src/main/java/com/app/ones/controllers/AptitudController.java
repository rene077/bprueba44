
package com.app.ones.controllers;

import com.app.ones.models.Aptitud;
import com.app.ones.service.AptitudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AptitudController {
    
    @Autowired
    public AptitudService service;
    
    @GetMapping("/aptitud")
    @ResponseBody
    public List<Aptitud> obtenerAptitud() {
        return service.obtenerAptitud();
    }
 ////////////////////////////////////////////////////////////////////////////
    @PostMapping("/aptitud/create")
    @ResponseBody
    public Aptitud crearAptitud(@RequestBody Aptitud aptitud) {
        return service.crearAptitud(aptitud);
    }
 ////////////////////////////////////////////////////////////////////////////   
    @DeleteMapping("/aptitud/{id}")
    public void borrarAptitud(@PathVariable Long id) {
        service.borrarAptitud(id);
    }
    
    @GetMapping("/aptitud/{id}")
    @ResponseBody
    public Aptitud obtenerAptitud(@PathVariable Long id) {
        return service.obtenerAptitud(id);
    }
    
    @PutMapping("/aptitud/update")
    public void modificarAptitutd(@RequestBody Aptitud aptitud) {
        System.out.println(aptitud);
        service.modificarAptitud(aptitud);
    }
}
