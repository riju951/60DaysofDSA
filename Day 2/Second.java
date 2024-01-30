import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input side of a square : ");
        int a = sc.nextInt();
        int b = a*a;
        System.out.println("The area of the square is " + b);
    }
}
