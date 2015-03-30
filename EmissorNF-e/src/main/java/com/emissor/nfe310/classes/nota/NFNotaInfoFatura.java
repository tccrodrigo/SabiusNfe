package com.emissor.nfe310.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.emissor.nfe310.classes.NFBase;
import com.fincatto.nfe310.validadores.BigDecimalParser;
import com.fincatto.nfe310.validadores.StringValidador;

public class NFNotaInfoFatura extends NFBase {
    @Element(name = "nFat", required = false)
    private String numeroFatura;

    @Element(name = "vOrig", required = false)
    private String valorOriginalFatura;

    @Element(name = "vDesc", required = false)
    private String valorDesconto;

    @Element(name = "vLiq", required = false)
    private String valorLiquidoFatura;

    public void setNumeroFatura(final String numeroFatura) {
        StringValidador.tamanho60(numeroFatura);
        this.numeroFatura = numeroFatura;
    }

    public void setValorOriginalFatura(final BigDecimal valorOriginalFatura) {
        this.valorOriginalFatura = BigDecimalParser.tamanho15Com2CasasDecimais(valorOriginalFatura);
    }

    public void setValorDesconto(final BigDecimal valorDesconto) {
        this.valorDesconto = BigDecimalParser.tamanho15Com2CasasDecimais(valorDesconto);
    }

    public void setValorLiquidoFatura(final BigDecimal valorLiquidoFatura) {
        this.valorLiquidoFatura = BigDecimalParser.tamanho15Com2CasasDecimais(valorLiquidoFatura);
    }

    public String getValorOriginalFatura() {
        return this.valorOriginalFatura;
    }

    public void setValorOriginalFatura(final String valorOriginalFatura) {
        this.valorOriginalFatura = valorOriginalFatura;
    }

    public String getValorDesconto() {
        return this.valorDesconto;
    }

    public void setValorDesconto(final String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getValorLiquidoFatura() {
        return this.valorLiquidoFatura;
    }

    public void setValorLiquidoFatura(final String valorLiquidoFatura) {
        this.valorLiquidoFatura = valorLiquidoFatura;
    }

    public String getNumeroFatura() {
        return this.numeroFatura;
    }
}