package section01;

public class TutionFeeCalculator {

    public static void main(String[] args) {
        double tutionFee = 10000;
        int year = 0;
        while (tutionFee <= 20000) {
            year++;
            if (year % 5 == 0) {
                System.out.println("The increase is halted this year");
                continue;
            } else {
                tutionFee += (tutionFee * (7.0 / 100));
            }
            System.out.println("After " + year + " years, the tution fee is " + tutionFee);
        }
    }
}
