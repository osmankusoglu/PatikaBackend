import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product implements Operation{
    Scanner scanner = new Scanner(System.in);
    Scanner stringScanner = new Scanner((System.in));

    private static ArrayList<Notebook> notebookList = new ArrayList<>();

    public Notebook(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory) {

        super(id, name, price, discountRate, stock, brandName, memory, screenSize, ram);
    }

    public Notebook() {

    }

    public void runMenu() {
        Notebook notebookStore = new Notebook();
        boolean isRunning = true;
        while (isRunning) {
            System.out.println();
            System.out.println("Notebook Yönetim Paneli");
            System.out.println();
            System.out.println(
                    "1- Notebook listeleme \n" +
                    "2- Notebook ekleme \n" +
                    "3- Notebook silme \n" +
                    "4- Id'ye göre filtreleme \n" +
                    "5- Markaya göre filtreleme \n" +
                    "0- Ana menüye dön" );
            System.out.println();
            System.out.print("Yapmak istediğiniz işlemleri seçiniz: ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    notebookStore.showProductList();
                    break;
                case 2:
                    notebookStore.addProduct();
                    break;
                case 3:
                    notebookStore.deleteProduct();
                    break;
                case 4:
                    notebookStore.filterByProductId();
                    break;
                case 5:
                    notebookStore.filterByProductBrand();
                    break;
                case 0:
                    System.out.println("---------------------");
                    System.out.println("Ana menüye dönülüyor");
                    System.out.println("----------------------");
                    isRunning=false;
                    break;
            }
        }
    }

    @Override
    public void showProductList() {
        System.out.println("Notebook Listesi");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.format("| %-3s | %-30s | %-10s | %-10s | %-10s | %-10s | %-10s |\n","ID", "Ürün Adı", "Fiyat", "Marka", "Depolama ", "Ekran", "RAM");
        System.out.println("---------------------------------------------------------------------------------------------------------");


        for (Notebook nb : notebookList){
            System.out.format("| %-3d | %-30s | %-10.2f | %-10s | %-10s | %-10s | %-10d |\n", nb.getId(), nb.getName(), nb.getPrice(), nb.getBrandName(),nb.getMemory(), nb.getScreenSize(), nb.getRam());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");

    }

    @java.lang.Override
    public void addProduct() {

        System.out.println("---------------");
        System.out.println("Yeni ürün ekleniyor");

        System.out.print("Ürün id'sini giriniz: ");
        int newId = scanner.nextInt();
        if (findById(newId)==null) {
            System.out.print("Ürün adını giriniz: ");
            String newName = stringScanner.nextLine();

            System.out.print("Ürünün fiyatını giriniz: ");
            int newPrice = scanner.nextInt();

            System.out.print("Ürünün markasını giriniz: ");
            String newBrand = stringScanner.nextLine();


            System.out.print("Ürünün depolama alanını giriniz: ");
            String newStorage = stringScanner.nextLine();

            System.out.print("Ürünün ekran boyutunu giriniz: ");
            String newScreen = stringScanner.nextLine();

            System.out.print("Ürünün Ram'ini giriniz: ");
            int newRam = scanner.nextInt();

            System.out.print("Ürünün stok miktarını giriniz: ");
            int newStock = scanner.nextInt();

            System.out.print("Ürünün indirim oranını giriniz: ");
            int newDiscountRate = scanner.nextInt();

            System.out.println("------------------------------");

            notebookList.add(new Notebook(newId, newName, newPrice, newDiscountRate, newStock, newBrand, newScreen, newRam, newStorage ));
            System.out.println("Ürün eklenmiştir...");
            System.out.println();

        } else {
            System.out.println("Bu Id numarası daha önce kullanılmıştır. Tekrar deneyiniz.");
        }
    }

    @java.lang.Override
    public void deleteProduct() {
        System.out.print("Silinecek ürünün Id'sini giriniz: ");
        int selection = scanner.nextInt();

        if (findById(selection)!=null) {
            notebookList.remove(findById(selection));
            System.out.println("Ürün silinmiştir.");
        } else {
            System.out.println("Bu id'ye ait bir ürün bulunamadı. Tekrar deneyebilirsiniz.");
        }
    }

    @java.lang.Override
    public void filterByProductId() {
        System.out.print("Aramak istediğiniz Id numarasını giriniz: ");
        int selection = scanner.nextInt();
        if (findById(selection) != null) {
            System.out.println();
            System.out.printf("%-5s %-14s %-11s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                    "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Stok", "İndirim Oranı");
            for (Notebook item : notebookList) {
                if (item.getId() == selection) {
                    printInfo(item);
                }
            }
        } else {
            System.out.println();
            System.out.println("Geçersiz id numarası girdiniz. Tekrar deneyebilirsiniz.");
            System.out.println();
        }
    }

    @java.lang.Override
    public void filterByProductBrand() {
        System.out.print("Aramak istediğiniz marka ismini giriniz: ");
        String searchBrand = stringScanner.nextLine().toLowerCase();
        searchBrand = searchBrand.substring(0, 1).toUpperCase() + searchBrand.substring(1);

        System.out.println();
        System.out.printf("%-5s %-14s %-11s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Stok", "İndirim Oranı");
        for (Notebook item: notebookList) {
            if (item.getBrandName().equals(searchBrand)) {
                printInfo (item);
            }
        }
        System.out.println();
    }

    static {
        notebookList.add(new Notebook(1, "HUAWEI Matebook 14", 7000, 0.25, 1000, "Huawei", "14.0", 16, "512"));
        notebookList.add(new Notebook(2,"LENOVO V14 IGL", 3699, 0.2, 500, "Lenovo", "14.0", 8, "1024"));
        notebookList.add(new Notebook(3, "ASUS Tuf Gaming", 8199, 0.1, 100, "Asus", "15.6", 32, "2048"));
    }

    public Notebook findById (int id) {
        for (Notebook notebook : notebookList) {
            if (notebook.getId() == id) {
                return notebook;
            }
        }
        return null;
    }

    public void printInfo (Notebook item) {
        System.out.printf("%-5s %-14s %-11s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                item.getId(), item.getName(), item.getPrice(), item.getBrandName(),
                item.getMemory(), item.getScreenSize(), item.getRam(), item.getStock(),
                item.getDiscountRate());
    }
}