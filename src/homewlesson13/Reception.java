package homewlesson13;

public class Reception {
    public static void main(String[] args) {
       FitnessClub beHealthy = new FitnessClub("Be Healthy", "Dimo12", 1000, 500);

       beHealthy.MyFitnessClubInfo();
        System.out.println("The club number is " + beHealthy.getClubName());
        System.out.println("The maximal number of customers is " + beHealthy.getMaxCustomers());


        Premium premCard = new Premium();
        premCard.GeneralInfo();
        Business busCard = new Business();
//        busCard.GeneralInfo();
        Economy ecCard = new Economy();
//        ecCard.GeneralInfo();

//        premCard.PriceCalc();

//        busCard.PriceCalc();
        Tennis tenInstructor=new Tennis();
        tenInstructor.InstructorInfo();
        tenInstructor.WorkingSchedule(1);
        Swimming swimInstructor=new Swimming();
//        swimInstructor.InstructorInfo();

Schedule.ifIsOpen();
Schedule.showSchedule();




        }

    }




