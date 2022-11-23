package br.com.bruna.quitanda.businessobject;
import br.com.bruna.quitanda.interfaces.ProductValue;
import br.com.bruna.quitanda.model.Product;

public class ProductManagement implements ProductValue {


    @Override
    public Product calculateFinalValue(Product product) {
        Double finalValue = product.getGrossPrice() + (product.getGrossPrice() * (product.getTaxes()/100));
        product.setFinalValue(finalValue);
        return product;
    }
}
