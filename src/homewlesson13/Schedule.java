package homewlesson13;

import lesson12.A;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Schedule {


    public static void ifIsOpen() {


        int time;
        System.out.println("Enter the time of your visit");
        try {
            Scanner input = new Scanner(System.in);
            String open;

            time = input.nextInt();
            if (time < 9 || time > 24) {
                throw new IllegalArgumentException("Time must  be within 0-24 hours limit");
            } else time = time;
            if (time >= 9 & time <= 20) open = "opened";
            else open = "closed";
            System.out.println("At " + time + " the facility is " + open);
        } catch (IllegalArgumentException a) {
            System.out.println(" Time must be within 0-24 hour range " + a);

        } catch (InputMismatchException i) {
            System.out.println("Ivalid input " + i);

        }
    }


    public static void showSchedule() {
        String[] week = {
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
        Scanner input = new Scanner(System.in);
        System.out.println("our working days are" + Arrays.toString(week));
        System.out.println("available time slots" + Arrays.toString(workSlot));
        System.out.println("Which sports are you interested: press t for tennis, f for fitness, s for swimming, w for wrestling, S for soccer, T for table tennis");

        char sport = input.next().charAt(0);
        try {
            if (sport != 't' || sport != 's' || sport != 'w' || sport != 'T' || sport != 'f' || sport != 'S') {
                throw new IllegalArgumentException("Only t, s, w, f, T, S characters allowed");
            } else sport = sport;

            if (sport == 't' || sport == 's' || sport == 'w' || sport == 'T' || sport == 'f' || sport == 'S') {

                Random generator = new Random();
                int rand = generator.nextInt(week.length);
                int randslot = generator.nextInt(workSlot.length);

                System.out.println(" You are scheduled for " + week[rand] + " at " + workSlot[randslot]);
            }
        } catch (IllegalArgumentException a) {
            System.out.println(" invalid input" + a);
        } catch (InputMismatchException i) {
            System.out.println("Ivalid input " + i);


        }
    }
}


















