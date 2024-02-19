import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        // Yazar Ekleme
        Author author = new Author();
        author.setName("Ahmet Ümit");
        author.setBirthDate(LocalDate.parse("1960-09-30"));
        author.setCountry("Türkiye");
        entityManager.persist(author);

        // Yayınevi Ekleme
        Publisher publisher = new Publisher();
        publisher.setName("CEM");
        publisher.setAddress("İstanbul");
        publisher.setEstablishmentYear(1996);
        entityManager.persist(publisher);

        // Kategori Ekleme
        Category categoryNovel = new Category();
        categoryNovel.setName("Novel");
        categoryNovel.setDescription("whodunit");
        entityManager.persist(categoryNovel);

        ArrayList<Category> categoryArrayList = new ArrayList<>();
        categoryArrayList.add(categoryNovel);

        // Kitap Ekleme
        Book book = new Book();
        book.setName("Sis ve Gece");
        book.setPublicationYear(1996);
        book.setStock(100);
        book.setAuthor(author);
        book.setPublisher(publisher);
        entityManager.persist(book);
        book.setCategoryList(categoryArrayList);

        // Kitap Ödünçalma
        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setBook(book);
        bookBorrowing.setBorrowerName("Osman");
        bookBorrowing.setBorrowingDate(LocalDate.parse("2024-02-19"));
        bookBorrowing.setReturnDate(null);
        entityManager.persist(bookBorrowing);

        entityTransaction.commit();
    }
}
