import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Kullanıcıdan alınacak değişkeni belirledim.
        //İstenilen toplama işlemini yapabilmek için bir değişken daha oluştudum.
        int number;
        int total = 0;
        Scanner input = new Scanner(System.in);
        //Kullanıcının kullanacağı ortamı oluşturdum.
        do {
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();
            //İstenilen durum için kodları yazdım.
            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }
        } while (number % 2 == 0);
        //İstenen sonuç için çıktı kodunu oluşturdum.
        System.out.println("Toplam : " + total);
    }
}
