import java.util.Scanner;

public class HW44_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter min  & max value and press Enter");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        System.out.println("randomNumber = " + genRandomInt(min, max));
    }

    public static int genRandomInt(int min, int max){
        double randomNumberD = Math.random();
        int randomInt;
        randomInt = (int)(min + randomNumberD * (max - min));
        return randomInt;
    }
}