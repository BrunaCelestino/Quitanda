package br.com.bruna.quitanda.model;

import br.com.bruna.quitanda.enums.EnumRegisterType;

public class Client extends Person {
    private Boolean hasStoreCard;
    private String purchaseInformation;

    public Client(String name, String CPF, Address address, String email, String phone, EnumRegisterType register, Boolean hasStoreCard, String purchaseInformation) {
        super(name, CPF, address, email, phone, register);
        this.hasStoreCard = hasStoreCard;
        this.purchaseInformation = purchaseInformation;
    }
}
