package homewlesson13;

public class FitnessMethods implements InstructorMethods{
    @Override
    public void CalcSalary() {
        int daySalary = 400;
        int workDays = 22;
        System.out.println("Tennis instructor monthly salary is " + daySalary*workDays);
    }

    @Override
    public void ImportantInfo() {
        System.out.println("Before leaving, fitness instructors should make sure lights in the hall are off");
    }
}
