package br.com.bruna.quitanda.repository;

import br.com.bruna.quitanda.enums.EnumJobPosition;
import br.com.bruna.quitanda.enums.EnumRegisterType;
import br.com.bruna.quitanda.enums.EnumScheduleTime;
import br.com.bruna.quitanda.model.Address;
import br.com.bruna.quitanda.model.RegularEmployee;
import br.com.bruna.quitanda.util.BufferUtil;

import java.util.Scanner;

import static br.com.bruna.quitanda.menu.StaffMenu.firstMenu;
import static br.com.bruna.quitanda.util.GeneralUtil.finishSystem;
import static br.com.bruna.quitanda.util.GenerateRandoms.generateRandomNumber;
import static br.com.bruna.quitanda.util.ValidationUtil.validateCPF;

public class RegularEmployeeRepository {
    static Scanner input = new Scanner(System.in);
    public static void createRegularEmployee() {

        System.out.println("Qual seu nome completo?");
        String name = input.nextLine();


        System.out.println(name + ", informe seu CPF: (formato: xxx.xxx.xxx-xx)");
        String CPF = input.next();

        while (!validateCPF(CPF)) {
            System.out.println("CPF inválido, insira um CPF válido");
            System.out.println(name + ", informe seu CPF: (formato: xxx.xxx.xxx-xx)");
            CPF = input.next();
            if(validateCPF(CPF)) {
                break;
            }
        }

        System.out.println(name + ", informe seu e-mail:");
        String email = input.next();

        while(!email.contains("@") || !email.contains(".")) {
            System.out.println("E-mail inválido, insira um e-mail válido");
            System.out.println(name + ", informe seu e-mail:");
            email = input.next();

            if(email.contains("@") && email.contains(".")) {
                break;
            }

        }
        System.out.println(name + ", informe seu telefone:");
        String phone = input.next();
        input.nextLine();
        System.out.println(name + ", informe suas informações bancárias:");
        String bankInformation =     input.nextLine();


        System.out.println("Agora vamos cadastrar o endereço!");
        System.out.println("Qual é a sua rua?");
        String street = input.nextLine();
        System.out.println("Qual é seu número?");
        String number = input.next();
        input.nextLine();
        System.out.println("Informe o bairro.");
        String neighborhood = input.nextLine();
        System.out.println("Informe a cidade.");
        String city = input.nextLine();;
        System.out.println("Informe o estado.");
        String state =  input.nextLine();
        System.out.println("Informe o CEP.");
        String zipcode = input.next();



        EnumRegisterType registerType = EnumRegisterType.EMPLOYEE;
        String registrationNumber = String.valueOf(generateRandomNumber(999));

        EnumScheduleTime scheduleTime = scheduleTime();
        EnumJobPosition jobPosition = jobPosition();
        String tagNumber = String.valueOf(generateRandomNumber(9999));

        System.out.println("Prontinho! Aguarde alguns instantes enquanto seu cadastro é criado!");
        Address address = new Address(street, number, neighborhood, city, state, zipcode);
        RegularEmployee regularEmployee = new RegularEmployee(name, CPF, address, email, phone, registerType, registrationNumber, bankInformation,scheduleTime, jobPosition, tagNumber);




        BufferUtil<RegularEmployee> buffer = new BufferUtil<RegularEmployee>();
        buffer.writeFile(regularEmployee, "regularEmployee");
        System.out.println();
        System.out.println(regularEmployee);

        System.out.println("Deseja realizar outra ação?");
        System.out.println("Digite: ");
        System.out.println("|  1 -  SIM        |       2 - NÃO    |");
        String option = input.next();
        switch (option) {
            case "1":

                firstMenu();

                break;
            case "2":
                finishSystem();
                break;

            default:
                System.err.println("Opção inválida. ");
                finishSystem();
                break;
        }
    }

    private static EnumScheduleTime scheduleTime() {

        System.out.println("Informe seu horário de trabalho:");
        System.out.println();
        System.out.println("| 1 - 9h00 as 17h00   | ");
        System.out.println("| 2 - 8h00 as 16h00   | ");
        System.out.println("| 3 - 11h00 as 20h00  | ");
        System.out.println("| 4 - 12h00 as 21h00  | ");


        System.out.println("Selecione a opção desejada:");
        String option = input.next();


        switch (option) {
            case "1":
                return  EnumScheduleTime.NINE_TO_FIVE;
            case "2":
                return  EnumScheduleTime.EIGHT_TO_FOUR;
            case "3":
                return EnumScheduleTime.ELEVEN_TO_EIGHT;
            case "4":
                return  EnumScheduleTime.NOON_TO_NINE;

            default:
                System.out.println("Opção inválida.");
                return scheduleTime();
        }




    }

    private static EnumJobPosition jobPosition() {

        System.out.println("Informe seu horário de trabalho:");
        System.out.println();
        System.out.println("| 1 - Caixa   | ");
        System.out.println("| 2 - Manutenção   | ");
        System.out.println("| 3 - Limpeza  | ");
        System.out.println("| 4 - Hortfruit  | ");


        System.out.println("Selecione a opção desejada:");
        String option = input.next();


        switch (option) {
            case "1":
                return  EnumJobPosition.REGISTER;
            case "2":
                return  EnumJobPosition.MAINTENCE;
            case "3":
                return EnumJobPosition.CLEANING;
            case "4":
                return  EnumJobPosition.HORTFRUIT;

            default:
                System.out.println("Opção inválida.");
                return jobPosition();
        }
    }
}
