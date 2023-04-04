package homewlesson13;

public class FitnessClub { private String clubName;
    private String address;
    private int maxCustomers;
    private int currentCustomers;



    FitnessClub(String clName, String address, int maxCustomers, int currentCustomers) {
        this.clubName = clName;
        this.address = address;
        this.maxCustomers = maxCustomers;
        this.currentCustomers=currentCustomers;
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



    public String getClubName() {
        return clubName;
    }

    public String getAddress() {
        return address;
    }

    public int getMaxCustomers() {
        return maxCustomers;
    }

    public int getCurrentCustomers() {
        return currentCustomers;
    }



    public void MyFitnessClubInfo () {
        System.out.println("Club name is " + clubName);
        System.out.println("Club address is " + address);
        System.out.println("Club maximum number of customers is " + maxCustomers);
        System.out.println("Club current number of customers is " + currentCustomers);

    }
}
