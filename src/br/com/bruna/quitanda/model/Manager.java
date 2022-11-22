package br.com.bruna.quitanda.model;

import br.com.bruna.quitanda.enums.EnumRegisterType;
import br.com.bruna.quitanda.enums.EnumScheduleTime;

public class Manager extends Employee{
    private String login;
    private String password;

    public Manager(String name, String CPF, Address address, String email, String phone, EnumRegisterType register, String registrationNumber, String bankInformation, EnumScheduleTime scheduleTime, String login, String password) {
        super(name, CPF, address, email, phone, register, registrationNumber, bankInformation, scheduleTime);
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +

                super.toString() +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
