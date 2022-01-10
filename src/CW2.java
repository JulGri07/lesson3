package CW2.java;

import java.util.Scanner;

public class CW2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time;

        System.out.println("Please, enter time and press Enter");

        time = scanner.nextInt();

        switch ((time <0 || time >24 ) ? 0 :
                (time >18 ) ? 1 : 2
                ) {
            case 1 :System.out.println("Good evening");break;
            case 2 :System.out.println("Good day");break;
            default:System.out.println("time is not valid");break;

        }

        }




    }
