import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        int year;
        int days = 0;
        String month_name = "";

        System.out.print("Input a month number: ");
        month = scanner.nextInt();

        System.out.print("Input a year: ");
        year = scanner.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year");
            System.exit(1);
        }

        switch ( month ) {
            case 1:  month_name = "January";days=31;break;
            case 2:  month_name = "February";
                     days= (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? 29 : 28;
                     break;
            case 3:  month_name = "March";days=31;break;
            case 4:  month_name = "April";days=30;break;
            case 5:  month_name = "May";days=31;break;
            case 6:  month_name = "June";days=30;break;
            case 7:  month_name = "July";days=31;break;
            case 8:  month_name = "August";days=31;break;
            case 9:  month_name = "September";days=30;break;
            case 10: month_name = "October";days=31;break;
            case 11: month_name = "November";days=30;break;
            case 12: month_name = "December";days=31;break;
            default:System.out.println("Invalid month");System.exit(1);break;
        }

        System.out.println(month_name + " " + year + " has " + days + " days");
    }

}
