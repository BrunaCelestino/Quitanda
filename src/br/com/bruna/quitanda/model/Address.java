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

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address:" +
                "Street: " + Street + '\'' +
                ", number: " + number + '\'' +
                ", neighborhood: " + neighborhood + '\'' +
                ", city: " + city + '\'' +
                ", state: " + state + '\'' +
                ", zipcode: " + zipcode + '\'';
    }
}
