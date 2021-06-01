package java2.lesson1;

public class Human {
    private String name;
    private Car currentCar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void startCar(Car car) {
        if(!car.isOnTheWay()) {
            car.move();
            currentCar = car;
            System.out.println(name + " поехал на машине " + car.getModel());
        }
    }

    public void stopCar() {
        if(currentCar != null) {
            currentCar.stop();
            System.out.println(name + " остановил машину " + currentCar.getModel());
            currentCar = null;
        }
    }
}
