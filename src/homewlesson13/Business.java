package homewlesson13;

import java.util.Scanner;

public class Business extends Abonement{
    String cardType="Business";
    void GeneralInfo(){
        System.out.println("Business club card will let you use any of our facilities " +
                "during weekdays only, at any time, except for night hours");
    }

    void PriceCalc (){

        System.out.println("For Business package, enter the number of months you wish to attend");
        Scanner input =new Scanner(System.in);
        length = input.nextInt();
        System.out.println("How old are you?");
        age = input.nextInt();
        if (age<18) this.price=length*600/2;
        else this.price = length*600;
        System.out.println("The price will be " + this.price);
    }

}
