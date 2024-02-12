import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Dizinin boyutu n :  5            //Dizinin boyutu n :  6
        //1. Elemanı : 99                   //1. Elemanı : 1000221
        //2. Elemanı : -2                   //2. Elemanı : 22
        //3. Elemanı : -2121                //3. Elemanı : -1
        //4. Elemanı : 1                    //4. Elemanı : 999
        //5. Elemanı : 0                    //5. Elemanı : 0
                                            //6. Elemanı : 254

        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");

        int[] list = new int[n];
        for (int i = 0; i<list.length; i++){
            System.out.print(i+1 + ". Elemanı : ");
            list[i] = input.nextInt();

        }
        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for (int eleman : list) {
            System.out.print(eleman + " ");
        }


    }
}