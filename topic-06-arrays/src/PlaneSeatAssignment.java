import java.util.Scanner;
public class PlaneSeatAssignment {

    static int[] seats = {0,0,0,0,0};
    static int emptySeats = seats.length;
    public static void main(String[] args) {
        printArray(PlaneSeatAssignment.seats);

        Scanner askingScanner = new Scanner(System.in);
        do{
            System.out.println("Enter the seat number you want to check (1-5): ");
            int seatNumber = askingScanner.nextInt();

            if(seatAvailable(PlaneSeatAssignment.seats, seatNumber)){
                System.out.println("Seat " + seatNumber + " is available.");
                System.out.println("Enter your passenger number to assign this seat to you ");
                int passengerNumber = askingScanner.nextInt();
                assignSeat(PlaneSeatAssignment.seats, seatNumber, passengerNumber);
                System.out.println("Thank you for traveling with us. Your seat has been assigned.");
                printArray(PlaneSeatAssignment.seats);
            }else{
                System.out.println("Seat " + seatNumber + " is not available.");
                System.out.println("Do you like to check another seat?");
            }
        }while(boardingTime(PlaneSeatAssignment.seats));
    }

    public static void assignSeat(int[] arr, int seatNumber, int passengerNumber) {
        arr[seatNumber - 1] = passengerNumber;
    }

    public static boolean boardingTime(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                emptySeats--;
            }
        }
        System.out.println("Empty seats: " + emptySeats);
        if (emptySeats == 0) {
            System.out.println("All seats are assigned. Boarding time.");
            return false;
        } else {
            return true;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static boolean seatAvailable(int[] arr, int seatNumber) {
        boolean isAvailable = false;
        if (arr[seatNumber - 1] == 0) {
            isAvailable = true;
        } else {
            isAvailable = false;
        }
        return isAvailable;
    }


}
