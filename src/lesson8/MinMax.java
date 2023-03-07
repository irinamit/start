package lesson8;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        int min, max;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<10; i++) {
            //Math.random() * (endOfRange -startOfRange) + startOfRange
            numbers[i] = (int) (Math.random() * 200-100);
        }
        for (int i=0; i<10; i++) {
            System.out.println("Enter[" +i + "]=" + numbers[i]);
        }
        min =max = numbers[0];
        for (int i = 1; i<10; i++){
            if (numbers[i]<min) min = numbers[i];
            if (numbers[i]>max) max = numbers[i];

        }
        System.out.println("minimum is" + min);
        System.out.println("maximum is " + max);
    }
}
