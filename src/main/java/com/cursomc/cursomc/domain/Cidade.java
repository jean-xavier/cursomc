package com.cursomc.cursomc.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Cidade implements Serializable {

    private static final long serialVersionUID = -3002025927769683832L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    public Cidade() {
    }

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
    }
}
