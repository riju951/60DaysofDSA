import java.util.Scanner;

public class Fifth {

    public static int sum ( int a){
        int b = 0 ;
        while ( a!= 0){
            int c = a%10;
            b = b + c;
            a/=10;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        int a = sc.nextInt();
        System.err.println(sum(a));
    }
}
