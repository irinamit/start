package homewlesson7;

import java.util.Scanner;

public class WordReversed2L7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String original;
        System.out.println("Please type a word");
        original = input.nextLine ();
        String reversedStr = " ";
        for (int i=0; i<original.length(); i++) {
            reversedStr = original.charAt(i) + reversedStr;
        }
            System.out.println("original word:  " + original);
            System.out.println("Reversed word: " + reversedStr);
        }

    }


