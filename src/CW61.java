import java.util.Scanner;

public class CW61 {
    public static void main(String[] args) {

        String s;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter some string and press Enter");
        s = scanner.nextLine();

        System.out.println("Replace: \"" + s.replace(" ", "") + "\"");

    }
}

