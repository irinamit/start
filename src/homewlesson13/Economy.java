package homewlesson13;

import java.util.Scanner;

public class Economy extends Abonement{


    void GeneralInfo(){
        System.out.println("Economy club card will let you use any of our facilities except for swimming pool " +
                "during weekdays only at 10 am to 4 pm");
    }

    void PriceCalc (){

        System.out.println("For Economy package, enter the number of months you wish to attend");
        Scanner input =new Scanner(System.in);
        length = input.nextInt();
        System.out.println("How old are you?");
        age = input.nextInt();
        if (age<18) this.price=length*300/2;
        else this.price = length*300;
        System.out.println("The price will be " + this.price);
    }
}
