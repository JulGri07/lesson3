import java.util.Scanner;

public class CW2_5 {
    public static void main(String[] args) {
        int max_pass = 4;

        String Password = "pass";
        String Username = "Yuriy";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username : ");
        String username = scanner.nextLine();

        System.out.println("Enter Password : ");
        String password = scanner.nextLine();

        if (password.length() <=0 || password.length() > max_pass) {
            System.out.println("Invalid password max length");
            System.exit(1);
        }

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Access Granted! Welcome!");
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }

}