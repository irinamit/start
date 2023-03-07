package lesson8;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int lines = 3;
        int columns = 4;
       int[][] table = new int[lines][columns];

        int max = 100;
        int min= -100;


        for (int t = 0; t<lines; t++){
            for (int i=0; i<columns; i++) {
                table[t][i] = (int) (Math.random() * (max - min) + min);
            }
                    }
        for (int t = 0; t <lines; t++) {
            for (int i=0; i< columns; i++) {
                System.out.print("element[" + t + "][" + i + "]=" + table);
            }
            System.out.println();
        }



    }
}
