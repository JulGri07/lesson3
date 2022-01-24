import java.util.Scanner;

public class CW62 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name");

        String name = scanner.nextLine();

        System.out.println(sayHello(name));


    }
    static String sayHello(String name) {
        return "Hello, " + name + ", how are you doing today?";
    }
}
