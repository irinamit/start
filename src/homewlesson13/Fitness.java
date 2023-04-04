package homewlesson13;

import java.util.Arrays;

public class Fitness extends Instructor{

    String[][] instrWorkdays = {{"Ted Floe", "Monday, Wednesday, Friday"}, {"Bran Ots", "Tuesday, Thursday, Saturday"},
            {"Judy Harwood", "Friday, Saturday, Sunday"} };

    void InstructorInfo() {
        {
            System.out.println(" Our fitness instructors are:  " + instrWorkdays[0][0] + ", " + instrWorkdays[1][0] + ", "
                    + instrWorkdays[2][0]);
        }

    }
    void WorkingSchedule(int instructor){
        System.out.println(instructor + " working days are  " + Arrays.toString (instrWorkdays[instructor]));
    }

}


