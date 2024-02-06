import java.util.Scanner;

public class Third {

    public static int pali(int b){
        int c = 0;
        int d = 0;
        while ( b!=0){
            c = b%10;
            d = d*10 + c;
            b = b/10;
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if  (pali(a) == a ) 
        System.out.println("Yes");
        else 
        System.out.println("No");
    }
}
