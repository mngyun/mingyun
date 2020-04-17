
public class ENotation {
    public static void main(String[] args) {
        double e1 = 1.2e-3;
        double e2 = 3.4e+4;
        double e_result = e1 + e2;

        int num1 = 0xA0E;
        int num2 = 0752;
        int num_result = num1 + num2;

        System.out.println("" + e1 + " + " + e2 + " = " + e_result);
        System.out.println("" + num1 + " + " + num2 + " = " + num_result);
    }
}