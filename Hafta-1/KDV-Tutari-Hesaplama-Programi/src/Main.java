import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Fiyat Giriniz : ");
        fiyat = input.nextDouble();

        double kdvOrani = 0.18;
        double kdvsizFiyat = fiyat;
        double kdvliFiyat = fiyat * kdvOrani + fiyat ;

        System.out.println("Ürün Fiyatı : " + kdvsizFiyat);
        System.out.println("KDV Oranı : " + kdvOrani);
        System.out.println("KDV Fiyatı : " + fiyat * kdvOrani);
        System.out.println("KDV'li Fiyat : " + kdvliFiyat);






    }
}