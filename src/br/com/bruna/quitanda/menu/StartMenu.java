package br.com.bruna.quitanda.menu;

import java.util.Scanner;


import static br.com.bruna.quitanda.menu.ClientMenu.registerClient;
import static br.com.bruna.quitanda.menu.StaffMenu.firstMenu;

public class StartMenu {
    static Scanner input = new Scanner(System.in);
    public static void startApplication() {
        menu();
    }
    public static void menu() {
        System.out.println("Olá, Bem vindo a loja virtual Quitandinha da Bruna!");
        System.out.println("Por favor, informe qual área você deseja acessar:  ");
        System.out.println("Digite: ");
        System.out.println("|  1 -  CLIENTE        |       2 - FUNCIONÁRIO    |");
        String path = input.next();
        redirectUser(path);



    }

    public static void redirectUser(String path) {
        switch (path){
            case "1":
                System.out.println("Aguarde alguns instantes enquanto redirecionamos para a área dos Clientes...");
                registerClient();
                break;
            case "2":
                System.out.println("Aguarde alguns instantes enquanto redirecionamos para a área dos Funcionários...");
                firstMenu();

            break;
                default:
                System.err.println("Opção inválida! Digite uma opção válida.");
                menu();
                break;
        }

        input.close();
    }


}
