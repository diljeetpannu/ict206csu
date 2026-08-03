package section01;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        int price;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a price or -1 to quit: ");
        price = scanner.nextInt();
        while (price != -1) {
            System.out.println(count);
            count++;
            System.out.println("Enter a price or -1 to quit: ");
            price = scanner.nextInt();
        }

        System.out.println("You entered " + count + " orders.");
    }
}
