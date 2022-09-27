package com.sistema.examenes.services;

import com.sistema.examenes.entities.Examen;

import java.util.Set;

public interface ExamServices {
    Examen addExam(Examen examen);
    Examen updateExam(Examen examen);

    Set<Examen> getExams();
    Examen getExam(Long examId);
    void deleteExam(Long examId);

}
