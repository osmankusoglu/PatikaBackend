import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizi : " + "{15,12,788,1,-1,-778,2,0}");
        System.out.print("Girilen Sayı : ");
        int sayi = inp.nextInt();
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        int min = list[0];
        int max = list[0];

        Arrays.sort(list);
        for (int i : list) {
            if (sayi >= i) {
                min = i;
            } else if (sayi < i) {
                max = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı :  " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :  " + max);

    }
}
