public class BooleanTest {
    public static void main(String[] args) {
        boolean flag = false;

        flag = (3 < 4);
        System.out.println("3 < 4");

        if (flag == true) {
            System.out.println("your flag is true");
        } else {
            System.out.println("your flag is false");
        }

        flag = (3 > 4);
        System.out.println("3 > 4");

        if (flag == true) {
            System.out.println("your flag is true");
        } else {
            System.out.println("your flag is false");
        }
    }
}