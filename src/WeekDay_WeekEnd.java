import java.util.Scanner;

public class WeekDay_WeekEnd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num){
            case 1:
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            case 2,3,4,5:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
