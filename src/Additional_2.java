import java.util.Scanner;

public class Additional_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 10");
        int number = scanner.nextInt();
        if (number <= 0 || number > 10) {
            System.out.println("Invalid number");
            System.exit(1);
        }

        multiplicationTable(number);
    }

    static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println( number + "x" + i + "=" + (i * number) + "\t");
        }
    }
}

