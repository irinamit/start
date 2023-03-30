package homewlesson13;

public class TennisMethods implements InstructorMethods{
    @Override
    public void CalcSalary() {
        int daySalary = 500;
        int workDays = 22;
        System.out.println("Tennis instructor monthly salary is " + daySalary*workDays);
            }

    @Override
    public void ImportantInfo() {
        System.out.println("Before leaving, tennis instructors should make sure lights in the tennis courts are off");

    }
}
