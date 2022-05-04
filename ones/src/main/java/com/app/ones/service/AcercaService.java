/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.ones.service;

import com.app.ones.models.Acerca;
import com.app.ones.repos.AcercaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaService implements IAcercaService{

    @Autowired
    public AcercaRepo repository;
    
    @Override
    public List<Acerca> obtenerAcerca() {
      return repository.findAll();
    }

    @Override
    public Acerca crearAcerca(Acerca acerca) {
      return repository.save(acerca);
    }

    @Override
    public void borrarAcerca(Long id) {
      repository.deleteById(id);
    }

    @Override
    public Acerca obtenerAcerca(Long id) {
       return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarAcerca(Acerca acerca) {
       repository.save(acerca);
    }
    
}
