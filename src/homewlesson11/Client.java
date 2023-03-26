package homewlesson11;

import java.util.Scanner;

public class Client {
   private String familyName;
    private String name;


    String getFamilyName(){
        return familyName;
    }
    void setFamilyName(String  familyName) {
        System.out.println("Enter you family name");
        Scanner input =new Scanner(System.in);
        familyName = input.nextLine();
        this.familyName = familyName;
    }
    String getName(){
        return name;
    }
    void setName(String  name) {
        System.out.println("Enter you name");
        Scanner input =new Scanner(System.in);
        name = input.nextLine();
         this.name = name;
    }


}
