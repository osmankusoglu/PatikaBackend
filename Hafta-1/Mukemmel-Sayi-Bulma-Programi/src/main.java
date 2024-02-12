import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        int sonuc;
        System.out.print("Bir sayı giriniz :");
        sayi = input.nextInt();

        for(int i = 1; i <= sayi ; i++){
            if (sayi % i ==0){
                toplam += i;
            }
        }
        sonuc = toplam - sayi;
        if (sonuc == sayi){
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }

    }
}
