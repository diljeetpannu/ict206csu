
public class methodOverloading {

    public static void main(String[] args) {
        toString(sum());

    }

    public static void toString(int result) {
        System.out.println("--------------------------------------------------");
        System.out.println("Welcome to the best calcultor in the world");
        System.out.println("Result: " + result);
        System.out.println("--------------------------------------------------");
    }

    public static int sum() {
        System.out.println("No parameters passed");
        return 0;
    }

    public static int sum(int a) {
        return a;
    }

    public static double sum(double a) {
        return a;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static double sum(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}
