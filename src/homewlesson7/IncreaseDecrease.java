package homewlesson7;

import java.util.Arrays;

public class IncreaseDecrease {
    public static void main(String[] args) {
        double[] numbers = {38, 39, 1, 34, 1, 90, 12, 45};
        System.out.print(Arrays.toString(numbers));
        System.out.println();

        double product;
        for (int i = 0; i < numbers.length; i++) {
            product = numbers[i] * 3 / 4;
            if (product<1) product = numbers[i] * 5/4;
            System.out.print(" " + product);
//            else product= numbers[i]*5/4;
//            System.out.print(" " + product);


        }
    }
}