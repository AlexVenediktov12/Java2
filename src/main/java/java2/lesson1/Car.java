package java2.lesson1;

public class Car {
    private String model;
    private int speed;
    private boolean onTheWay;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void move() {
        onTheWay = true;
    }
    public void stop() {
        onTheWay = false;
    }

    public String getModel() {
        return model;
    }

    public boolean isOnTheWay() {
        return onTheWay;
    }

    public void setOnTheWay(boolean onTheWay) {
        this.onTheWay = onTheWay;
    }
}
