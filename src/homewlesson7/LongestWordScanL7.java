package homewlesson7;

import java.util.Scanner;

public class LongestWordScanL7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        System.out.println("Please type a sentence");
        sentence = input.nextLine ();
        int maxLength = 0;
        String[] words = sentence.split(" ");
        int length = 0;
        String longestWord="";

        for (int i=0; i<words.length; i++) {
            String word =words[i];
            length = word.length();
            if (length>maxLength) {
                maxLength =length;
                longestWord=word;}
        }

        System.out.println("The longest word is \"" + longestWord + "\" . It contains " + maxLength + " letters.");

    }
}
