package Exercise1.Behavioral.StrategyPattern_ECommerce;

public class ClearanceSaleDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.5; // 50% off
    }
}
