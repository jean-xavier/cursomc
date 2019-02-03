package com.cursomc.cursomc.services;

import com.cursomc.cursomc.domain.Pedido;
import com.cursomc.cursomc.repositories.PedidoRepository;
import com.cursomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido find(Long id) {
        Optional<Pedido> pedido = repository.findById(id);
        return pedido.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: "
                    + id + ", Tipo: " + Pedido.class.getName())
        );
    }

    public List<Pedido> findAll() {

        Optional<List<Pedido>> pedidos = Optional.of(repository.findAll());

        return pedidos.orElse(null);
    }

}
