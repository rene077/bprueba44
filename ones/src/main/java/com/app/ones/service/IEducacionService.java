
package com.app.ones.service;

import com.app.ones.models.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> obtenerEducacion();
    public Educacion crearEducacion(Educacion educacion);
    public void borrarEducacion(Long id);
    public Educacion obtenerEducacion(Long id);
    public void modificarEducacion(Educacion educacion);    
}
