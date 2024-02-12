import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik : ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz Matematik notu!");
        } else {
            System.out.print("Fizik : ");
            fizik = input.nextInt();
            if (fizik < 0 || fizik > 100) {
            } else {
                System.out.print("Türkçe : ");
                turkce = input.nextInt();
                if (turkce < 0 || turkce > 100) {
                } else {
                    System.out.print("Kimya : ");
                    kimya = input.nextInt();
                    if (kimya < 0 || kimya > 100) {
                    } else {
                        System.out.print("Müzik : ");
                        muzik = input.nextInt();
                        if (muzik < 0 || muzik > 100) {
                        } else {

                            int toplam = (mat + fizik + turkce + kimya + muzik);
                            double sonuc = toplam / 5.0;
                            System.out.println("Ortalamanız : " + sonuc);

                            if (sonuc >= 55) {
                                System.out.println("Sınıfı Geçtiniz");
                            } else {
                                System.out.println("Sınıfta Kaldınız");
                            }
                        }
                    }
                }
            }
        }
    }
}