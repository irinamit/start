package practice;
import java.io.IOException;

public class Help1 {
    public static void main(String[] args) throws IOException {

        System.out.println("Help");
        System.out.println("1. if");
        System.out.println("2. switch ");
        System.out.println("Select: ");
        System.out.println("\n");
        char choice;
        choice = (char) System.in.read();
        switch (choice) {
            case '1':
                System.out.println("if operator:\n");
                System.out.println("if (condition) operator;");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("switch operator: \n");
                System.out.println("switch (expression) {");
                System.out.println("case constant: ");
                System.out.println("sequence of operators");
                System.out.println("break");
                System.out.println("//...");
                System.out.println("}");
                break;
            default:
                System.out.println("query not found");




        }
}}


