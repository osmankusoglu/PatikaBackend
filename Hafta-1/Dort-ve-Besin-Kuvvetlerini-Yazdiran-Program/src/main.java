import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Kullanıcının gireceği sayı için bir değişken oluşturdum.
        int  n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();
        //4 ve 5 sayısının kuvvetleri için kodları ve çıktılarını belirledim.
        for (int a = 1; a <= n; a *= 4) {
            System.out.println(a + " - 4'ün kuvvetleri");
        }
        System.out.println("-----------------------------");
        for(int b = 1; b <= n; b *= 5) {
            System.out.println(b + " - 5'in kuvvetleri");
        }
    }
}
