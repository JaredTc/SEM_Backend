package com.sistema.examenes.services.impl;

import com.sistema.examenes.entities.Categoria;
import com.sistema.examenes.repositories.CategoryRepository;
import com.sistema.examenes.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Categoria addCategory(Categoria categoria) {
        return categoryRepository.save(categoria);
    }

    @Override
    public Categoria updateCategory(Categoria categoria) {
        return categoryRepository.save(categoria);
    }

    @Override
    public Set<Categoria> getCategorys() {
        return new LinkedHashSet<>(categoryRepository.findAll());
    }

    @Override
    public Categoria getCategory(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public void deleteCategory(Long categoryId) {
        Categoria categoria = new Categoria();
        categoria.setCategoryId(categoryId);
        categoryRepository.delete(categoria );
    }
}
