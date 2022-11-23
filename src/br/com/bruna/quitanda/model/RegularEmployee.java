package br.com.bruna.quitanda.model;

import br.com.bruna.quitanda.enums.EnumJobPosition;
import br.com.bruna.quitanda.enums.EnumRegisterType;
import br.com.bruna.quitanda.enums.EnumScheduleTime;

public class RegularEmployee extends Employee{
    private EnumJobPosition position;
    private String tagNumber;

    public RegularEmployee(String name, String CPF, Address address, String email, String phone, EnumRegisterType register, String registrationNumber, String bankInformation, EnumScheduleTime scheduleTime, EnumJobPosition position, String tagNumber) {
        super(name, CPF, address, email, phone, register, registrationNumber, bankInformation, scheduleTime);
        this.position = position;
        this.tagNumber = tagNumber;
    }

    @Override
    public String toString() {
        return "Funcionário Regular [" +
                super.toString() +
                ", cargo: " + position +
                ", número do crachá: " + tagNumber + '\'' +
                ']';
    }
}
