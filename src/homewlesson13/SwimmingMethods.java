package homewlesson13;

public class SwimmingMethods implements InstructorMethods{
    @Override
    public void CalcSalary() {
        int daySalary = 700;
        int workDays = 22;
        System.out.println("Tennis instructor monthly salary is " + daySalary*workDays);
    }

    @Override
    public void ImportantInfo() {
        System.out.println("Before leaving, swimming instructors should make sure lights in the swimming pool are off," +
                "no people hiding in the pool area");
    }
}
