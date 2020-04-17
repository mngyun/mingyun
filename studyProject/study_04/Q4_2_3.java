
public class Q4_2_3 {
    public static void main(String[] args) {
        int bit = ~0;
        int num = -234;

        System.out.println(1 << 31); // 00000000 00000000 00000000 00000001

        bit ^= (1 << 30); // 10111111 11111111 11111111 11111111
        num &= bit; // 101111....

        System.out.println(num << 1); // 0111...
    }
}