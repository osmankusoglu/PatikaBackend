public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT", "MAT");
        Course fizik = new Course("Fizik", "FZK", "FZK");
        Course kimya = new Course("Kimya", "KMY", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "9050000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "9055111111", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90552222222", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "111111", mat, fizik, kimya);
        s1.addBulkExamNote(49,65,22,65,48,30);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "22222", mat, fizik, kimya);
        s2.addBulkExamNote(70,95,50,58,40,50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "33333", mat, fizik, kimya);
        s3.addBulkExamNote(63,56,27,78,23,67);
        s3.isPass();

    }
}