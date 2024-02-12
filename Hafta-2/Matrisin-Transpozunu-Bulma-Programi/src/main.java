import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sütun  : ");
        int sutun = input.nextInt();

        System.out.print("Satır : ");
        int satir = input.nextInt();

        int[][] matris = new int[sutun][satir];

        System.out.println("Matris ");

        int value = 1;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < satir; j++) {
                matris[i][j] = value;
                value++;
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();
        }

        int[][] transpozMatris = new int[satir][sutun];

        System.out.println("---------");
        System.out.println("Transpoze ");

        for (int i = 0; i < transpozMatris.length; i++) {
            for (int j = 0; j < transpozMatris[i].length; j++) {
                transpozMatris[i][j] = matris[j][i];
                System.out.print(transpozMatris[i][j] + "  ");
            }
            System.out.println();
        }
    }
}