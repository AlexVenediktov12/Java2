package java2.hw1;

public class MainApp {
    public static void main(String[] args) {
        Inventory[] inventories = {new Treadmill(500), new Wall(5), new Wall(3),
                new Treadmill(200)};
        Participants[] participants = {new Cat("Barsik", 3, 1200),
                new Human("Oleg", 2, 800),
                new Robot("R2D2", 0, 3000)};

        for (Participants p : participants) {
            for(Inventory i : inventories) {

            }

        }

    }
}
