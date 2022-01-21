import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day;

        System.out.println("Please, enter day of the week and press Enter");

        day = scanner.nextInt();

        System.out.println(dayOfWeek(day));

    }
    static String dayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "day is not valid";

        }

    }

}
