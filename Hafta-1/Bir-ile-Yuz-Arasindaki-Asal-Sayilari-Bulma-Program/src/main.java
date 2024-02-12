public class main {
    public static void main(String []args){
        System.out.println();
        for (int i= 2; i <=100 ;i++){
            boolean sayi = true;
            for (int k = 2; k<= Math.sqrt(i);k++){
                if (i % k == 0) {
                    sayi = false;
                    break;
                }
            }
            if (sayi){
                System.out.print(i +  " ");
            }
        }
    }
}
