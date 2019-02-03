package com.cursomc.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = -6913457451928243190L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "PRODUTO_CATEGORIA",
            joinColumns = @JoinColumn(name = "produto_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private List<Categoria> categorias = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "id.produto")
    private Set<ItemPedido> itens = new HashSet<>();


    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @JsonIgnore
    public List<Pedido> getPedidos() {
        List<Pedido> pedidos = new ArrayList<>();

        for (ItemPedido pedido : itens ) {
            pedidos.add(pedido.getPedido());
        }

        return pedidos;
    }
}
