import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int dGun;
        String dAy;

        System.out.print("Doğduğunuz Ay :");
        dAy = input.nextLine();
        System.out.print("Doğduğunuz Gün :");
        dGun = input.nextInt();


        if(dAy.equals("Ocak")){
            if(dGun >=1 && dGun < 22 ){
                System.out.println("Oğlak Burcu");
            }else if (dGun>=22 && dGun < 32){
                System.out.println("Kova Burcu");
            }
        }

        if(dAy.equals("Şubat")){
            if(dGun >=1 && dGun <=19){
                System.out.println("Kova Burcu");
            }else if (dGun>=19 && dGun < 30){
                System.out.println("Balık Burcu");
            }
        }

        if(dAy.equals("Mart")){
            if(dGun >=1 && dGun <= 20){
                System.out.println("Balık Burcu");
            }else if (dGun>=21 && dGun < 32){
                System.out.println("Koç Burcu");
            }
        }

        if(dAy.equals("Nisan")){
            if(dGun >=1 && dGun < 21){
                System.out.println("Koç Burcu");
            }else if (dGun>=21 && dGun < 30){
                System.out.println("Boğa Burcu");
            }
        }

        if(dAy.equals("Mayıs")){
            if(dGun >=1 && dGun < 22){
                System.out.println("Boğa Burcu");
            }else if (dGun>=22 && dGun < 32){
                System.out.println("İkizler Burcu");
            }
        }

        if(dAy.equals("Haziran")){
            if(dGun >=1 && dGun <= 22){
                System.out.println("İkizler Burcu");
            }else if (dGun>=22 && dGun < 31){
                System.out.println("Yengeç Burcu");
            }
        }

        if(dAy.equals("Temmuz")){
            if(dGun >=1 && dGun < 23){
                System.out.println("Yengeç Burcu");
            }else if (dGun>=23 && dGun < 32){
                System.out.println("Aslan Burcu");
            }
        }

        if(dAy.equals("Ağustos")){
            if(dGun >=1 && dGun <= 22){
                System.out.println("Aslan Burcu");
            }else if (dGun>=22 && dGun < 32){
                System.out.println("Başak Burcu");
            }
        }

        if(dAy.equals("Eylül")){
            if(dGun >=1 && dGun < 23){
                System.out.println("Başak Burcu");
            }else if (dGun>=23 && dGun < 31){
                System.out.println("Terazi Burcu");
            }
        }

        if(dAy.equals("Ekim")){
            if(dGun >=1 && dGun <= 22){
                System.out.println("Terazi Burcu");
            }else if (dGun>=23 && dGun < 32){
                System.out.println("Akrep Burcu");
            }
        }

        if(dAy.equals("Kasım")){
            if(dGun >=1 && dGun < 22){
                System.out.println("Akrep Burcu");
            }else if (dGun>=22 && dGun < 31){
                System.out.println("Yay Burcu");
            }
        }

        if(dAy.equals("Aralık")){
            if(dGun >=1 && dGun <= 21){
                System.out.println("Yay Burcu");
            }else if (dGun>=22 && dGun < 32){
                System.out.println("Oğlak Burcu");
            }
        }


    }
}