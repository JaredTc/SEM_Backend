package com.sistema.examenes.entities;


import javax.persistence.*;

@Entity
@Table(name = "preguntas")
public class Pregunta {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuestion;

     @Column(length = 5000)
     private String contain;
     private String image;
     private String option1;
     private String option2;
    private String option3;
    private String option4;
    private String request;

    @ManyToOne(fetch = FetchType.EAGER)
    private Examen examen;

    public Pregunta() {
    }

//    public Pregunta(Long idQuestion, String contain, String image, String option1, String option2, String option3, String option4, String request, Examen examen) {
//        this.idQuestion = idQuestion;
//        this.contain = contain;
//        this.image = image;
//        this.option1 = option1;
//        this.option2 = option2;
//        this.option3 = option3;
//        this.option4 = option4;
//        this.request = request;
//        this.examen = examen;
//    }

    public Long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
}
