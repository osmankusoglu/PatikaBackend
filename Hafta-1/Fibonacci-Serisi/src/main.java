import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("9 Elemanlı Fibonacci Serisi : ");
        int n = input.nextInt();
        System.out.println();


        int ilkSayi = 0;
        int ikinciSayi = 1;


        for (int i = 1; i <= n; i++) {
            System.out.print(ilkSayi + " ");

            int digerSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = digerSayi;
        }

    }
}