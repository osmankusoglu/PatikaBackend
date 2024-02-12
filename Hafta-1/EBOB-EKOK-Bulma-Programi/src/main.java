import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int n1, n2;
        int ebob = 1, ekok;
        int i = 1;


        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz :  ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz :  ");
        n2 = input.nextInt();


        while (i <= n1 && i <= n2){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }


        ekok = (n1 * n2) / ebob;

        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);



    }
}