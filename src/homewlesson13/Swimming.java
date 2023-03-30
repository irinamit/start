package homewlesson13;

import java.util.Arrays;

public class Swimming extends Instructor{

    String[][] instrWorkdays = {{"Ann Fits", "Monday, Wednesday, Friday"}, {"Joe Dale", "Tuesday, Thursday, Saturday"},
            {"Jane Khann", "Friday, Saturday, Sunday"} };

    void InstructorInfo() {
        {
            System.out.println(" Our swimming instructors are:  " + instrWorkdays[0][0] + ", " + instrWorkdays[1][0] + ", "
                    + instrWorkdays[2][0]);
        }

    }
    void WorkingSchedule(int instructor){
        System.out.println(instructor + " working days are  " + Arrays.toString (instrWorkdays[instructor]));
    }



}
