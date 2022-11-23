package br.com.bruna.quitanda.repository;

import br.com.bruna.quitanda.businessobject.ProductManagement;
import br.com.bruna.quitanda.enums.EnumProductType;
import br.com.bruna.quitanda.model.Eatable;
import br.com.bruna.quitanda.model.Inedible;
import br.com.bruna.quitanda.util.BufferUtil;


import java.util.Scanner;

import static br.com.bruna.quitanda.menu.ProductMenu.getNextAction;
import static br.com.bruna.quitanda.util.BufferUtil.readFile;


public class ProductRepository{

    static Scanner input = new Scanner(System.in);
    public static Eatable createEdibleProduct(EnumProductType type, Double grossPrice, Double taxes, String description, String name, String expirationDate) {
        Eatable eatable = new Eatable(type, grossPrice, taxes, description, name, expirationDate);
        ProductManagement productManagement = new ProductManagement();
        productManagement.calculateFinalValue(eatable);
        BufferUtil<Eatable> buffer = new BufferUtil<Eatable>();
        buffer.writeFile(eatable, "product");
        System.out.println();
        System.out.println(eatable);
        return eatable;

    }

    public static Inedible createInedibleProduct(EnumProductType type, Double grossPrice, Double taxes, String description, String name, String warranty) {
        Inedible inedible = new Inedible(type, grossPrice, taxes, description, name, warranty);
        ProductManagement productManagement = new ProductManagement();
        productManagement.calculateFinalValue(inedible);
        BufferUtil<Inedible> buffer = new BufferUtil<Inedible>();
        buffer.writeFile(inedible, "product");
        System.out.println();
        System.out.println(inedible);
        return inedible;
    }

    public static void getInventory() {
        readFile("src/resources/product.txt");
        getNextAction();

    }






}
