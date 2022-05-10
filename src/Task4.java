import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.print("Enter whole number : ");
        int wholeNumber = readme.nextInt();
        boolean result= wholeNumber%2!=0;

        System.out.println("false, if it is even number and true if it is odd number: " + result);


    }
}
