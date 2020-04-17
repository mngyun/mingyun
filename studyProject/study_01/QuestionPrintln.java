/*
    String 과 int|float 등의 숫자 결합의 경우 string 결합이 우선된다 = False
    + 연산 방향은 -> 이고, 문자열과 숫자의 결합이 진행 결과 문자열이 되고, 다시 숫자와 문자열의 결합이 진행된다.
*/

public class QuestionPrintln {
    public static void main(String[] args) {
        System.out.println("2 + 5=" + 2 + 5); // String junction first
        System.out.println("2 + 5=" + (2 + 5));
    }
}