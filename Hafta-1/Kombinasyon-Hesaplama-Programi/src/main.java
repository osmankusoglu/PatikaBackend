import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan n değerini girmesini istedim. (2'ye eşit veya büyük olmalıdır)
        int n;
        System.out.print("n değerini giriniz (2'ye eşit veya büyük olmalıdır): ");
        n = input.nextInt();

        while (n < 2) {
            System.out.println("Hata: n, 2'ye eşit veya büyük olmalıdır.");
            System.out.print("n değerini tekrar giriniz: ");
            n = input.nextInt();
        }

        // İkinci sayı birinci sayıdan küçük ve 0'dan büyük olmalıdır
        int r;

        System.out.print("r değerini giriniz (n'den küçük ve 0'dan büyük olmalıdır): ");
        r = input.nextInt();

        while (r >= n || r < 0) {
            System.out.println("Hata: r, n'den küçük ve 0'dan büyük olmalıdır.");
            System.out.print("r değerini tekrar giriniz: ");
            r = input.nextInt();
        }

        // n! / (r! * (n-r)!)
        int kombinasyon = 1;

        // n faktöriyeli
        for (int i = 1; i <= n; i++) {
            kombinasyon *= i;
        }

        // r faktöriyeli
        for (int p = 1; p <= r; p++) {
            kombinasyon /= p;
        }

        // (n-r) faktöriyeli
        for (int q = 1; q <= n - r; q++) {
            kombinasyon /= q;
        }

        // Sonuç kısmı
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }
}