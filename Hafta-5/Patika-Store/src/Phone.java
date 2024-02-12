import java.util.ArrayList;
import java.util.Scanner;

public class Phone extends Product implements Operation {

    Scanner scanner = new Scanner(System.in);
    Scanner stringScanner = new Scanner((System.in));
    Scanner stringScannertwo = new Scanner(System.in);
    private static ArrayList<Phone> phoneList = new ArrayList<>();
    private int camera;
    private double battaryCapacity;
    private String color;

    public Phone(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory, int camera, double battaryCapacity, String color) {
        super(id, name, price, discountRate, stock, brandName,memory, screenSize, ram);
        this.camera = camera;
        this.battaryCapacity = battaryCapacity;
        this.color = color;
    }

    public Phone() {
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBattaryCapacity() {
        return battaryCapacity;
    }

    public void setBattaryCapacity(int battaryCapacity) {
        this.battaryCapacity = battaryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @java.lang.Override
    public void runMenu() {
        Phone phoneStore = new Phone();
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("TELEFON YÖNETİM PANELİ");
            System.out.println();
            System.out.println(
                    "1- Telefon listeleme \n" +
                    "2- Telefon ekleme \n" +
                    "3- Telefon silme \n" +
                    "4- Id'ye göre filtreleme \n" +
                    "5- Markaya göre filtreleme \n" +
                    "0- Ana menüye dön" );
            System.out.print("Tercihiniz: ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    phoneStore.showProductList();
                    break;
                case 2:
                    phoneStore.addProduct();
                    break;
                case 3:
                    phoneStore.deleteProduct();
                    break;
                case 4:
                    phoneStore.filterByProductId();
                    break;
                case 5:
                    phoneStore.filterByProductBrand();
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
    public void showProductList() {
        System.out.println();
        System.out.println("Cep Telefonu Listesi");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-3s | %-30s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil", "RAM", "Renk");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

        for (Phone phone : phoneList) {
            System.out.format("| %-3d | %-30s | %-10.2f | %-10s | %-10d | %-10s | %-10d | %-10.1f | %-10d | %-10s |\n",
                    phone.getId(), phone.getName(), phone.getPrice(), phone.getBrandName(), phone.getStock(),
                    phone.getScreenSize(), phone.getCamera(), phone.getBattaryCapacity(), phone.getRam(), phone.getColor());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
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

            System.out.print("Ürünün kamera bilgisini giriniz: ");
            int newCamera = stringScanner.nextInt();

            System.out.print("Ürünün pil kapasitesini giriniz: ");
            int newBattery = stringScanner.nextInt();

            System.out.print("Ürünün Ram'ini giriniz: ");
            int newRam = scanner.nextInt();

            System.out.print("Ürünün rengini giriniz: ");
            String newColor = stringScannertwo.nextLine();

            System.out.print("Ürünün stok miktarını giriniz: ");
            int newStock = scanner.nextInt();

            System.out.print("Ürünün indirim oranını giriniz: ");
            int newDiscountRate = scanner.nextInt();

            System.out.println("------------------------------");

            phoneList.add(new Phone(newId, newName, newPrice, newDiscountRate, newStock, newBrand, newScreen, newRam, newStorage, newCamera, newBattery, newColor ));
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
            phoneList.remove(findById(selection));
            System.out.println("Ürün silinmiştir.");
        } else {
            System.out.println("Bu id'ye ait bir ürün bulunamadı. Tekrar deneyebilirsiniz.");
        }
    }

    @java.lang.Override
    public void filterByProductId() {
        System.out.print("Aramak istediğiniz Id numarasını giriniz: ");

        int selection = scanner.nextInt();
        if (findById(selection)!=null) {
            System.out.println();
            System.out.printf("%-5s %-25s %-11s %-10s %-10s %-10s %-10s %-10s %-10s %-20s %-10s %-10s%n",
                    "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil",  "RAM", "Renk", "Stok", "İndirim Oranı");
            for (Phone item : phoneList) {
                if (item.getId()==selection) {
                    printInfo(item);
                }
            }
        } else {
            System.out.println();
            System.out.println("Geçersiz id numarası girdiniz. Tekrar deneyebilirsiniz.");
        }
    }

    @java.lang.Override
    public void filterByProductBrand() {
        System.out.print("Aramak istediğiniz marka ismini giriniz: ");
        String searchBrand = stringScanner.nextLine().toLowerCase();
        searchBrand = searchBrand.substring(0, 1).toUpperCase() + searchBrand.substring(1);

        System.out.println();
        System.out.printf("%-5s %-25s %-11s %-10s %-10s %-10s %-10s %-10s %-10s %-20s %-10s %-10s%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil",  "RAM", "Renk", "Stok", "İndirim Oranı");
        for (Phone item: phoneList) {
            if (item.getBrandName().equals(searchBrand)) {
                printInfo (item);
            }
        }
        System.out.println();
    }

    static {
        phoneList.add(new Phone(1,"Samsung Galaxy A51", 3199,0.2,128,"Samsung", "6.5", 6,"128",32,4000,"Siyah"));
        phoneList.add(new Phone(2,"iPhone 11 64 GB", 7379,0.15,64,"Apple", "6.1", 6,"64",5,3046,"Mavi"));
        phoneList.add(new Phone(3,"Redmi Note 10 Pro 8GB", 4012,0.1,128,"Xioami", "6.5", 12,"128",35,4000,"Beyaz"));

    }

    public Phone findById (int id) {
        for (Phone phone : phoneList) {
            if (phone.getId() == id) {
                return phone;
            }
        }
        return null;
    }

    public void printInfo (Phone item) {
        System.out.printf("%-5s %-25s %-11s %-10s %-10s %-10s %-10s %-10s %-10s %-20s %-10s %-10s%n",
                item.getId(), item.getName(), item.getPrice(), item.getBrandName(),
                item.getMemory(), item.getScreenSize(), item.getCamera(), item.getBattaryCapacity(), item.getRam(), item.getColor(), item.getStock(),
                item.getDiscountRate());
    }
}