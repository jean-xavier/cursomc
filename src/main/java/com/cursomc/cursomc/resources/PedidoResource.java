package com.cursomc.cursomc.resources;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.domain.Pedido;
import com.cursomc.cursomc.services.CategoriaService;
import com.cursomc.cursomc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService service;

    @GetMapping
    public ResponseEntity<?> listar() {
        List<Pedido> pedidos = service.findAll();

        return ResponseEntity.ok().body(pedidos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        Pedido pedido = service.find(id);

        return ResponseEntity.ok().body(pedido);
    }

}
