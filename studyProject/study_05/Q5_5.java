
public class Q5_5 {
    public static void main(String[] args) {
        int sum = 1;

        for (int i = 1; i <= 10; i++) {
            sum *= i;
        }
        System.out.println("Product result : " + sum);

        for (int i = 1; i < 10; i++) {
            System.out.println("5 x " + i + " = " + 5 * i);
        }
    }
}