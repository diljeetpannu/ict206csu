
import java.util.Scanner;

public class foodDelivery {

    static double totalCost = 0;
    static Scanner scannerFood = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the ITC206 Cafe");

        totalCost = totalCost + foodItemOptions();
        printOrder();

        totalCost = totalCost + drinkItemOrder();
        printOrder();

        totalCost = totalCost + deliveryOption();
        printOrder();

    }

    private static void printOrder() {
        System.out.println("===========Total Bill============");
        System.out.print("Your Current total is " + totalCost);
        System.out.println("=================================");
    }

    private static double deliveryOption() {
        double cost;
        System.out.println("===========Delivery Options============");
        System.out.println("1 Dine in - $0.00");
        System.out.println("2 Collect - $0.50");
        System.out.println("3 Deliver - $5.00");
        System.out.print("Please select one of the items: ");
        int deliveryItem = scannerFood.nextInt();
        if (deliveryItem > 0 && deliveryItem < 4) {
            if (deliveryItem == 1) {
                cost = cost + 0;
            }
            if (deliveryItem == 2) {
                cost = cost + 0.5;
            }
            if (deliveryItem == 1) {
                cost = cost + 5.00;
            }
        }
        retrn cost;
    }

    private static double foodItemOptions() {
        double cost = 0;
        System.out.println("===========MENU============");
        System.out.println("1 Chicken Burger - $10.00");
        System.out.println("2 Veggie Burger - $5.00");
        System.out.println("3 Fries - $2.50");
        System.out.println("4 Salad - $4.50");

        System.out.println("===========MENU============");
        System.out.print("Please select one of the items: ");
        int foodItem = scannerFood.nextInt();

        switch (foodItem) {
            case 1:
                cost = cost + 10;
                break;
            case 2:
                cost = cost + 5;
                break;
            case 3:
                cost = cost + 2.5;
                break;
            case 4:
                cost = cost + 4.5;
                break;
            default:
                System.err.println("Incorrect option");
                ;
        }
        return cost;
    }

    private static double drinkItemOrder() {
        double cost = 0;
        System.out.println("===========Drinks MENU============");
        System.out.println("1 No Drinks - $0.00");
        System.out.println("2 Plain Water - $2.50");
        System.out.println("3 Cola - $5.00");
        System.out.print("Please select one of the items: ");
        int drinkItem = scannerFood.nextInt();
        if (drinkItem > 0 && drinkItem < 4) {
            if (drinkItem == 1) {
                cost = cost + 0;
            }
            if (drinkItem == 2) {
                cost = cost + 2.5;
            }
            if (drinkItem == 1) {
                cost = cost + 5;
            }
        }
        return cost;
    }
}
