import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(" Asal sayılar 1'den büyük pozitif tam sayı olmalıdır !");
        } else {
            if (prime(number, number / 2)) {
                System.out.println(number + " sayısı ASALDIR !");
            } else {
                System.out.println(number + " sayısı ASAL değildir !");
            }
        }
    }
    static boolean prime(int numb, int div) {

        if (div == 1) {
            return true;
        }
        if (numb % div == 0) {
            return false;
        }
        return prime(numb, div - 1);
    }
}
