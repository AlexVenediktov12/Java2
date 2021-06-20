package java2.hw1;

public class Robot implements Runnable, Jumpable{
    private String name;
    private int maxHeight;
    private int maxLength;

    public Robot(String name, int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.name = name;
        this.maxLength = maxLength;
    }

    public void climb(Wall wall) {
        System.out.println("Сила робота " + name + " на преодоление высоты: " + maxHeight);
        if(maxHeight == 0 || maxLength == 0) {
            System.out.println("Робот " + name + " дальше не участвует");
            return;
        }
        if(maxHeight > wall.height) {
            System.out.println("Робот " + name + " перелез через стену высотой " + wall.height + "м.");
            maxHeight -= wall.height;
        }
        else {
            System.out.println("Робот " + name + " не смог преодолеть эту стену.");
            maxHeight = 0;
        }
    }

    public void race(Treadmill treadmill) {
        System.out.println("Сила робота " + name + " на преодоление дистанции: " + maxLength);
        if(maxHeight == 0 || maxLength == 0) {
            System.out.println("Робот " + name + " дальше не участвует");
            return;
        }
        if (maxLength > treadmill.treadLength) {
            System.out.println("Робот " + name + " пробежал дистанцию длиной " + treadmill.treadLength + "м.");
            maxLength -= treadmill.treadLength;
        }
        else {
            System.out.println("Робот " + name + " не смог преодолеть эту дистанцию.");
            maxLength = 0;
        }
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }
}
