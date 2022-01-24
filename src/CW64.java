import java.util.Scanner;

public class CW64 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some string");

        String s = scanner.nextLine();

        System.out.println(removeFirstLastSymbol(s));

    }


    static String removeFirstLastSymbol(String s) {
        String result = s.substring(1, s.length() - 1);
        return result;
    }


}
