package homewlesson13;

import java.util.Arrays;

public class Tennis extends Instructor {

    String[][] instrWorkdays = {{"Tom Jason", "Monday, Wednesday, Friday"}, {"Will Smith", "Tuesday, Thursday, Saturday"},
    {"Bruce Law", "Friday, Saturday, Sunday"} };

    void InstructorInfo() {
        {
            System.out.println(" Our tennis instructors are:  " + instrWorkdays[0][0] + ", " + instrWorkdays[1][0] + ", "
            + instrWorkdays[2][0]);
        }

    }

    void WorkingSchedule(int instructor){
        System.out.println(instructor + " working days are  " + Arrays.toString (instrWorkdays[instructor]));
    }
}




