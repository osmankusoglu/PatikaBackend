import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Paragrafı giriniz : ");
        String scan = input.nextLine();

        String[] words = scan.split(" ");


        HashMap<String, Integer> wordMap = new HashMap<>();


        for (int i = 0; i < words.length; i++) {
            if (wordMap.containsKey(words[i])) {
                int count = wordMap.get(words[i]);
                count++;
                wordMap.put(words[i], count);
            } else {
                wordMap.put(words[i], 1);
            }

        }


        String mostMentionedWord = "";
        int maxCount = 0;


        for (String word : wordMap.keySet()) {
            int count = wordMap.get(word);
            if (count > maxCount) {
                maxCount = count;
                mostMentionedWord = word;
            }
        }
        System.out.println("En çok geçen kelime " + "'"+mostMentionedWord+"'" + " " +  maxCount + " defa geçmiştir.");
    }
}