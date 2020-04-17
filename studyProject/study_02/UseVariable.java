
public class UseVariable {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = num1 + num2;

        System.out.println(
                num1 + num2 + "=" + num3); /* Calculation -> String junction[15 + '='] -> string junction['15=' + 15] */

        num1 = 20;
        num2 = 30;

        System.out.println(num1 + num2 + "=" + num3); // num3 no change

        // num3 = 3.14; //error
    }
}