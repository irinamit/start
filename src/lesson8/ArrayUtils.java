package lesson8;
import java.util.Scanner;
public class ArrayUtils {
    int[] randomArray(int[] array, int min, int max) {
        for (int i = 0; i < 10; i++){
            array[i] = (int)  Math.random() * (max- min) + min;
        }
            return array;
        }
        static int[] inputArray(int[] array) {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter" + (i * 1) + "array element:");
                array[i] = input.nextInt();
            }
            return array;
        }
        static void showArray(int[] array){
            for (int i = 0; i<10; i++) {
                System.out.println("numbers[" + i + "]=" + array[i]);
            }
        }
        static void showMinMax(int[] array){
        int min, max;
        max=min=array[0];
            for (int i = 1; i<10; i++){
                if (array[i]<min) min = array[i];
                if (array[i]>max) max = array[i];

            }
            System.out.println("minimum is" + min);
            System.out.println("maximum is " + max);
        }
        }


