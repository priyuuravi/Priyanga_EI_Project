package com.example.discount.strategy;

public class LoyaltyDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90; // 10% off
    }
}
