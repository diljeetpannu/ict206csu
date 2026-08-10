
import java.util.Scanner;

public class modular {

    public static void main(String[] args) {

    }

    //method to take inputs
    public static double input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    //method to calclate tax
    public static double calculateTax(double amount, double taxRate) {
        return amount * taxRate;
    }

    //method to display output
    public static void displayOutput(double amount, double taxRate, double taxAmount) {
        System.out.println("Amount: " + amount);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Tax Amount: " + taxAmount);
    }
}
