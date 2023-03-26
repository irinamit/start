package homewlesson11;

public class MyFitnessClub {
    private String clubName;
    private String address;
    private int maxCustomers;
    private int currentCustomers;
    private String contacts;


    MyFitnessClub(String clName, String clAddress, int max, int curr) {
        setClubName(clName);
        setAddress(clAddress);
        setMaxCustomers(max);
        setCurrentCustomers(curr);

    }
     void setClubName(String clName) {
        clubName=clName;
            }
            void setAddress (String clAddress) {
        address=clAddress;

            }
             void setMaxCustomers (int max) {
        if (max<=1000) maxCustomers=max;
        else {maxCustomers=1000;
            System.out.println("Sorry, maximum capacity in all our facilities is 1000 people");}
            }
            void setCurrentCustomers (int curr){
        if (curr>0 & curr<maxCustomers )
            currentCustomers=curr;


            }

            public void MyFitnessClubInfo () {
        System.out.println("Club name is " + clubName);
        System.out.println("Club address is " + address);
        System.out.println("Club maximum number of customers is " + maxCustomers);
        System.out.println("Club current number of customers is " + currentCustomers);

            }
            public void SpaceAvailable() {if (currentCustomers<maxCustomers) System.out.println("Space available");
                    else System.out.println("Space not available");

            }

}
