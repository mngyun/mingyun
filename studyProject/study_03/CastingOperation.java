public class CastingOperation {
    public static void main(String[] args) {
        char ch1 = 'A'; // actual value : 65
        char ch2 = 'Z'; // actual value = 90

        int nch1 = ch1; // without loss of data
        int nch2 = (int) ch2;

        System.out.println("Unicode of 'A' is " + (int) ch1);
        System.out.println("Unicode of 'A' is " + nch1);
        System.out.println("Unicode of 'Z' is " + nch2);
    }
}