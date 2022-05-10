import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.print("Enter b1 : ");
        boolean b1 = readme.nextBoolean();
        System.out.print("Enter b2: ");
        boolean b2 = readme.nextBoolean();

        System.out.println( "Is b1 and b2 equal? : "+  (b1==b2));

    }
}
