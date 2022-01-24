import java.util.Scanner;

public class Additional_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter DNA");
        String dna = scanner.nextLine();

        System.out.println(dnaToRna(dna));
    }
    static String dnaToRna(String dna) {
        String rna = dna.replace("T", "U");
        return rna;
    }
}
