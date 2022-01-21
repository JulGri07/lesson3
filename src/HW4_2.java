import java.util.Scanner;

public class HW4_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time;

        System.out.println("Please, enter time and press Enter");

        time = scanner.nextInt();

        System.out.println(dayOrEvening(time));

    }
    static String dayOrEvening(int time) {
        if (time > 18 && time <=24 ) {
            return "Good evening";
        } else if (time <= 18 && time >= 10) {
            return "Good day";
        } else if (time >= 0 && time < 10) {
            return "Good morning";
        } else {
            return "Time is not valid";
        }
    }
}

