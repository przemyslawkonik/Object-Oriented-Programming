package example1;

import example1.products.Product;

import java.util.ArrayList;
import java.util.List;


public class Basket {
    private List<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean isEmpty() {
        if(products.isEmpty())
            return true;
        else
            return false;
    }

}
