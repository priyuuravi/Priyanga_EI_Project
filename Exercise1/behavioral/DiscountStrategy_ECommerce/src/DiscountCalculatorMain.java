package Exercise1.behavioral.DiscountStrategy_ECommerce.src;
import com.example.discount.strategy.*;
import util.LoggerUtil;

import java.util.Scanner;

public class DiscountCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoggerUtil.log("Welcome to E-commerce Discount Calculator");

        System.out.print("Enter purchase amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Choose discount type: 1. Festival 2. Clearance 3. Loyalty");
        int choice = scanner.nextInt();

        DiscountStrategy strategy;
        switch (choice) {
            case 1: strategy = new FestivalDiscount(); break;
            case 2: strategy = new ClearanceSaleDiscount(); break;
            case 3: strategy = new LoyaltyDiscount(); break;
            default:
                LoggerUtil.log("Invalid choice, applying no discount.");
                strategy = amt -> amt; // No discount
        }

        double finalPrice = strategy.applyDiscount(amount);
        LoggerUtil.log("Final price after discount = " + finalPrice);
    }
}
