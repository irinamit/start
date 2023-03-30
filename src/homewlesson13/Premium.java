package homewlesson13;

import java.util.Scanner;

public class Premium extends Abonement {

    void GeneralInfo() {
        System.out.println("Premium club card will let you use any of our facilities " +
                "during both weekdays and weekends at any time, including night hours");


    }

    void PriceCalc (){

        System.out.println("For Premium package, enter the number of months you wish to attend");
        Scanner input =new Scanner(System.in);
        length = input.nextInt();
        System.out.println("How old are you?");
        age = input.nextInt();


        if (age<18) this.price=length*600/2;
        else this.price = length*1000;
        System.out.println("The price will be " + this.price);
    }

}
