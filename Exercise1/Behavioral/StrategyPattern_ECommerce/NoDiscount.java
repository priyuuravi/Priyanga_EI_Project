package Exercise1.Behavioral.StrategyPattern_ECommerce;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount; // No discount applied
    }
}
