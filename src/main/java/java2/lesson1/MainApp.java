package java2.lesson1;

public class MainApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Browm", 5);
        System.out.println(cat);

        Car car = new Car("BMW", 60);
        Human human = new Human("Bob");

        human.startCar(car);
        human.stopCar();

    }
}
