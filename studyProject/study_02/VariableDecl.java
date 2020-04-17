public class VariableDecl {
    public static void main(String[] args) {
        double num1, num2, result;

        num1 = 0.0001;
        num2 = 0.00034;
        result = num1 + num2;

        System.out.println(result); // Outpupt : 4.4E-4

        num1 = 1.0001;
        num2 = 2.00034;
        result = num1 + num2;

        System.out.println(result); // Outpupt : 3.00044
        num1 = 1.0000001;
        num2 = 2.0000001;
        result = num1 + num2;

        System.out.println(result); // Outpupt : 3.0000001999999997
    }
}