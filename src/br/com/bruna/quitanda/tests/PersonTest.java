package br.com.bruna.quitanda.tests;
import br.com.bruna.quitanda.enums.EnumRegisterType;
import br.com.bruna.quitanda.enums.EnumScheduleTime;
import br.com.bruna.quitanda.model.Address;
import br.com.bruna.quitanda.model.Manager;

public class PersonTest {
    public static void main(String[] args) {
        Address managerAddress = new Address("Rua Avelino José Machado",
                "97",
                "Jardim Colinas",
                "Jacareí",
                "São Paulo",
                "12319-060");
        Manager robson = new Manager("Robson",
                "392.800.538-33",
                managerAddress,
                "robsondalaranja@gmail.com",
                "(12) 98892-4146",
                EnumRegisterType.EMPLOYEE,
                "1",
                "conta 12342-02",
                EnumScheduleTime.EIGHT_TO_FOUR,
                "laranjaRob",
                "12345678");

        System.out.println(robson);

    }
}
