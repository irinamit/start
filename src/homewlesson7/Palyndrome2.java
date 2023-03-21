package homewlesson7;

import java.util.Scanner;

public class Palyndrome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        System.out.println("Please type a sentence");
        sentence = input.nextLine ();
        String reversed = "";
        for (int i=0; i<sentence.length(); i++) {
            reversed = sentence.charAt(i) + reversed;}
            if (sentence.equals(reversed)) System.out.println("Palindrome detected"  );
            else System.out.println("Palindrome not detected");


    }
}
