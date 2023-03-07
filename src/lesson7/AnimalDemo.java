package lesson7;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal tiger; //ссылочная переменная на объект класса Animal
        tiger = new Animal();//object класса Анимал


        tiger.run(); //method
        tiger.eat(" meat");
        tiger.isPredator = true;
        System.out.println(tiger.sound());
    }
}
