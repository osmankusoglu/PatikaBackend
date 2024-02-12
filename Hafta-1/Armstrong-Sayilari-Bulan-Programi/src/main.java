import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Lazım olan değişkenleri belirledim.
        int a,b,toplam = 0;
        //Kullanıcı sayı girmesi için kodu oluşturdum.
        System.out.print("Sayı Giriniz : ");
        a = input.nextInt();
        // a yani kullanıcı girdiği sayı 0 olana kadar bölüp sayı basamaklarındaki rakamları yazdırdım.
        while (a != 0){
            b = a % 10;
            System.out.print(b  +  " + ");
            toplam = toplam + b;
            a = a / 10;
        }
        //Sonucu yazdırdım.
        System.out.println(" = " + toplam);
    }
}