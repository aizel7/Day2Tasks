import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.print("Enter whole number : ");
        int wholeNumber = readme.nextInt();
        boolean result= wholeNumber%2==0;

        System.out.println("true, if it is even number and false, if it is odd number: " + result);


    }
}
