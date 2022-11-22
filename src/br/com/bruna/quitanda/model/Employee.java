package br.com.bruna.quitanda.model;

import br.com.bruna.quitanda.enums.EnumRegisterType;
import br.com.bruna.quitanda.enums.EnumScheduleTime;

public abstract class Employee extends Person{
    private String registrationNumber;
    private String bankInformation;
    private EnumScheduleTime scheduleTime;

    public Employee(String name, String CPF, Address address, String email, String phone, EnumRegisterType register, String registrationNumber, String bankInformation, EnumScheduleTime scheduleTime) {
        super(name, CPF, address, email, phone, register);
        this.registrationNumber = registrationNumber;
        this.bankInformation = bankInformation;
        this.scheduleTime = scheduleTime;
    }


}
