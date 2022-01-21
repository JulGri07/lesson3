package HW4_1.java;

import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time;

        System.out.println("Please, enter time and press Enter");

        time = scanner.nextInt();

        System.out.println(dayOrEvening(time));


    }

    static String dayOrEvening(int time) {
        switch ((time < 0 || time > 24) ? 0 :
                (time > 18) ? 1 : 2)
        {
            case 1:
                return "Good evening";
            case 2:
                return "Good day";
            default:
                return "time is not valid";

        }
    }
}
