package br.com.bruna.quitanda.model;

import br.com.bruna.quitanda.enums.EnumRegisterType;

public abstract class Person {
    private String name;
    private String CPF;
    private Address address;
    private String email;
    private String phone;
    private EnumRegisterType register;



    public Person(String name, String CPF, Address address, String email, String phone, EnumRegisterType register) {
        this.name = name;
        this.CPF = CPF;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.register = register;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", CPF='" + CPF + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", register=" + register +
                '}';
    }
}
