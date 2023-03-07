package Homework;
import java.util.Scanner;

public class CalculatorL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        double a;
        double b;
        double answer;
               char sign = '+';
        a = input.nextDouble();
        System.out.println("Please Enter the second number");
        b = input.nextDouble();
        System.out.println("Enter the desired operation : + for addition, A for average, C for comparison");
        sign = input.next().charAt(0);
        switch (sign){
            case '+':
                answer = a+b;
                System.out.println(answer);
                break;
            case 'A':
                answer = (a+b)/2;
                System.out.println(answer);
                break;
            case 'C':
                if (a>b) System.out.println("Your first number is bigger");
                if (a<b) System.out.println("Your second number is bigger");
                if (a==b) System.out.println("Your numbers are equal");
                break;
            default:
                System.out.println("Invalid request");


        }


    }
}
