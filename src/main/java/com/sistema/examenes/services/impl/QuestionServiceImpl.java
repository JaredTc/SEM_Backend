package com.sistema.examenes.services.impl;

import com.sistema.examenes.entities.Examen;
import com.sistema.examenes.entities.Pregunta;
import com.sistema.examenes.repositories.PreguntaRepository;
import com.sistema.examenes.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public Pregunta addQuestion(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public Pregunta updateQuestion(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public Set<Pregunta> getQuestions() {
        return (Set<Pregunta>) preguntaRepository.findAll();
    }

    @Override
    public Pregunta getQuestion(Long questionId) {
        return preguntaRepository.getById(questionId);
    }

    @Override
    public Set<Pregunta> getExamQuestions(Examen examen) {
        return preguntaRepository.findByExam(examen);
    }

    @Override
    public void deleteQuestion(Long questionId) {
        Pregunta pregunta = new Pregunta();
        pregunta.setIdQuestion(questionId);
        preguntaRepository.delete(pregunta);

    }
}
