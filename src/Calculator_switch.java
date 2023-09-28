import java.util.Scanner;

public class Calculator_switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = scan.nextDouble();

        System.out.print("Enter Operation (+,-,*,/): ");
        String operation = scan.next();

        switch (operation){

            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);

            default:
                System.out.println("invalid");
        }
    }
}
