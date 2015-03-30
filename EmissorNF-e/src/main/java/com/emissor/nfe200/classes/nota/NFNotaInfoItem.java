package com.emissor.nfe200.classes.nota;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.emissor.nfe200.classes.NFBase;
import com.emissor.nfe200.validadores.IntegerValidador;
import com.emissor.nfe200.validadores.StringValidador;

public class NFNotaInfoItem extends NFBase {

    @Attribute(name = "nItem", required = true)
    private Integer numeroItem;

    @Element(name = "prod", required = true)
    private NFNotaInfoItemProduto produto;

    @Element(name = "imposto", required = true)
    private NFNotaInfoItemImposto imposto;

    @Element(name = "infAdProd", required = false)
    private String informacoesAdicionais;

    public void setNumeroItem(final Integer numeroItem) {
        IntegerValidador.tamanho3maximo990(numeroItem);
        this.numeroItem = numeroItem;
    }

    public void setInformacoesAdicionais(final String informacoesAdicionais) {
        StringValidador.tamanho500(informacoesAdicionais);
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public void setProduto(final NFNotaInfoItemProduto produto) {
        this.produto = produto;
    }

    public void setImposto(final NFNotaInfoItemImposto imposto) {
        this.imposto = imposto;
    }

    public Integer getNumeroItem() {
        return this.numeroItem;
    }

    public NFNotaInfoItemProduto getProduto() {
        return this.produto;
    }

    public NFNotaInfoItemImposto getImposto() {
        return this.imposto;
    }

    public String getInformacoesAdicionais() {
        return this.informacoesAdicionais;
    }
}