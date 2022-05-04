/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.ones.service;

import com.app.ones.models.Experiencia;
import com.app.ones.repos.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepo repository;
    
    @Override
    public List<Experiencia> obtenerExperiencia() {
      return repository.findAll();
    }

    @Override
    public Experiencia crearExperiencia(Experiencia experiencia) {
       return repository.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Experiencia obtenerExperiencia(Long id) {
       return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencia experiencia) {
        repository.save(experiencia);
    }
       
}
