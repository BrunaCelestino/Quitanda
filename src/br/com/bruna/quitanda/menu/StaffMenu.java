package br.com.bruna.quitanda.menu;

import java.util.Scanner;

import static br.com.bruna.quitanda.businessobject.StaffManagement.getClientsList;
import static br.com.bruna.quitanda.businessobject.StaffManagement.getEmployeesList;
import static br.com.bruna.quitanda.menu.ProductMenu.registerProduct;
import static br.com.bruna.quitanda.repository.ManagerRepository.createManager;
import static br.com.bruna.quitanda.repository.ProductRepository.getInventory;
import static br.com.bruna.quitanda.repository.RegularEmployeeRepository.createRegularEmployee;
import static br.com.bruna.quitanda.util.GeneralUtil.finishSystem;

public class StaffMenu {
    static Scanner input = new Scanner(System.in);

    public static void firstMenu() {
        System.out.println("Olá, Nos diga, o que gostaria de fazer hoje? ");
        System.out.println("Selecione a opção desejada:");
        System.out.println();
        System.out.println("| 1 - Cadastrar novo funcionário  | ");
        System.out.println("| 2 - Cadastrar novo produto      | ");
        System.out.println("| 3 - Obter estoque               | ");
        System.out.println("| 4 - Obter lista de funcionários | ");
        System.out.println("| 5 - Obter lista de clientes     | ");
        System.out.println("| 6 - Sair                        | ");

        String option = input.next();
        getMenuOption(option);
    }

    private static void getMenuOption(String option) {
        switch (option) {
            case "1":
                System.out.println("Redirecionando para a área de cadastro...");
                registerStaff();
                break;
            case "2":
                System.out.println("Redirecionando para a área de produtos...");
                registerProduct();
                break;
            case "3":
                System.out.println("Aguarde enquanto buscamos as informações sobre estoque...");
                getInventory();
                break;
            case "4":
                System.out.println("Redirecionando para a área da gerência...");
                getEmployeesList();
                break;
            case "5":
                System.out.println("Redirecionando para a área da gerência...");
                getClientsList();
                break;
            case "6":
                finishSystem();
                break;
            default:
                System.err.println("Opção inválida. Escolha uma opção válida!");
                firstMenu();
                break;
        }



    }

    public static void registerStaff() {
        System.out.println("Bem vindo! informe o tipo de funcionário a ser cadastrado:");

        System.out.println("| 1 - Funcionário regular  | ");
        System.out.println("| 2 - Gerente              | ");
        String option = input.next();

        switch (option) {
            case "1":
                System.out.println("Cadastro de funcionário Regular:");
                createRegularEmployee();

                break;
            case "2":
                System.out.println("Cadastro de gerente:");
                createManager();
                break;

            default:
                System.err.println("Opção inválida. Escolha uma opção válida!");
                registerStaff();
                break;
        }

        input.close();

    }
}
