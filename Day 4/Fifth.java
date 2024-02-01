import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        if ( year % 4 == 0){
            if ( year % 100 == 0){
                if ( year % 400 == 0){
                    System.err.println("It is leap year");
                }
                else
                    System.err.println("It is not a leap Year");
            }
            else
            System.err.println("It is a leap year");
        }
        else{
            System.err.println("It is not a Leap Year");
        }
    }
    
}
