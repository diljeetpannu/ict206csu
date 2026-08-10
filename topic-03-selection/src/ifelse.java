
import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter the student marks:");
        double marks = scanner.nextDouble();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        } else {
            if (marks >= 85) {
                System.out.println("Grade: HD");
            } else if (marks >= 75) {
                System.out.println("Grade: D");
            } else if (marks >= 65) {
                System.out.println("Grade: C");
            } else if (marks >= 50) {
                System.out.println("Grade: P");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}
