public class main {
        public static void main(String[] args) {
                int n = 10;

                for (int i = n; i >= 1; i--) {
                        // Her satırdaki boşlukları ekle
                        for (int j = 0; j < n - i; j++) {
                                System.out.print(" ");
                        }

                        // Her satırdaki yıldızları ekle
                        for (int k = 1; k <= 2 * i - 1; k++) {
                                System.out.print("*");
                        }

                        System.out.println();
                }
        }
}