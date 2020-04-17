
public class BitOpUst {
    public static void main(String[] args) {
        byte n1 = 7; // 00000111
        byte n2 = 13; // 00001101
        int n3 = n1 & n2;

        System.out.println(n3); // 00000101

        n3 = n1 | n2;
        System.out.println(n3); // 00001111

        n3 = n1 ^ n2;
        System.out.println(n3); // 00001010

        n3 = ~n3;
        System.out.println(n3); // 11110101 | 00001011(11)
        n3 = ~n3;
        System.out.println(n3);// 00001010
        n3 >>= 2;
        System.out.println(n3);// 00000010
        n3 <<= 2;
        System.out.println(n3);// 00001000
        System.out.println(-3443 << 20);// positive
    }

}