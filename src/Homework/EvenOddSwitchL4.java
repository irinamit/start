package Homework;

import java.util.Scanner;

public class EvenOddSwitchL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please enter a number");
        number = input.nextInt();
        int result = number % 2;
        switch (result) {
            case 0:
                System.out.println("The number is even");
                break;
            case 1:
                System.out.println("The number is odd");
                break;
            case -1:
                System.out.println("The number is odd");
                break;


        }

    }
}
