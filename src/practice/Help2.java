package practice;
import  java.io.IOException;

public class Help2 {
     void helpon (String[] args) throws IOException {
        char choice, ignore;

        do {
            System.out.println("Help");
            System.out.println("1. if");
            System.out.println("2. switch ");
            System.out.println("3. for ");
            System.out.println("4. while ");
            System.out.println("5. do-while");
            System.out.println("6. break");
            System.out.println("7. continue");
            System.out.println("q for exit");
            System.out.println("Select: ");

            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '7' & choice != 'q');




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
            case '3':
                System.out.println("for operator: \n");
                System.out.println("for (initiation; condition, iteration)");
                System.out.println("operator;");
                break;
            case '4':
                System.out.println("while operator:\n");
                System.out.println("while(condition) operator;");
                break;
            case '5':
                System.out.println("Operation do-while: \n");
                System.out.println("do {'");
                System.out.println("operator;");
                System.out.println("} while (condition)");
                break;
            case '6':
                System.out.println("break operator: \n");
                System.out.println("break; of break label;");
                break;
            case '7':
                System.out.println("continue operator: \n");
                System.out.println("continue; or continue label;");
                break;
                    case 'q':
                        break;




        }
}}
