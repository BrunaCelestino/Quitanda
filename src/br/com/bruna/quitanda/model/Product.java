package br.com.bruna.quitanda.model;

import br.com.bruna.quitanda.enums.EnumProductType;

public abstract class Product {
   private EnumProductType type;
    private Double grossPrice;
    private Double taxes;
    private String description;
    private String name;

    public Product(EnumProductType type, Double grossPrice, Double taxes, String description, String name) {
        this.type = type;
        this.grossPrice = grossPrice;
        this.taxes = taxes;
        this.description = description;
        this.name = name;
    }
}
