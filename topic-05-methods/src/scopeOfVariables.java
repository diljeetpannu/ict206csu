
public class scopeOfVariables {

    public static void main(String[] args) {
        double cousinAge = 17; // Variable declared in the main method
        System.out.println("Value of cousinAge in main: " + cousinAge);
        driveCar(cousinAge); // Calling the driveCar method from max class
        System.out.println("Value of cousinAge in main after method call: " + cousinAge);

    }

    public static void driveCar(double cousinAge) {
        cousinAge = cousinAge + 3;
        System.out.println("Your friends helper :)");
        driveCar((int) cousinAge);
    }

    public static void driveCar(int cousinAge) {
        if (cousinAge >= 18) {
            System.out.println("You can drive a car because you are " + cousinAge + " years old.");
        } else {
            System.out.println("You cannot drive a car because you are " + cousinAge + " years old.");
        }
    }

}
