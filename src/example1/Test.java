package example1;

import example1.products.*;


public class Test {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.getBasket().addProduct(new Apple());
        customer.getBasket().addProduct(new Lemon());
        customer.getBasket().addProduct(new Tomato());
        customer.addBasketToOrder();
        customer.getOrder().submitOrder();
    }
}
