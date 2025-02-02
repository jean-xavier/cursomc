package com.cursomc.cursomc.domain.enums;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Fsísica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private Integer cod;
    private String descricao;

    private TipoCliente(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (TipoCliente tipoCliente : TipoCliente.values() ) {
            if (cod.equals(tipoCliente.getCod())) {
                return tipoCliente;
            }
        }

        throw new IllegalArgumentException("Id [" + cod + "] inválido");
    }
}
