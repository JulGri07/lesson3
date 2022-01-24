import java.util.Scanner;

public class HW4_5 {

    public static String Password = "pass";

    public static String Username = "Yuriy";

    public static void main(String[] args) {
        int max_pass = 4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username : ");
        String username = scanner.nextLine();

        System.out.println("Enter Password : ");
        String password = scanner.nextLine();

        if (password.length() <=0 || password.length() > max_pass) {
            System.out.println("Invalid password max length");
            System.exit(1);
        }
        System.out.println(validationAccess(password, username));

    }
     static String validationAccess(String password, String username) {
         if (username.equals(Username) && password.equals(Password)) {
             return "Access Granted! Welcome!";
         } else if (username.equals(Username)) {
             return "Invalid Password!";
         } else if (password.equals(Password)) {
             return "Invalid Username!";
         } else {
             return "Invalid Username & Password!";
         }
     }

}


