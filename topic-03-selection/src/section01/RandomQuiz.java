
import java.util.Scanner;

public class RandomQuiz {

    public static void main(String[] args) {
        // Generate two random numbers between 1 and 10
        int number1 = (int) (Math.random() * 10) + 1; // generates a random number between 1 and 10
        System.out.println("First Number is : " + number1);
        int number2 = (int) (Math.random() * 10) + 1; // generates a random number between 1 and 10
        System.out.println("Second Number is : " + number2);

        // Calculate the sum of the two numbers and hide it from the user
        int sum = number1 + number2;

        // Prompt the user to enter the sum of the two numbers if they are correct prompt them
        System.out.print("Please enter the sum of the two numbers: :");
        Scanner input = new Scanner(System.in);
        int userAnswer = input.nextInt();
        if (userAnswer == sum) {
            System.out.println("Congratulations! Your answer is correct.");
        } else {
            System.out.println("Sorry, your answer is incorrect. The correct answer is: " + sum);
        }
    }
}
