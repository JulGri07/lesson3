package CW2_2.java;

import java.util.Scanner;

public class CW2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time;

        System.out.println("Please, enter time and press Enter");

        time = scanner.nextInt();

        if (time > 18 && time <=24 ) {
            System.out.println("Good evening");
        } else if (time <= 18 && time >= 10) {
            System.out.println("Good day");
        } else if (time >= 0 && time < 10) {
            System.out.println("Good morning");
        } else {
            System.out.println("Time is not valid");
        }

    }
}

