import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişken isimleri oluşturdum.
        String kAdi, sifre, soru, ySifre;

        Scanner input = new Scanner(System.in);
        //Kullanıcı adını ve şifresini girmesini istiyorum.
        System.out.print("Kullanıcı Adınız : ");
        kAdi = input.nextLine();

        System.out.print("Şifreniz : ");
        sifre = input.nextLine();

            //Kullanıcı adı ve şifre doğru girildiğinde alınacak çıktıyı yazdım.

        if (kAdi.equals("patika") && sifre.equals("java123")) {
            System.out.println("Giriş Başarılı !");

            /*Kullanıcı adını ve şifreyi yanlış girdiğinde çıkan çıktıları oluşturdum.
            Şifreyi hatalı girdiğinde sıfırlamak için seçenek sundum.
            Evet dediğinde yeni şifre oluşturmasını istedim.
            Eğer eski şifre ile aynı girdiğinde başka şifre girmesi için yönlendirdim.*/

        } else {
            if (!kAdi.equals("patika")) {
                System.out.println("Bilgileriniz Hatalı !");
            } else {
                if (!sifre.equals("java123")) {
                    System.out.println("Şifreniz Hatalı !");
                    System.out.println("Şifrenizi sıfırlamak ister misiniz ? Evet/Hayır");
                    soru = input.nextLine();
                    if (soru.equals("Evet")) {
                        System.out.println("Yeni Şifre Oluşturunuz");
                        ySifre = input.nextLine();
                        if (!ySifre.equals("java123")) {
                            System.out.println("Yeni Şifre Oluşturuldu !");
                        } else {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }
                    }

                }
            }
        }


    }
}
