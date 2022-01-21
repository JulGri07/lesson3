package CW2_22.java;

import java.util.Scanner;

public class CW2_22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time;

        System.out.println("Please, enter time and press Enter");

        time = scanner.nextInt();

        switch ((time <0 || time >24 ) ? 0 :
                (time >18 ) ? 1 :
                (time >=0 && time <=10) ? 3 : 2
        ) {
            case 1 :System.out.println("Good evening");break;
            case 2 :System.out.println("Good day");break;
            case 3 :System.out.println("Good morning");break;
            default:System.out.println("time is not valid");break;

        }

    }




}
