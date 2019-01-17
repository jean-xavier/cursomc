package com.cursomc.cursomc.resources;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<Categoria> listar() {

        Categoria cat1 = new Categoria();
        cat1.setId(1L);
        cat1.setNome("Informática");

        Categoria cat2 = new Categoria();
        cat2.setId(2L);
        cat2.setNome("Escritório");

        List<Categoria> categorias = new ArrayList<>();
        categorias.add(cat1);
        categorias.add(cat2);

        return categorias;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        Categoria categoria = service.buscar(id);

        return ResponseEntity.ok().body(categoria);
    }

}
