
package com.app.ones.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Info {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
    
    private Long id;
    private String name;
    private String title;
    private String company;
    private String celular;
    private String correo;
    private String location;
    private String imgp;
    private String imgl;

    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", fullname=" + name + ", title=" + title + ", location=" + location + ", imgp=" + imgp + '}';
    }
   
}
