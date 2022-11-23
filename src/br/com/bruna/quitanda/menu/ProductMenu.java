package br.com.bruna.quitanda.menu;
import br.com.bruna.quitanda.enums.EnumProductType;

import java.util.Scanner;
import static br.com.bruna.quitanda.menu.StaffMenu.firstMenu;
import static br.com.bruna.quitanda.repository.ProductRepository.createEdibleProduct;
import static br.com.bruna.quitanda.repository.ProductRepository.createInedibleProduct;
import static br.com.bruna.quitanda.util.GeneralUtil.finishSystem;
import static java.lang.Double.parseDouble;

public class ProductMenu{

    static Scanner input = new Scanner(System.in);
    public static void registerProduct() {
        System.out.println("Informe o tipo de produto que você irá registrar");
        System.out.println("| 1 - Alimento   |  2 - Outro");
        String option = input.next();

        switch (option) {
            case "1":
                getEatableInfo();
break;
            case "2":
                getInedibleInfo();
                break;
            default:
                System.out.println("Insira uma opção válida");
                registerProduct();
                break;
        }

        getNextAction();
    }

        public static void getEatableInfo() {
            EnumProductType productType = productType();
            System.out.println();
            input.nextLine();
            System.out.println("Informe o nome:");
            String name = input.nextLine();
            System.out.println("Insira o valor bruto:");
            String grossValue = input.next();
            input.nextLine();
            Double formatedGrossValue = parseDouble(grossValue.replace(",", "."));
            System.out.println("Insira o imposto:");
            String taxes = input.next();
            input.nextLine();
            Double formatedTaxes = parseDouble(taxes.replace(",", "."));
            System.out.println("Insira a descrição");
            String description =  input.nextLine();

            System.out.println("Insira a data de vencimento");
            String expirationDate = input.next();

            createEdibleProduct(productType, formatedGrossValue, formatedTaxes, description, name, expirationDate);


        }

    public static void getInedibleInfo() {
        System.out.println();
        input.nextLine();
        System.out.println("Informe o nome:");
        String name = input.nextLine();
        System.out.println("Insira o valor bruto:");
        String grossValue = input.next();
        input.nextLine();
        Double formatedGrossValue = parseDouble(grossValue.replace(",", "."));
        System.out.println("Insira o imposto:");
        String taxes = input.next();
        input.nextLine();
        Double formatedTaxes = parseDouble(taxes.replace(",", "."));
        System.out.println("Insira a descrição");
        String description =  input.nextLine();
        System.out.println("Informe o tempo de garantia:");
        String warranty = input.nextLine();

        createInedibleProduct(EnumProductType.OTHER, formatedGrossValue, formatedTaxes, description, name, warranty);

    }

    private static EnumProductType productType() {

        System.out.println("Escolha o tipo do produto:");
        System.out.println();
        System.out.println("| 1 - Vegetal    | ");
        System.out.println("| 2 - Fruta      | ");
        System.out.println("| 3 - Laticínio  | ");
        System.out.println("| 4 - Ovos       | ");
        System.out.println("| 5 - Outro      | ");


        System.out.println("Selecione a opção desejada:");
        String option = input.next();


        switch (option) {
            case "1":
                return EnumProductType.VEGETABLE;
            case "2":
                return EnumProductType.FRUIT;
            case "3":
                return EnumProductType.DAIRY;
            case "4":
                return EnumProductType.EGG;
            case "5":
                return EnumProductType.OTHER;
            default:
                System.out.println("Opção inválida.");
                return productType();
        }

    }
        public static void getNextAction() {
            System.out.println("Deseja realizar outra ação?");
            System.out.println("Digite: ");
            System.out.println("|  1 -  SIM        |       2 - NÃO    |");
            String action = input.next();
            switch (action) {
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
}
