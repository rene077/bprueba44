
package com.app.ones.service;

import com.app.ones.models.Info;
import com.app.ones.repos.InfoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService implements IInfoService{

    @Autowired
    public InfoRepo repository;
    
    @Override
    public List<Info> obtenerInfo() {
      return  repository.findAll();
    }

    @Override
    public Info crearInfo(Info info) {
      return repository.save(info);
    }

    @Override
    public void borrarInfo(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Info obtenerInfo(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarInfo(Info info) {
        repository.save(info);
    }
    
}
