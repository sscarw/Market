import java.util.Scanner;

public class Main {
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && c != '.') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        double price;
        String productName;
        String priceInput;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        productName = scanner.nextLine();

        do {
            System.out.print("Enter product price: ");
            priceInput = scanner.nextLine();

            if (isNumeric(priceInput)) {
                price = Double.parseDouble(priceInput);

                if (price < 0) {
                    System.out.println("Please enter a positive number again.");
                } else {
                    break;
                }
            } else {
                System.out.println("Please enter a numeric value again.");
            }
        } while (true);

        // Print the result using UTF-8 encoding
        System.out.println("You entered the product \"" + productName + "\" with a price of " + price + " hryvnias.");

        scanner.close();
    }
}
