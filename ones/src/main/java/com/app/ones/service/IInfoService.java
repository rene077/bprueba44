
package com.app.ones.service;

import com.app.ones.models.Info;
import java.util.List;


public interface IInfoService {
     public List<Info> obtenerInfo();
    public Info crearInfo(Info info);
    public void borrarInfo(Long id);
    public Info obtenerInfo(Long id);
    public void modificarInfo(Info info);       
}
