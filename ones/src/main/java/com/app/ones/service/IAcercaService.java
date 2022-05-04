/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.ones.service;

import com.app.ones.models.Acerca;
import java.util.List;

/**
 *
 * @author Kratos
 */
public interface IAcercaService {
    public List<Acerca> obtenerAcerca();
    public Acerca crearAcerca(Acerca acerca);
    public void borrarAcerca(Long id);
    public Acerca obtenerAcerca(Long id);
    public void modificarAcerca(Acerca acerca);    
}
