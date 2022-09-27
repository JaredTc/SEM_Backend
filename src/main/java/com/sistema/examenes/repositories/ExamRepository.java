package com.sistema.examenes.repositories;


import com.sistema.examenes.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Examen,Long> {
}
