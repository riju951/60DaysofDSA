import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the day of the week");
        int a = sc.nextInt();
        switch (a){
            case 1:System.err.println("Monday");
            break;
            case 2:System.err.println("Tuesday");
            break;
            case 3:System.err.println("Wednesday");
            break;
            case 4:System.err.println("Thursday");
            break;
            case 5:System.err.println("Friday");
            break;
            case 6:System.err.println("Saturday");
            break;
            case 7:System.err.println("Sunday");
            break;
            default:System.err.println("Not found");
        }
    }
}
