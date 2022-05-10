import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = readme.nextInt();
        System.out.print("Enter value b: ");
        int b = readme.nextInt();

        System.out.println("is 10 equal to 10? : "+  (a == b));
        System.out.println("is 10 less than 10? : "+ (a<b));
        System.out.println("is 10 less or equal to 10? ; "+ (a<=b));
        System.out.println("is 10 greater than 10? : "+ (a>b));
        System.out.println(" is 10 greater or equal to 10? "+ (a>=b));



    }
}
