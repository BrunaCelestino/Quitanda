package br.com.bruna.quitanda.model;
import br.com.bruna.quitanda.enums.EnumRegisterType;

public class Client extends Person {
    private Boolean hasStoreCard;

    public Client(String name, String CPF, Address address, String email, String phone, EnumRegisterType register, Boolean hasStoreCard) {
        super(name, CPF, address, email, phone, register);
        this.hasStoreCard = hasStoreCard;

    }


    public void setHasStoreCard(Boolean hasStoreCard) {
        this.hasStoreCard = hasStoreCard;
    }


    @Override
    public String toString() {
        return "Cliente: [" +
                super.toString() +
                ", possui cartão: " +(hasStoreCard ? "SIM" : "NÃO") +
                ']';
    }
}
