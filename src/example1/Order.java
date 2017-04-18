package example1;

public class Order {
    private Basket basket;

    public Order() {}

    public void addBasket(Basket basket) {
        this.basket = basket;
    }

    public void submitOrder() {
        if(basket == null)
            System.out.println("Nie dodano koszyka");
        else if(basket.isEmpty())
            System.out.println("Koszyk jest pusty");
        else
            System.out.println("Zamówienie zrealizowane");
    }

}
