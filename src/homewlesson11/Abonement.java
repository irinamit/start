package homewlesson11;

import lesson12.C;

import java.util.Scanner;

public class Abonement {
    int length;
    private int age;
    private boolean child;
    double price;


//    Abonement (int length, boolean child) {
//        this.length = length;
//        this.child = child;
//          if (child) price= length*600/1.5;
//                else price=length*600;
//            }

    int getAge(){
        return age;
    }
    void setAge(int  age) {
        System.out.println("Enter your age");
        Scanner input =new Scanner(System.in);
        age = input.nextInt();
        if (age>2 & age<90)
            this.age = age;
        else System.out.println("Invalid age");
    }
    boolean setChild() {
        if (this.age>2 & this.age <18) child = true;
        else child=false;
        return child;
    }
    void getChild(){
        if (setChild()) System.out.println("Child discount is applied");
        else System.out.println("Full price is applied");

    }


    void PriceCalc (){

        System.out.println("Enter the number of months you wish to attend");
        Scanner input =new Scanner(System.in);
        length = input.nextInt();

        if (child) this.price=length*600/2;
        else this.price = length*600;
        System.out.println(this.price);
    }


}

