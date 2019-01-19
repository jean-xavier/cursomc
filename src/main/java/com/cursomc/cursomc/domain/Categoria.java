package com.cursomc.cursomc.domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Categoria implements Serializable {

    private static final long serialVersionUID = 5162337763994022974L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @JsonManagedReference
    @ManyToMany(mappedBy = "categorias")
    private List<Produto> produtos = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

}
