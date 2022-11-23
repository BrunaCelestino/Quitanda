package br.com.bruna.quitanda.model;

import br.com.bruna.quitanda.enums.EnumProductType;

public abstract class Product {
   private EnumProductType type;
    private Double grossPrice;
    private Double taxes;
    private String description;
    private String name;

    private Double finalValue;

    public Product(EnumProductType type, Double grossPrice, Double taxes, String description, String name) {
        this.type = type;
        this.grossPrice = grossPrice;
        this.taxes = taxes;
        this.description = description;
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "nome: " + name + '\'' +
                ", tipo: " + type +
                ", preço bruto: R$" + grossPrice +
                ", imposto: " + taxes + "%" +
                ", valor líquido: R$" + finalValue +
                ", descrição: " + description + '\'';
    }

    public void setFinalValue(Double finalValue) {
        this.finalValue = finalValue;
    }

    public Double getGrossPrice() {
        return grossPrice;
    }

    public Double getTaxes() {
        return taxes;
    }
}
