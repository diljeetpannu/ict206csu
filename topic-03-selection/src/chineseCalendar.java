
import java.util.Scanner;

public class chineseCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter year of birth:");
        int year = scanner.nextInt();
        if (year < 0 || year > 2027) {
            System.out.println("Invalid year entered. Please enter a value between 0 and 2026.");
        } else {
            int zodiacIndex = year % 12;
            String zodiacSign = "";
            switch (zodiacIndex) {
                case 0:
                    zodiacSign = "Monkey";
                    break;
                case 1:
                    zodiacSign = "Rooster";
                    break;
                case 2:
                    zodiacSign = "Dog";
                    break;
                case 3:
                    zodiacSign = "Pig";
                    break;
                case 4:
                    zodiacSign = "Rat";
                    break;
                case 5:
                    zodiacSign = "Ox";
                    break;
                case 6:
                    zodiacSign = "Tiger";
                    break;
                case 7:
                    zodiacSign = "Rabbit";
                    break;
                case 8:
                    zodiacSign = "Dragon";
                    break;
                case 9:
                    zodiacSign = "Snake";
                    break;
                case 10:
                    zodiacSign = "Horse";
                    break;
                case 11:
                    zodiacSign = "Sheep";
                    break;
            }
            System.out.println("Your Zodiac Sign is " + zodiacSign);
        }
    }
}
