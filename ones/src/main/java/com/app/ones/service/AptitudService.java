/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.ones.service;

import com.app.ones.models.Aptitud;
import com.app.ones.repos.AptitudRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AptitudService implements IAptitudService{

    @Autowired
    public AptitudRepo repository;
    
    @Override
    public List<Aptitud> obtenerAptitud() {
      return repository.findAll();
    }

    @Override
    public Aptitud crearAptitud(Aptitud aptitud) {
      return repository.save(aptitud);
    }

    @Override
    public void borrarAptitud(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Aptitud obtenerAptitud(Long id) {
       return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarAptitud(Aptitud aptitud) {
       repository.save(aptitud);
    }
    
}
