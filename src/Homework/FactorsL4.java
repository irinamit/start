package Homework;
import java.util.Scanner;
public class FactorsL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a;
        int i;
        a = input.nextInt();
        for (i=1; i<=Math.sqrt(a); i++)
        if ( a%i == 0)
         System.out.println ("The factors of " + a + " are " + a/i +" and " + i);
        }
    }

