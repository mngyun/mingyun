
public class Q4_2_2 {
    public static void main(String[] args) {
        int target = 15678;
        int tool = 20;
        int result;
        boolean flag = false;

        result = target & tool;

        if (flag == true) {
            System.out.println("3 번째 비트 : 1 , 5번째 비트 : 1 => 20");
            System.out.println("3 번째 비트 : 0 , 5번째 비트 : 1 => 16");
            System.out.println("3 번째 비트 : 1 , 5번째 비트 : 0 => 4");
            System.out.println("3 번째 비트 : 0 , 5번째 비트 : 0 => 0");
            System.out.println(target + "의 3, 5번째 비트의 값 = " + result);
        } else {
            System.out.println((target & 4) >> 2);
            System.out.println((target & 16) >> 4);
        }
    }
}