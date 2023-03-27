package homewlesson11;

import java.util.Scanner;

public class Instructor {
    private String familyName;
    private String name;
    private String sports;
    private String days;

    String getFamilyName() {
        return familyName;
    }

    void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSports() {
        return sports;
    }

    void setSports(String sports) {
        this.sports = sports;
    }

    String getDays() {
        return days;
    }

    void setDays(String days) {
        this.days = days;

    }

    void CouchInfo(String familyName, String name, String sports, String days) {
        System.out.println("This instructor's name is " + name + ". " +
                " Family name is "+ familyName + ". He teaches " + sports + ". This instructor works on " + days);
    }
}
