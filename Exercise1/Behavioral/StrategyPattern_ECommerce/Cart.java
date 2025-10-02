package Exercise1.Behavioral.StrategyPattern_ECommerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;
    private DiscountStrategy discountStrategy;

    public Cart(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double checkout() {
        double total = calculateTotal();
        return discountStrategy.applyDiscount(total);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void displayItems() {
        System.out.println("Cart Items:");
        for (Product item : items) {
            System.out.println(item);
        }
        System.out.println("Total before discount: $" + calculateTotal());
    }
}
