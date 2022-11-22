package br.com.bruna.quitanda.model;

import br.com.bruna.quitanda.enums.EnumProductType;

public class Eatable extends Product{
    String expirationDate;

    public Eatable(EnumProductType type, Double grossPrice, Double taxes, String description, String name, String expirationDate) {
        super(type, grossPrice, taxes, description, name);
        this.expirationDate = expirationDate;
    }
}
