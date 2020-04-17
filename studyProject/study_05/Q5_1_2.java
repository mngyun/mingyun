
public class Q5_1_2 {
    public static void main(String[] args) {
        int num = 150;

        if (num < 0) {
            System.out.println("num is less than 0");
        } else if (num < 100) {
            System.out.println("num is more or equal than 0 and less than 100");
        } else if (num < 200) {
            System.out.println("num is more or equal than 100 and less than 200");
        } else if (num < 300) {
            System.out.println("num is more or equal than 200 and less than 300");
        } else {
            System.out.println("num is more or equal than 300");
        }
    }
}