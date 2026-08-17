public class Arrays {
    public static void main(String[] args) {
        int[] studentsMarks = {85, 90, 78, 92, 88, 93};
        printArray(studentsMarks);
        searchAbove90(studentsMarks);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void searchAbove90(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] >= 90) {
               System.out.println("Student " + (i + 1) + " with marks above 90: " + arr[i]);
               count++;
           }
        }
        System.out.println("Number of students with marks above 90: " + count);
    }
}