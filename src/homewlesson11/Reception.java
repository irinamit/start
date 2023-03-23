package homewlesson11;

import lesson12.A;

public class Reception {
    public static void main(String[] args) {
        MyFitnessClub healthlife = new MyFitnessClub("Healthy life", "Dimo12", 1000, 600);



        healthlife.MyFitnessClubInfo();
        healthlife.SpaceAvailable();
        Abonement childHalf =new Abonement(6,true);
        Abonement adultdHalf =new Abonement(6,false);


        System.out.println("The price of 6 months for a child is "+ childHalf.price);
        System.out.println("The price of 6 months for an adult is "+ adultdHalf.price);






    }

}
