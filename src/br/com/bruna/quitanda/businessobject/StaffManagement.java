package br.com.bruna.quitanda.businessobject;

import java.util.Objects;
import java.util.Scanner;

import static br.com.bruna.quitanda.menu.ProductMenu.getNextAction;
import static br.com.bruna.quitanda.menu.StaffMenu.firstMenu;
import static br.com.bruna.quitanda.util.BufferUtil.readFile;

public class StaffManagement  {
    static Scanner input = new Scanner(System.in);


    public static void getEmployeesList() {
        System.out.println("-------- Essa área requer permissão nível admin --------");

        System.out.println("Já é Admin?");
        System.err.println("WARNING: Se você não for Admin, será redirecionado para o menu principal.");
        System.out.println("| 1 - Sim    |  2 - Não    |");
        String option = input.next();

        switch (option) {
            case"1":

                    System.out.println("Digite seu usuário");
                    String username = input.next();

                    System.out.println("Digite sua senha");
                    String password = input.next();


                    boolean validateLogin = (Objects.equals(username, "superAdmin") && Objects.equals(password, "senhaForte"));

                    if(validateLogin) {
                        System.out.println("Lista de gerentes:");
                        System.out.println();

                        readFile("src/resources/manager.txt");
                        System.out.println();
                        System.out.println("Lista funcionários:");

                        readFile("src/resources/regularEmployee.txt");
                        System.out.println();
                        getNextAction();
                        break;
                    } else {
                        System.out.println("Usuário ou senha incorretos. Confira suas credenciais e tente novamente!");
                        firstMenu();
                        break;
                    }


            case "2":
                getEmployeesList();
                break;
            default:
                System.out.println("Opção inválida!");
                getEmployeesList();
                break;
            }

    }

    public static void getClientsList() {
        System.out.println("-------- Essa área requer permissão nível admin --------");

        System.out.println("Já é Admin?");
        System.err.println("WARNING: Se você não for Admin, será redirecionado para o menu principal.");
        System.out.println("| 1 - Sim    |  2 - Não    |");
        String option = input.next();

        switch (option) {
            case"1":

                System.out.println("Digite seu usuário");
                String username = input.next();

                System.out.println("Digite sua senha");
                String password = input.next();


                boolean validateLogin = (Objects.equals(username, "superAdmin") && Objects.equals(password, "senhaForte"));

                if(validateLogin) {
                    System.out.println("Lista de Clientes:");
                    System.out.println();

                    readFile("src/resources/client.txt");

                    getNextAction();
                    break;
                } else {
                    System.out.println("Usuário ou senha incorretos. Confira suas credenciais e tente novamente!");
                    firstMenu();
                    break;
                }


            case "2":
                getEmployeesList();
                break;
            default:
                System.out.println("Opção inválida!");
                getEmployeesList();
                break;
        }

    }


}
