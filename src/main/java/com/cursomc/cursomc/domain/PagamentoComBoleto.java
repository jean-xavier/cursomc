package com.cursomc.cursomc.domain;

import com.cursomc.cursomc.domain.enums.EstadoPagamento;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class PagamentoComBoleto extends Pagamento {

    private static final long serialVersionUID = 4266792750982341301L;

    private Date dataVencimento;
    private Date dataPagamento;

    public PagamentoComBoleto() {
    }

    public PagamentoComBoleto(EstadoPagamento estadoPagamento, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(estadoPagamento, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }


}
