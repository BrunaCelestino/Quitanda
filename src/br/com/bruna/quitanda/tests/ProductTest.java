package br.com.bruna.quitanda.tests;
import br.com.bruna.quitanda.enums.EnumProductType;
import br.com.bruna.quitanda.model.Eatable;


public class ProductTest {
    public static void main(String[] args) {

        Eatable product = new Eatable(EnumProductType.FRUIT,
                1.50,
                10.0,
                "banana nanica",
                "banana",
                "23/11/2022");

        System.out.println(product);
    }
}
