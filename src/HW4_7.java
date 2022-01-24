public class HW4_7 {
    public static void main(String[] args) {

        double i = 1000;
        double m = 0.0254;

        System.out.println(covertMeter(i,m));
    }
    static double covertMeter(double i, double m) {
        double x = i * m;
        return x;
    }
}
