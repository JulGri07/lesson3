import java.util.Scanner;

public class CW65 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Greetings, your initials are " + getInitials(fullName));
    }

    public static String getInitials(String fullName) {
        int idxLastWhitespace = fullName.lastIndexOf(' ');
        return fullName.substring(0, 1) + "." + fullName.substring(idxLastWhitespace + 1, idxLastWhitespace + 2);
    }
}


