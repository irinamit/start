package lesson7;

public class Animal {
    float size;//class attributes
    boolean isPredator;
    String color;

    void run(){//ничего не возвращает, не принимает аргументы (пустые скобки)
        System.out.println("I am running");
    };
    void eat (String food){// ничего не возвращает, принимает variables of String type
        System.out.println("I am eating" + food);
    };
    String sound(){
        if (isPredator) return "roar";
    else return "cry";}

}
