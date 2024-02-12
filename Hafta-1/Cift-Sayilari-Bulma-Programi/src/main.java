import java.util.Scanner;

public class main {
    public static void main(String[]args){
        int sayi;
        int sToplami = 0;
        int tSayi = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        sayi = inp.nextInt();

        for(int i = 1; i <= sayi; i++) {
            if( i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
                sToplami = sToplami + i;
                tSayi++;



            }
        }
        System.out.println("Sayışların toplamı : " + sToplami);
        System.out.println("Toplanan sayı adedi : " + tSayi);
        System.out.println("Ortalama : " + sToplami / tSayi);
    }
}