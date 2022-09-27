package com.sistema.examenes.services.impl;

import com.sistema.examenes.entities.Examen;
import com.sistema.examenes.repositories.ExamRepository;
import com.sistema.examenes.services.ExamServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ExamServiceImpl implements ExamServices {


    @Autowired
    private ExamRepository examRepository;

    @Override
    public Examen addExam(Examen examen) {
        return examRepository.save(examen);
    }

    @Override
    public Examen updateExam(Examen examen) {
        return examRepository.save(examen);
    }

    @Override
    public Set<Examen> getExams() {
        return new LinkedHashSet<>(examRepository.findAll());
    }


    @Override
    public Examen getExam(Long examId) {
        return  examRepository.findById(examId).get();
    }

    @Override
    public void deleteExam(Long examId) {
        Examen exam = new Examen();
        exam.setExamenId(examId);
        examRepository.delete(exam);

    }
}
