package com.cursomc.cursomc.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Estado implements Serializable {

    private static final long serialVersionUID = -1747548366642928180L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades = new ArrayList<>();

    public Estado() {
    }

    public Estado(String name) {
        this.name = name;
    }
}
