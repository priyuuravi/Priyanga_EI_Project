package com.example.discount.strategy;

public class ClearanceSaleDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.50; // 50% off
    }
}
