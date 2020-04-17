
public class LabledBreak {
    public static void main(String[] args) {
        int i = 1, j = 1;
        outerLoop: for (i = 1; i < 100; i++) {
            for (j = 1; j < 100; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    break outerLoop;
            }
        }
        System.out.println("[" + i + ", " + j + "]");
    }

}