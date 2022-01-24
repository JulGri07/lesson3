import java.util.Scanner;

public class CW63 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some string");

        String s = scanner.nextLine();

        printStringWords(s);

    }
    static void printStringWords(String s) {
        String[] result = s.split("\\s+");
        for (int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
