package com.sistema.examenes.services;

import com.sistema.examenes.entities.Examen;
import com.sistema.examenes.entities.Pregunta;

import java.util.Set;

public interface QuestionService {

    Pregunta addQuestion(Pregunta pregunta);
    Pregunta updateQuestion(Pregunta pregunta);
    Set<Pregunta> getQuestions();
    Pregunta getQuestion(Long questionId);
    Set<Pregunta> getExamQuestions(Examen examen);
    void deleteQuestion(Long questionId);


}
