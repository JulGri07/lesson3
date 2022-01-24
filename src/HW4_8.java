import java.util.Scanner;

public class HW4_8 {
    static int d;
    static int y;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m;

        System.out.println("Please, enter minutes and press Enter");
        m = scanner.nextInt();

        y = m / (365 * 24 * 60);
        d = (m - (y * 365 * 24 * 60)) / (24 * 60);

        System.out.println(convertMinutes(m));

    }
    static String convertMinutes(int m) {
        int y = m / (365 * 24 * 60);
        int d = (m - (y * 365 * 24 * 60)) / (24 * 60);
        return m + " minutes is approximately " + y + " years and " + d + " days";
    }

}
//еще есть вариант сделать 2мя функциями сперва года, а потом дни, но я решила уже не заморачиваться