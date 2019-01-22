package com.cursomc.cursomc.services;

import com.cursomc.cursomc.domain.Cliente;
import com.cursomc.cursomc.repositories.ClienteRepository;
import com.cursomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente find(Long id) {
        Optional<Cliente> cliente = repository.findById(id);

        return cliente.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id :" +
                id + ", Tipo: " + Cliente.class.getName()));
    }

    public List<Cliente> findAll() {
        Optional<List<Cliente>> clientes = Optional.of(repository.findAll());

        return clientes.orElse(null);
    }
}
