package com.emissor.nfe310.classes.cadastro;

public enum NFIndicadorContribuinteNFe {

    NAO_CREDENCIADO_PARA_EMISSAO_NFE(0),
    CREDENCIADO(1),
    CREDENCIADO_COM_OBRIGATORIEDADE_PARA_TODAS_OPERACOES(2),
    CREDENCIADO_COM_OBRIGATORIEDADE_PARCIAL(3),
    SEFAZ_NAO_FORNECE_ESSA_INFO(4);

    private int codigo;

    private NFIndicadorContribuinteNFe(final int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public static NFIndicadorContribuinteNFe valueOfCodigo(final int codigo) {
        for (final NFIndicadorContribuinteNFe indicador : NFIndicadorContribuinteNFe.values()) {
            if (indicador.getCodigo() == codigo) {
                return indicador;
            }
        }
        throw new IllegalStateException(String.format("Nao existe o codigo %s", codigo));
    }
}