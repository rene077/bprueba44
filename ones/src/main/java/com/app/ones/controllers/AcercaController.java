/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.ones.controllers;

import com.app.ones.models.Acerca;
import com.app.ones.service.AcercaService;
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
public class AcercaController {
    @Autowired
    public AcercaService service;
    
    @GetMapping("/acerca")
    @ResponseBody
    public List<Acerca> obtenerAcerca() {
        return service.obtenerAcerca();
    }
 ////////////////////////////////////////////////////////////////////////////
    @PostMapping("/acerca/create")
    @ResponseBody
    public Acerca crearAcerca(@RequestBody Acerca acerca) {
        return service.crearAcerca(acerca);
    }
 ////////////////////////////////////////////////////////////////////////////   
    @DeleteMapping("/acerca/{id}")
    public void borrarAcerca(@PathVariable Long id) {
        service.borrarAcerca(id);
    }
    
    @GetMapping("/acerca/{id}")
    @ResponseBody
    public Acerca obtenerAcerca(@PathVariable Long id) {
        return service.obtenerAcerca(id);
    }
    
    @PutMapping("/acerca/update")
    public void modificarAcerca(@RequestBody Acerca acerca) {
        System.out.println(acerca);
        service.modificarAcerca(acerca);
    }
}
