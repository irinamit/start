package lesson8;
import java.util.Scanner;

public class ArrayActionsDemo {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        Scanner input = new Scanner (System.in);
       ArrayUtils.showArray(numbers);
       ArrayUtils.showMinMax(numbers);
    }
}
