package br.com.bruna.quitanda.menu;

import br.com.bruna.quitanda.enums.EnumRegisterType;
import br.com.bruna.quitanda.model.Address;
import br.com.bruna.quitanda.model.Client;
import java.util.Scanner;

import static br.com.bruna.quitanda.repository.ClientRepository.createClient;
import static br.com.bruna.quitanda.util.ValidationUtil.validateCPF;

public class ClientMenu {
    static Scanner input = new Scanner(System.in);

    public static void registerClient() {
        System.out.println("Olá, bem-vindo!");
        System.out.println("Para começar, precisamos realizar seu cadastro.");
        System.out.println("Qual seu primeiro nome?");
        String name = input.next();
        input.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);

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
        EnumRegisterType registerType = EnumRegisterType.CLIENT;
        Boolean hasStoreCard = false;
        input.nextLine();
        System.out.println("Agora vamos cadastrar o endereço!");
        System.out.println("Qual é a sua rua?");
        String street = input.nextLine();
        System.out.println("Qual é seu número?");
        String number = input.next();
        input.nextLine();
        System.out.println("Informe o bairro.");
        String neighborhood = input.nextLine();
        System.out.println("Informe a cidade.");
        String city = input.nextLine();
        System.out.println("Informe o estado.");
        String state =  input.nextLine();
        System.out.println("Informe o CEP.");
        String zipcode = input.next();


        System.out.println("Prontinho! Aguarde alguns instantes enquanto seu cadastro é criado!");
        Address address = new Address(street, number, neighborhood, city, state, zipcode);
        Client client = new Client(name, CPF, address, email, phone, registerType, hasStoreCard);

        createClient(client);


    }

}
