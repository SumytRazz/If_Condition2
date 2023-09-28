import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Username = "Sumit";
        String Password = "Raj";
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();


        if (username.equals(Username)){
            if (password.equals(Password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid Password");
            }
        }

        else{
            System.out.println("invalid user");
        }
    }
}

