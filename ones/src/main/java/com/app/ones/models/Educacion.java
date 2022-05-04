
package com.app.ones.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Basic 
    private String school;
    private String title;
    private int score;
    private String img;
    private String career;
    private String start;
    private String end;
    private String course;
    
    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", school=" + school + ", title=" + title + ", score=" + score + ", img=" + img + '}';
    }
}
