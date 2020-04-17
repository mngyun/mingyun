
public class Q5_4_2 {
    public static void main(String[] args) {
        int num = 1;
        int result = 0;

        while (num < 100) {
            result += num;
            System.out.print(num);
            num++;
        }

        System.out.println("\n-------");
        System.out.println("result of sum : " + result + "\n-------");

        do {
            System.out.print(num);
            num--;
        } while (num > 0);
        System.out.println("\n-------");
    }

}