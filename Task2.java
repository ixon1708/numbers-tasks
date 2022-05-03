import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = Integer.parseInt(scanner.nextLine());
        String number = scanner.nextLine();
        System.out.println("Число " + number + " в " + base + "-ой системе. В 10-ой - это " + Integer.valueOf(number, base));
    }
}
