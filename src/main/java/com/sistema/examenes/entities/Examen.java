package com.sistema.examenes.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "examenes")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examenId;

    private String title;
    private String description;
    private String maxpoints;
    private String questionsNumber;
    private boolean enableD = false;

    @ManyToOne(fetch = FetchType.EAGER)
    private Categoria categoria;


    @JsonIgnore
    @OneToMany(mappedBy = "examen", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Pregunta> preguntas = new HashSet<>();
    public Examen() {
    }

//    public Examen(Long examenId, String title, String description, String maxpoints, String questionsNumber, boolean enableD, Categoria categoria, Set<Pregunta> preguntas) {
//        this.examenId = examenId;
//        this.title = title;
//        this.description = description;
//        this.maxpoints = maxpoints;
//        this.questionsNumber = questionsNumber;
//        this.enableD = enableD;
//        this.categoria = categoria;
//        this.preguntas = preguntas;
//    }

    public Long getExamenId() {
        return examenId;
    }

    public void setExamenId(Long examenId) {
        this.examenId = examenId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxpoints() {
        return maxpoints;
    }

    public void setMaxpoints(String maxpoints) {
        this.maxpoints = maxpoints;
    }

    public String getQuestionsNumber() {
        return questionsNumber;
    }

    public void setQuestionsNumber(String questionsNumber) {
        this.questionsNumber = questionsNumber;
    }

    public boolean isEnableD() {
        return enableD;
    }

    public void setEnableD(boolean enableD) {
        this.enableD = enableD;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Set<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}
