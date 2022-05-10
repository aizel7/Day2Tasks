import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.print("Enter whole numbers a, b : ");
        int a = readme.nextInt();
        int b = readme.nextInt();

        System.out.println( "a and b is equal: " + (a==b));
        System.out.println("a is less than 0 and b is greater than 0: " + (a<0 && b>0));
        System.out.println("both of them are greater than 100: " + (a>100 && b>100));



    }
}
