
import java.util.Scanner;

public class max {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageCousin1 = scanner.nextInt();
        int ageCousin2 = scanner.nextInt();

        int result = max(ageCousin1, ageCousin2);
        driveCar(result);
    }

    private static int max(int i, int j) {
        if (i > j) {
            // System.out.println(i + " is greater than " + j);
            return i;
        } else {
            // System.out.println(j + " is greater than " + i);
            return j;
        }
    }

    public static void driveCar(int age) {
        age = 20;
        if (age >= 18) {
            System.out.println("You can drive a car because you are " + age + " years old.");
        } else {
            System.out.println("You cannot drive a car because you are " + age + " years old.");
        }
    }
}
