
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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Basic
    private String position;
    private String company;
    private String workday;
    private String start;
    private String end;
    private String location;
    private String time;
    private String imgp;
    
    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", position=" + position + ", company=" + company + ", workday=" + workday + ", location=" + location + '}';
    }
}
