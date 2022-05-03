import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.println(number + " в 2-ичной системе - это " + Integer.toBinaryString(number));
        System.out.println(number + " в 8-ичной системе - это " + Integer.toOctalString(number));
        System.out.println(number + " в 16-ичной системе - это " + Integer.toHexString(number));
    }
}
