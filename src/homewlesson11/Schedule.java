package homewlesson11;

import java.util.Scanner;

public class Schedule {
    String[] facility = {
            "tennis court",
            "swimming pool",
            "wrestling field",
            "soccer field",
            "table"
    };
    String[] sports = {
            "tennis",
            "swimming",
            "wrestling",
            "soccer",
            "table tennis"
    };


    String [] week = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
    };



    String workSlot[] = {
    "9-10",
    "10-11",
    "11-12",
    "12-13",
    "13-14",
    "14-15",
    "15-16",
    "16-17",
    "17-18",
    "18-19",
    "19-20"
    };

public void ifIsOpen(int workingHours) {

    String open;
    if (workingHours >=9 & workingHours <=20) open="opened";
    else open = "closed";
    System.out.println("At " + workingHours + " the facility is " + open);
}


}
