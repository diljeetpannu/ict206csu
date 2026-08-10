
import java.util.Scanner;

public class hiFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 5 == 0) {
            System.out.println("Hi Five!");
        }
        scanner.close();
    }
}
