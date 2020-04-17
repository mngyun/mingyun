
public class Q4_1_2 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;

        num1 += 10;
        num2 += 10;
        boolean result = num1 < 0 && num2 > 0;

        System.out.println(result);
        System.out.println(num2);

        result = (num1 += 20) == 30 && (num2 += 20) == 30;
        System.out.println(result);
        System.out.println(num2);

        result = (num1 -= 20) == 30 || (num2 -= 15) > 0;
        System.out.println(result);
        System.out.println(num2);

    }
}