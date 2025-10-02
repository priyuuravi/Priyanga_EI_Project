package Exercise1.Behavioral.StrategyPattern_ECommerce;

public class FestivalDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.8; // 20% off
    }
}
