package com.sistema.examenes.services;

import com.sistema.examenes.entities.Categoria;

import java.util.Set;

public interface CategoryService {

    Categoria addCategory(Categoria categoria);
    Categoria updateCategory(Categoria categoria);
    Set<Categoria> getCategorys();
    Categoria getCategory(Long categoryId);
    void deleteCategory(Long categoryId);

}
