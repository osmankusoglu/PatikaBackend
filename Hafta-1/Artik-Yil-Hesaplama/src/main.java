import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        //4'ün katı,100'ün katı ve 400'ün katı olan yılları artık yıl verecek şekilde yazdım.
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır.");
                    //bu koşulu karşılamayan yılların artık yıl olmadığı çıktısını verecek şekilde yazdım.
                } else {
                    System.out.println(yil + " bir artık yıl değildir.");
                }
            }
            //4'e bölünmeyi  karşılamayan yılların bağladım.
        } else {
            System.out.println(yil + " artık bir yıl değildir.");
        }


    }

}

