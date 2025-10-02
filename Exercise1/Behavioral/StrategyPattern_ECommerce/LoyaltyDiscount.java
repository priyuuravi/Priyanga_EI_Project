package Exercise1.Behavioral.StrategyPattern_ECommerce;

public class LoyaltyDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.9; // 10% off
    }
}
