package homewlesson11;

import lesson12.A;

public class Reception {
    public static void main(String[] args) {
        MyFitnessClub healthlife = new MyFitnessClub("Healthy life", "Dimo12", 1000, 600);



        healthlife.MyFitnessClubInfo();

        healthlife.SpaceAvailable();

//        Instructor pete = new Instructor();
//        pete.CouchInfo("Johnson", "Pete", "tennis", "Monday-Friday");

        Client joe = new Client();

        Abonement joe1 = new Abonement();
        MyInstructor tim = new MyInstructor();
        Schedule night = new Schedule();

        night.ifIsOpen(10);
        tim.instructorSports();

        joe.setFamilyName(joe.getFamilyName());
        joe.setName(joe.getName());
        joe1.setAge(joe1.getAge());
        joe1.getChild();
        joe1.PriceCalc();


    }

}
