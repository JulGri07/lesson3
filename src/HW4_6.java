import java.util.Scanner;

public class HW4_6 {

    static int days = 0;
    static String month_name = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month;
        int year;

        System.out.print("Input a month number: ");
        month = scanner.nextInt();

        System.out.print("Input a year: ");
        year = scanner.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year");
            System.exit(1);
        }

        System.out.println(chekingmonth(month, year));


    } static String chekingmonth(int month, int year) {
        switch (month) {
            case 1:  month_name = "January";days=31;
            case 2:  month_name = "February";
                days= (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? 29 : 28;

            case 3:  month_name = "March";days=31;
                return month_name + " " + year + " has " + days + " days";
            case 4:  month_name = "April";days=30;
                return month_name + " " + year + " has " + days + " days";
            case 5:  month_name = "May";days=31;
                return month_name + " " + year + " has " + days + " days";
            case 6:  month_name = "June";days=30;
                return month_name + " " + year + " has " + days + " days";
            case 7:  month_name = "July";days=31;
                return month_name + " " + year + " has " + days + " days";
            case 8:  month_name = "August";days=31;
                return month_name + " " + year + " has " + days + " days";
            case 9:  month_name = "September";days=30;
                return month_name + " " + year + " has " + days + " days";
            case 10: month_name = "October";days=31;
                return month_name + " " + year + " has " + days + " days";
            case 11: month_name = "November";days=30;
                return month_name + " " + year + " has " + days + " days";
            case 12: month_name = "December";days=31;
                return month_name + " " + year + " has " + days + " days";
            default: return "Invalid month";

        }



    }

}

