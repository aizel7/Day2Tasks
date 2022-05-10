import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.print("Enter boolean value : ");
        boolean a = readme.nextBoolean();


        System.out.println( "Opposite of " +  a +" is " + !a);


    }
}
