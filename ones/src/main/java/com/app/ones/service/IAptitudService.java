/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.ones.service;

import com.app.ones.models.Aptitud;
import java.util.List;

/**
 *
 * @author Kratos
 */
public interface IAptitudService {
       public List<Aptitud> obtenerAptitud();
    public Aptitud crearAptitud(Aptitud aptitud);
    public void borrarAptitud(Long id);
    public Aptitud obtenerAptitud(Long id);
    public void modificarAptitud(Aptitud aptitud);    
}
