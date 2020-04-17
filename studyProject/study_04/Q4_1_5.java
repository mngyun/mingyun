
public class Q4_1_5 {
    public static void main(String[] args) {
        int numA = ((25 + 5) + 36 / 4 - 72) * 5;
        int numB = (25 * 5 + (36 - 4) + 71) / 4;
        int numC = (128 / 4) * 2;
        boolean result = numA > numB && numB > numC;
        System.out.println(result);
        System.out.println(numA);
        System.out.println(numB);
        System.out.println(numC);

        int n1 = 3;
        System.out.println(n1 * 2.2);
        // error ! n1 = n1 * 2.2;
    }
}