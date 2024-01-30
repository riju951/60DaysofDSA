import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of Pencil");
        float a = sc.nextFloat();
        System.out.print("Enter cost of Pen");
        float b = sc.nextFloat();
        System.out.print("Enter cost of Eraser");
        float c = sc.nextFloat();
        float d = a+b+c;
        System.out.print("The total cost is :" +d);
    }
    
}
