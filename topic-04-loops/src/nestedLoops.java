
public class nestedLoops {

    public static void main(String[] args) {
        int rows = 45;
        int columns = 11;
        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {
                System.out.println("Your seat is  " + row + " -- " + column + ". ");
            }
            System.out.println();
        }
    }
}
