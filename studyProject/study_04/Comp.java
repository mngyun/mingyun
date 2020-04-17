
public class Comp {
    public static void main(String[] args) {
        int num = 3;
        num *= 2.2;// loss of data : int = int * double > int = double * double > int with loss

        System.out.println(num);

        double e1 = 3;
        System.out.println(e1);
    }
}