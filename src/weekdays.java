import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int days = sc.nextInt();

        switch (days) {
            case 1,6,7:

                System.out.println("weekend");
                break;
            case 2,3,4,5:

                System.out.println("weekday");
                break;

            default:
                System.out.println("invalid");
                break;


        }
    }
}


