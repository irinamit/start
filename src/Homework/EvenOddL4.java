package Homework;
import java.util.Scanner;
public class EvenOddL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please enter a number");
        number = input.nextInt();

        if (number % 2 ==0) System.out.println(number + " is even");
        else System.out.println(number + " is odd");



        }

    }

