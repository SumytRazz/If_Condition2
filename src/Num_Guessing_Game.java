import java.util.Random;
import java.util.Scanner;

public class Num_Guessing_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(5) + 1;

        while (true) {
            System.out.print("Enter your guess (1-5): ");
            int num = scanner.nextInt();

            if (num == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (num < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
    }
}
