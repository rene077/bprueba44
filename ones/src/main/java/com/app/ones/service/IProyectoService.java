/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.ones.service;

import com.app.ones.models.Proyecto;
import java.util.List;

/**
 *
 * @author Kratos
 */
public interface IProyectoService {
    public List<Proyecto> obtenerProyecto();
    public Proyecto crearProyecto(Proyecto proyecto);
    public void borrarProyecto(Long id);
    public Proyecto obtenerProyecto(Long id);
    public void modificarProyecto(Proyecto proyecto);
}
