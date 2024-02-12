import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenlerimi tanımladımm
        Scanner input = new Scanner(System.in);
        int km, yas;
        double kmUcret = 0.10;
        int yTipi;
        double indirim = 0;
        // kullanıcıdan girdi aldırdım
        System.out.print("Mesafeyi KM türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        double fiyat = km * kmUcret;
        System.out.print("Yolculuk Tipini giriniz (1 == Tek Yön, 2== Gidiş Dönüş) : ");
        yTipi = input.nextInt();
        Integer.toString(yTipi);
        double fiyatIndırımsız;
        fiyatIndırımsız = fiyat;
        // km ve yaşı koşulla duruma sokup iç içe if den yararlandım
        if (km > 0 && yas >= 0) {

            //yaş indirimleri if koşulu ile yapıldı
            if (yas < 12 && yas > 0) {
                indirim = 0.50;
                fiyat = fiyat * indirim;
            } else if (yas >= 12 && yas <= 24) {
                indirim = 0.90;
                fiyat = fiyat * indirim;
            } else if (yas > 24 && yas <= 65) {
                fiyat = fiyat;
            } else if (yas > 65) {
                indirim = 0.70;
                fiyat = fiyat * indirim;
            } else {
                System.out.println("Hatalı veri girişi yaptınız !");
            }
            // gidiş dönüş yolcu girdisiyle hesapladık

            // yolcu tek yönse bir indirim yapılmadı gidiş dönüş ise indirim yapıldı hata ile hata gösterildi
            if (yTipi == 1) {
                System.out.println("Toplam tutarrrrrr = " + fiyat + "TL");
            } else if (yTipi == 2) {
                fiyat = fiyat * 0.80;
                fiyat = fiyat * 2;
                System.out.println("Toplam Tutar : " + fiyat + "TL");
            } else if (yTipi != 1 && yTipi != 2) {
                System.out.println("Hatalı veri girdiniz !");
            } else {
                System.out.println("Hatalı veri girişi girdiniz !!!");
            }
        } else {
            System.out.println("Hatalı veri girişi yaptınız !");
        }
    }
}