package homewlesson13;

import java.util.Scanner;

abstract class Abonement {
    int length;
     int age;
    boolean child;
    double price;

    abstract void GeneralInfo ();


    abstract void PriceCalc();

}
