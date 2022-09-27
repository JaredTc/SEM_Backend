package com.sistema.examenes.repositories;


import com.sistema.examenes.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categoria,Long> {
}
