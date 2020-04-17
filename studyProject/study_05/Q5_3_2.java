
public class Q5_3_2 {
    public static void main(String[] args) {
        int n = 24;

        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("over 0, under 10");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println("over 10, under 20");
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                System.out.println("over 20, under 30");
                break;
            default:
                System.out.println("etc.");
                break;
        }
    }

}