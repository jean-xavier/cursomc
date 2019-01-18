package com.cursomc.cursomc.services;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.repositories.CategoriaRepository;
import com.cursomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria find(Long id) {
        Optional<Categoria> categoria = repository.findById(id);
        return categoria.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: "
                    + id + ", Tipo: " + Categoria.class.getName())
        );
    }

    public List<Categoria> findAll() {

        Optional<List<Categoria>> categorias = Optional.of(repository.findAll());

        return categorias.orElse(null);
    }

}
