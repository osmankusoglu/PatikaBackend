import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int deneme = 3;
        int secenek;
        int bakiye = 1500;

        while (deneme > 0) {
            System.out.print("Kullanıcı Adınız : ");
            kullaniciAdi = input.nextLine();
            System.out.print("Parolanız : ");
            sifre = input.nextLine();

            if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz !");
                do {
                    System.out.println(
                            "1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    secenek = input.nextInt();

                    switch (secenek) {
                        case 1:
                            System.out.print("Para Miktarı : ");
                            int tutar = input.nextInt();
                            bakiye += tutar;
                            System.out.println("Para yatırma işlemi başarılı.");
                            break;

                        case 2:
                            System.out.print("Para Miktarı : ");
                            int paraCekmeTutari = input.nextInt();
                            if (paraCekmeTutari > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= paraCekmeTutari;
                                System.out.println("Para çekme işlemi başarılı.");
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;

                        case 4:
                            System.out.println("Tekrar Görüşmek üzere..");
                            System.out.println("İyi günler dileriz!");
                            break;

                        default:
                            System.out.println("Geçersiz işlem. Lütfen tekrar deneyin.");
                    }
                } while (secenek != 4);

                break;
            } else {
                deneme--;
                if (deneme > 0) {
                    System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz! Kalan hakkınız: " + deneme);
                }
            }
        }

        if (deneme == 0) {
            System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz!");
        }
    }
}