package HW4_11.java;

import java.util.Scanner;

public class HW4_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time;

        System.out.println("Please, enter time and press Enter");

        time = scanner.nextInt();

        System.out.println(dayOrEvening(time));

    }
    static String dayOrEvening (int time){
        if (time > 18 && time <=24 ) {
            return "Good evening";
        } else if (time <= 18 && time >=0) {
            return "Good day";
        } else {
            return "Time is not valid";
        }
    }
}
