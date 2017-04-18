package example1;

public class Customer {
    private Order order;
    private Basket basket;

    public Customer() {
        basket = new Basket();
        order = new Order();
    }

    public void addBasketToOrder() {
        order.addBasket(basket);
    }

    public Order getOrder() {
        return order;
    }

    public Basket getBasket() {
        return basket;
    }

}
