package Homework;
import java.util.Scanner;

public class GreetingL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char a;
        System.out.println("Please choose your preferred language: e for English, r for Romanian, s for Spanish");
        a = input.next().charAt(0);
        switch (a){
            case 'e':
                System.out.println("Hello, Welcome!");
                break;
            case 'r':
                System.out.println("Buna! Bine ati venit!");
                break;
            case 's':
                System.out.println("Hola! Bienvenidos");
                break;
            default:
                System.out.println("Invalid request");

    }}}
