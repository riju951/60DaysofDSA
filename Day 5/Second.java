import java.util.Scanner;

public class Second{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length");
        int a = sc.nextInt();
        int b = 0;
        int c =0;
        System.out.println("Enter the numbers: ");
        for ( int i= 1; i<=a; i++){
            int d = sc.nextInt();
            if ( d%2==0){
                b+=d;
            }
            else
            c+=d;
        }
        System.out.println("Sum of even number is : " +b );
        System.out.println("Sum of odd number is : "+c);
        
    }
}