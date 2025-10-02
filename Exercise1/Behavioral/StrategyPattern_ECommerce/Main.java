package Exercise1.Behavioral.StrategyPattern_ECommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart(new NoDiscount()); // Default no discount

        System.out.println("Welcome to the E-Commerce Cart System!");
        System.out.println("Add products to your cart. Enter 'done' when finished.");

        while (true) {
            System.out.print("Enter product name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Product product = new Product(name, price, quantity);
            cart.addItem(product);
            System.out.println("Added: " + product);
        }

        if (cart.calculateTotal() == 0) {
            System.out.println("No items in cart. Exiting.");
            scanner.close();
            return;
        }

        System.out.println("\nSelect a discount strategy:");
        System.out.println("1. No Discount");
        System.out.println("2. Festival Discount (20% off)");
        System.out.println("3. Clearance Sale (50% off)");
        System.out.println("4. Loyalty Discount (10% off)");
        System.out.println("5. Custom Percentage Discount");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        DiscountStrategy strategy;
        switch (choice) {
            case 1:
                strategy = new NoDiscount();
                break;
            case 2:
                strategy = new FestivalDiscount();
                break;
            case 3:
                strategy = new ClearanceSaleDiscount();
                break;
            case 4:
                strategy = new LoyaltyDiscount();
                break;
            case 5:
                System.out.print("Enter discount percentage: ");
                double percentage = scanner.nextDouble();
                strategy = new PercentageDiscount(percentage);
                break;
            default:
                System.out.println("Invalid choice. Applying no discount.");
                strategy = new NoDiscount();
        }

        cart.setDiscountStrategy(strategy);

        cart.displayItems();
        double finalAmount = cart.checkout();
        System.out.println("Final amount after discount: $" + finalAmount);

        scanner.close();
    }
}
