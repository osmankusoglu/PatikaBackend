import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    int km;
    double KMbasi = 2.20, toplamTutar, acilisTutar = 10;
    Scanner input = new Scanner(System.in);
    System.out.print("Mesafeyi KM cinsinden giriniz. : ");
    km =input.nextInt();

    toplamTutar = (km * KMbasi);
    toplamTutar += acilisTutar;


    toplamTutar = (toplamTutar < 20) ? 20 : toplamTutar;
    System.out.println("Toplam tutar : " + toplamTutar);

    }
}
