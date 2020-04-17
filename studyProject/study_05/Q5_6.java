
public class Q5_6 {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;
        int nearThousand = 0;

        for (; num < 100; num++) {
            if (num % 5 != 0 || num % 7 != 0)
                continue;
            count++;
            System.out.println("공배수 : " + num);
        }
        System.out.println("Count : " + count);

        num = 1;
        while (true) {
            if (num % 2 == 1 || num % 3 == 0)
                nearThousand += num;

            if (nearThousand >= 1000)
                break;
            num++;
        }
        System.out.println("Last number : " + num);
        System.out.println("Result of sum : " + nearThousand);
    }
}