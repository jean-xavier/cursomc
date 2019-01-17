package com.cursomc.cursomc.services;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Long id) {
        Optional<Categoria> categoria = repository.findById(id);
        return categoria.orElse(null);
    }
}
