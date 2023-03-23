package homewlesson11;

public class Client {
   private String familyName;
    private String name;
    private int age;
    private boolean child;

    String getFamilyNameName(){
        return familyName;
    }
    void setFamilyName(String  familyName) {
        this.familyName = familyName;
    }
    String getNameName(){
        return name;
    }
    void setName(String  name) {
        this.name = name;
    }
    int getAge(){
        return age;
    }
    void setAge(int  age) {
        if (this.age>2 & this.age<90)
        this.age = age;
    }
    boolean getChild(){
        return child;
    }
    void setChild(int  age) {
        if (this.age>2 & this.age <18) child = true;
    }



}
