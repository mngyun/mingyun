
public class Q5_7 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            if (i % 2 == 0) {
                for (int j = 2; j <= i; j++) {
                    System.out.println(i + " x " + j + " = " + i * j);
                }
            }
        }

        for (int n = 1; n < 10; n++) {
            for (int m = 1; m < 10; m++) {
                if ((n + m) == 9) {
                    System.out.println("[" + n + ", " + m + "]");
                }
            }
        }
    }

}