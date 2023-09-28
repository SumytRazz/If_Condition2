import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter Operation (+,-,*,/): ");
        String operation = sc.next();



        if (operation.equals("+")) {
            System.out.println("The sum is:" + (num1+num2));
        } else if (operation.equals("-")) {
            System.out.println("The difference is:" + (num1 - num2));
        } else if (operation.equals("*")) {
            System.out.println("The num1 * num2 is:" + (num1 * num2));
        } else if (operation.equals("/")) {
            System.out.println("The division is:" + (num1 / num2));
        } else {
            System.out.println("Operation Not Found");
        }
    }
}