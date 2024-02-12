import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    int r;
    double pi = 3.14, alani, cevresi;
    Scanner input = new Scanner(System.in);

    System.out.print("Yarı Çap  = ");
    r = input.nextInt();

    cevresi = 2 * pi * r;
    System.out.println("Üçgenin Çevresi = " + cevresi);

    alani = pi *  r * r;
    System.out.println("Üçgenin Alanı " + alani);



    }
}
