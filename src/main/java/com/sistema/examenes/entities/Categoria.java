package com.sistema.examenes.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String title;
    private String description;

    @OneToMany(mappedBy = "categoria",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Examen> examenes = new LinkedHashSet<>();


    public Categoria() {
    }

    public Categoria(Long categoryId, String title, String description, Set<Examen> examenes) {
        this.categoryId = categoryId;
        this.title = title;
        this.description = description;
        this.examenes = examenes;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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

    public Set<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(Set<Examen> examenes) {
        this.examenes = examenes;
    }
}
