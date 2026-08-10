
import java.util.Scanner;

public class counter {

    public static void main(String[] args) {
        whileLoopExample();
        doWhileLoopExample();
    }

    static void whileLoopExample() {
        int housesCleaned = 0;

        //declare scanner and ask user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to clean the next house (1) or quit (0)? ");
        int answer = scanner.nextInt();

        while (answer == 1) {
            housesCleaned++;
            System.out.println("House " + housesCleaned + " is cleaned.");
            System.out.print("Do you want to clean the next house (1) or quit (0)? ");
            answer = scanner.nextInt();
        }
        System.out.println("Total houses cleaned: " + housesCleaned);
    }

    static void doWhileLoopExample() {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int housesCleaned = 0;
        do {
            System.out.print("Do you want to clean the next house (1) or quit (0)? ");
            answer = scanner.nextInt();
            housesCleaned++;
            System.out.println("House " + housesCleaned + " is cleaned.");

        } while (answer == 1);
        System.out.println("Total houses cleaned: " + housesCleaned);
    }
}
