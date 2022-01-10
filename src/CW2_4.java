import java.util.Scanner;

public class CW2_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max length of the string");

        int max_length = scanner.nextInt();

        scanner.nextLine();

        if (max_length <= 0) {
            System.out.println("Invalid max length");
            System.exit(1);
        }

        System.out.println("Enter the string");
        String str1 = scanner.nextLine();

        if (str1.length() <= max_length) {
            System.out.println(str1);
        } else {
            System.out.println("Error: length of the string is more than expected. \nExpected length <=" + max_length);
        }


    }
}
