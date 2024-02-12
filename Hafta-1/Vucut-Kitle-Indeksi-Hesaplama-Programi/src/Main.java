import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int kilo = 105;
        double boy = 1.72,endeks;
        endeks = kilo / (boy * boy);

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz  : " );
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz  : " );
        kilo = input.nextInt();
        System.out.print("Vücut Kitle İndeksiniz  : " + endeks);



    }
}
