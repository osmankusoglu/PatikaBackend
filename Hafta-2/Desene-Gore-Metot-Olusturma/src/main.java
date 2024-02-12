import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        method(n);
    }

    static void method(int number) {
        System.out.print(number + " ");

        if (number <= 0) {
            return;
        } else {
            method(number - 5);
            System.out.print(number + " ");
        }
    }
}