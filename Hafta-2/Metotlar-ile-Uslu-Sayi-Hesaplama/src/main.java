import java.util.Scanner;

public class main {
    static int power(int base,int exponent){
        int result = 1;
        for(int i = 1;i <=exponent;i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :  ");
        int base = scan.nextInt();
        System.out.print("Üs değerini giriniz :  ");
        int exponent = scan.nextInt();

        int result = power(base,exponent);
        System.out.print("Sonuç :  " + result);
    }
}
