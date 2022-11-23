package br.com.bruna.quitanda.repository;

import br.com.bruna.quitanda.model.Client;
import br.com.bruna.quitanda.util.BufferUtil;
import java.util.Scanner;
import static br.com.bruna.quitanda.util.GeneralUtil.finishSystem;

public class ClientRepository {
    static Scanner input = new Scanner(System.in);

    public static void createClient(Client client) {
        System.out.println("Deseja adquirir um cartão da nossa loja?");
        System.out.println("Digite: ");
        System.out.println("|  1 -  SIM        |       2 - NÃO    |");
        String wantsCard = input.next();

        while (!setStoreCard(client, wantsCard)) {
            System.out.println("Opção inválida, insira uma opção válida");
            System.out.println("Digite: ");
            System.out.println("|  1 -  SIM        |       2 - NÃO    |");
            wantsCard = input.next();
            if (setStoreCard(client, wantsCard)) {
                break;
            }
        }

                BufferUtil<Client> buffer = new BufferUtil<Client>();
                buffer.writeFile(client, "client");
                System.out.println();
                System.out.println(client);
                finishSystem();


    }

    private static boolean setStoreCard(Client client, String option) {
        switch (option) {
            case "1":
                client.setHasStoreCard(true);
                System.out.println("Cartão adquirido com sucesso!");
                return true;

            case "2":
                client.setHasStoreCard(false);
                System.out.println("Tudo bem, vamos prosseguir!");
                return true;

            default:
                return false;
        }
    }
}
