
package com.app.ones.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String proyect;
    private String details;
    
    @Override
    public String toString() {
        return "Educacion{" + " proyect=" + proyect + ", details=" + details  + '}';
    }
}
