import java.util.Scanner;

public class main {
    public static void main(String[] args){

        int dYili;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dYili = input.nextInt();

        if(dYili % 12 == 0){
            System.out.println("Maymun");
        }else if(dYili % 12 == 1){
            System.out.println("Horoz");
        }else if(dYili % 12 == 2){
            System.out.println("Köpek");
        }else if (dYili % 12 == 3) {
            System.out.println("Domuz");
        }else if (dYili % 12 == 4) {
            System.out.println("Fare");
        }else if (dYili % 12 == 5) {
            System.out.println("Öküz");
        }else if (dYili % 12 == 6) {
            System.out.println("Kaplan");
        }else if (dYili % 12 == 7) {
            System.out.println("Tavşan");
        }else if (dYili % 12 == 8) {
            System.out.println("Ejderha");
        }else if (dYili % 12 == 9) {
            System.out.println("Yılan");
        }else if (dYili % 12 == 10) {
            System.out.println("At");
        }else if (dYili % 12 == 11) {
            System.out.println("Koyun");
        }


    }
}
