import java.util.Scanner;

public class HW4_4 {
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

        System.out.println(compareLength(max_length, str1));


    }
    static String compareLength(int max_length, String str1) {
        if (str1.length() <= max_length) {
            return str1;
        } else {
            return "Error: length of the string is more than expected. \nExpected length <=" + max_length;
        }

    }
}