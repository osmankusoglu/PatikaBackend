import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Değişkenleri oluşturdum.
        int n, k,total = 1;
        Scanner input = new Scanner(System.in);
        //Kullanıcının giriş yapacağı sayıların yerlerini belirledim.
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();

        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();
        //üssü alacak şekilde yazdım.
        for (int i = 1; i <= k;i++) {
            total *=  n;

        }
        //Cevap kısmı
        System.out.println(" Cevap : " + total);
    }

}