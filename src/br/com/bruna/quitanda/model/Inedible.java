package br.com.bruna.quitanda.model;

import br.com.bruna.quitanda.enums.EnumProductType;

public class Inedible extends Product{
    String warranty;

    public Inedible(EnumProductType type, Double grossPrice, Double taxes, String description, String name, String warranty) {
        super(type, grossPrice, taxes, description, name);
        this.warranty = warranty;
    }
}
