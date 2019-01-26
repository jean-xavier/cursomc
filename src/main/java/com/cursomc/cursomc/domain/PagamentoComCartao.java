package com.cursomc.cursomc.domain;

import com.cursomc.cursomc.domain.enums.EstadoPagamento;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 5228453066040978545L;

    private Integer numeroDeParcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(EstadoPagamento estadoPagamento, Pedido pedido, Integer numeroDeParcelas) {
        super(estadoPagamento, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
