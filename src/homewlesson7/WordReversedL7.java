package homewlesson7;

public class WordReversedL7 {
    public static void main(String[] args) {
String str = "Difficult";
    char[] charArray=str.toCharArray();
    char [] charsReversed = new  char[charArray.length];

        for (int i = 0, j = charArray.length - 1; i < charArray.length; i++, j--) {
            charsReversed[i] = charArray[j];
        }
        System.out.print(charArray);
        System.out.println();
        System.out.print(charsReversed);

}

    }



