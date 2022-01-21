package CW2_1.java;

import java.util.Scanner;

public class CW2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    int time;

    System.out.println("Please, enter time and press Enter");

    time = scanner.nextInt();

    if (time > 18 && time <=24 ) {
        System.out.println("Good evening");
    } else if (time <= 18 && time >=0) {
        System.out.println("Good day");
    } else {
        System.out.println("Time is not valid");
    }

    }
}
