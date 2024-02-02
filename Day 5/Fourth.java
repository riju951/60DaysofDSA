import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of of which you need multiplication");
        int num1 = sc.nextInt();
        for ( int i = 1; i<=10;i++)
        System.out.println(num1 + " x " + i + " = " + num1*i);
    }
}
