package br.com.bruna.quitanda.model;

public class Address {
    private String Street;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    private String zipcode;

    public Address(String street, String number, String neighborhood, String city, String state, String zipcode) {
        Street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }


    @Override
    public String toString() {
        return
                "[ Rua: " + Street + '\'' +
                ", número: " + number + '\'' +
                ", bairro: " + neighborhood + '\'' +
                ", cidade: " + city + '\'' +
                ", estado: " + state + '\'' +
                ", CEP: " + zipcode + '\'' + " ]";
    }
}
