public class Second{

    public static void swap ( int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
         System.out.println("a after swapping : " + a);
         System.out.println("b after swapping : " + b); 
    }

    public static void main (String []args){
        int a = 5;
        int b = 3;
        swap(a,b);
    }
}