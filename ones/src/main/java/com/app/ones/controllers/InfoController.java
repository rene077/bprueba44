
package com.app.ones.controllers;

import com.app.ones.models.Info;
import com.app.ones.service.InfoService;
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
public class InfoController {
    
    @Autowired
    public InfoService service;
    
    @GetMapping("/info")
    @ResponseBody
    public List<Info> obtenerInfo() {
        return service.obtenerInfo();
    }
 ////////////////////////////////////////////////////////////////////////////
    @PostMapping("/info/create")
    @ResponseBody
    public Info crearInfo(@RequestBody Info info) {
        return service.crearInfo(info);
    }
 ////////////////////////////////////////////////////////////////////////////   
    @DeleteMapping("/info/{id}")
    public void borrarInfo(@PathVariable Long id) {
        service.borrarInfo(id);
    }
    
    @GetMapping("/info/{id}")
    @ResponseBody
    public Info obtenerEducacion(@PathVariable Long id) {
        return service.obtenerInfo(id);
    }
    
    @PutMapping("/info/update")
    public void modificarEducacion(@RequestBody Info info) {
        System.out.println(info);
        service.modificarInfo(info);
    }
}
