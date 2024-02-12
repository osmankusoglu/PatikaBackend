import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = input.nextInt();

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= (n - a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a) - 1; c++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int d = 4; d >= 1; d--) {
            for (int e = 1; e <= (n - d); e++) {
                System.out.print(" ");

            }
            for (int c = 1; c <= (2 * d) - 1; c++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

