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
    public ResponseEntity<?> listar() {
        List<Categoria> categorias = service.findAll();

        return ResponseEntity.ok().body(categorias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        Categoria categoria = service.find(id);

        return ResponseEntity.ok().body(categoria);
    }

}
