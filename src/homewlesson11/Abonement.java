package homewlesson11;

public class Abonement {
    int length;
    boolean child;
    double price;
    int visits;

    Abonement (int length, boolean child) {
        this.length = length;
        this.child = child;
          if (child) price= length*600/1.5;
                else price=length*600;
            }


}

