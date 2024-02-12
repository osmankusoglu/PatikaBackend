import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : [10, 20, 20, 10, 10, 20, 5, 20]");
        System.out.println("Tekrar Sayıları");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int frekans = 0;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                frekans++;
                i++;
            }
            frekans++;
            System.out.println(arr[i] + " Sayısı " + frekans + " kere tekrar edildi.");
        }

    }
}