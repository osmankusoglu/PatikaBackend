import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = scanner.nextInt();

        int[] sayilar = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print((i + 1)+ "." + "Sayıyı giriniz : ");
            sayilar[i] = scanner.nextInt();
        }

        int max = sayilar[0];
        int min = sayilar[0];

        for (int i = 1; i < n; i++) {
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
            if (sayilar[i] < min) {
                min = sayilar[i];
            }
        }

        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);

    }
}