import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {
        //"File.txt adında dosya oluşturuluyor."
        File file = new File("File.txt");
        if (!file.exists()) {
            file.createNewFile();
        }


        try {
            /*
            String tipinde bir değer oluşturulur. Bu değer, dosyaya yazılacak veriyi temsil eder.
            FileWriter sınıfı kullanılarak bir dosya yazma işlemi başlatılır.
            'file' değişkeni, yazılacak dosyanın yolu ve adını içermelidir.
            BufferedWriter sınıfı kullanılarak dosyaya yazma işlemi gerçekleştirilir.
            Belirtilen değeri dosyaya yazma işlemi gerçekleştirilir.
            BufferedWriter kapatılarak kaynakların düzgün bir şekilde serbest bırakılması sağlanır.
            */
            String value = "5\n10\n20\n12\n33";
            FileWriter fWriter = new FileWriter(file, false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(value);
            bWriter.close();

            //Dosyayı okumak için BufferedReader nesnesi oluşturulur.
            BufferedReader readBuff = new BufferedReader(new FileReader(file));

            //Toplamı hesaplamak için bir değişken tanımlanır.
            int result = 0;

            //Dosyanın sonuna kadar satır satır okuma yapılır.
            String line;
            while ((line = readBuff.readLine()) != null) {

                //Okunan satırdaki sayısal değeri alarak toplama eklenir.
                int number = Integer.parseInt(line);
                result += number;
            }
            //Toplam ekrana yazdırılır.
            System.out.println("Sayıların Toplamı : " + result);

            //BufferedReader kapatılır.
            readBuff.close();
        } catch (IOException e) {
            //Dosya okuma sırasında oluşan IOException hatası yakalanıp ve hata mesajı ekrana yazdırılır.
            System.out.println(e.getMessage());

            //dosyanın mevcut olmadığını belirten bir mesaj yazdırılır.
            System.out.println("Dosya mevcut değil !!");

        }
    }
}