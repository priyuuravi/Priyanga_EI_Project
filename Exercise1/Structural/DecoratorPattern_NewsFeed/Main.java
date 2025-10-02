package Exercise1.Structural.DecoratorPattern_NewsFeed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewsFeed newsFeed = new BasicNewsFeed();

        System.out.println("Welcome to the News Feed Decorator System!");
        System.out.println("Basic News: " + newsFeed.getNews());

        System.out.println("\nChoose decorators to apply:");
        System.out.println("1. Add Category");
        System.out.println("2. Filter by Keyword");
        System.out.println("3. Display News");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    newsFeed = new CategorizedNewsFeed(newsFeed, category);
                    System.out.println("Category added.");
                    break;
                case 2:
                    System.out.print("Enter keyword to filter: ");
                    String keyword = scanner.nextLine();
                    newsFeed = new FilteredNewsFeed(newsFeed, keyword);
                    System.out.println("Filter added.");
                    break;
                case 3:
                    System.out.println("Current News: " + newsFeed.getNews());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
