import java.util.Scanner;

public class Second {

    public static boolean iseven(int a){
        if(a%2==0) 
        return true; 
        else 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        int a = sc.nextInt();
        iseven(a);
        System.err.println( "Is the number even? "+iseven(a));
    }
    
}
