package homewlesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InteractiveResolving {
    public static void main(String[] args) {
        boolean isPalindrome =false;
        try {
            File myObj = new File("D:\\DCM_MVA\\MIR\\jdk-16\\start\\src\\Lesson9\\Input\\Input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] strArray = data.split("[^a-zA-Z0-9А-Яа-я]");
                for (String word: strArray) {
//                    System.out.println(word);
//                   for (int i=0; i < word.length()/2; i++){
//                       if (word.charAt(i) != word.charAt((word.length)-1-i)) {
//                    break;
//                       }
//                   }
                    if (isPalindrome(word.toLowerCase())) System.out.println(word);
//
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static boolean isPalindrome (String word) {
        for (int i=0; i < word.length()/2; i++){
                       if (word.charAt(i) != word.charAt((word.length())-1-i)) {
                    return false;
                       }
                   }
return true;
    }

    }


