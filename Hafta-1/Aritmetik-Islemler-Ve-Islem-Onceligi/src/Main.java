
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int a ,b ,c,sonuc ;
        //Kullanıcı verilen sayıları girdikçe değerler ve karşılıkları eşleşecek.
        System.out.print("a sayısını giriniz : " );
        a = input.nextInt();
        System.out.print("b sayısını giriniz : " );
        b = input.nextInt();
        System.out.print("c sayısını giriniz : " );
        c = input.nextInt();
        //En son sayı girildiğinde istenilen sonucun çıktısı otomatik verilecek.
        sonuc = a+b*c-b;
        System.out.print("Sonuç = " + sonuc);

    }
}
