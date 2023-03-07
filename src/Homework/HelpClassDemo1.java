package Homework;
import Homework.HelpPlease;

import  java.io.IOException;
public class HelpClassDemo1 {
    public static void main(String[] args)
     throws IOException {
        char choice, ignore;
        HelpPlease hlpobj = new HelpPlease();
        for (;;){
            do {
                hlpobj.showmenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isvalid(choice));

                if (choice == 'q') break;
                System.out.println("\n");
                hlpobj.helpon(choice);



        }

    }
}
