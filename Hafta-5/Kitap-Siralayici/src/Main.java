import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Beyaz Diş", 192, "Jack London", 1906);
        Book book2 = new Book("Aylak Adam", 155, "Yusuf Atılgan", 1959);
        Book book3 = new Book("Kumarbaz", 183, "Dostoyevski", 1866);
        Book book4 = new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", 1943);
        Book book5 = new Book("Uçurtma Avcısı", 440, "Khaled Hosseini", 2003);


        // Set that sorts books by name
        Set<Book> nameSorting = new TreeSet<>();
        nameSorting.add(book1);
        nameSorting.add(book2);
        nameSorting.add(book3);
        nameSorting.add(book4);
        nameSorting.add(book5);

        System.out.println("A'dan Z'ye İSME GÖRE SIRALAMA");
        for (Book book : nameSorting) {
            System.out.println(book);
        }

        Comparator<Book> pageCountComparator = Comparator.comparingInt(Book::getNumberOfPages);

        Set<Book> pageCountSorting = new TreeSet<>(pageCountComparator);
        pageCountSorting.addAll(nameSorting);

        System.out.println("\nSAYFA SAYISINA GÖRE SIRALAMA");
        for (Book book : pageCountSorting) {
            System.out.println(book);
        }
    }
}