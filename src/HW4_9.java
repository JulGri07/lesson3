import java.util.Scanner;

public class HW4_9 {
    static double bmi;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w;
        double h;

        System.out.println("Please, enter weight in pounds & height in inches and press Enter");
        w = scanner.nextInt();
        h = scanner.nextInt();

        System.out.println("Body Mass Index is " + countbmi(w, h));

    }
    static double countbmi(double w, double h) {
        return bmi = (w / (h*h)) * 703;
    }
}


