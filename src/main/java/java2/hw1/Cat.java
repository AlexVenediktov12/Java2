package java2.hw1;

public class Cat implements Runnable, Jumpable{
    private String name;
    private int maxHeight;
    private int maxLength;

    public Cat(String name, int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.name = name;
        this.maxLength = maxLength;
    }

    public void climb(Wall wall) {
        System.out.println("Сила кота " + name + " на преодоление высоты: " + maxHeight);
        if(maxHeight == 0 || maxLength == 0) {
            System.out.println("Кот " + name + " дальше не участвует");
            return;
        }
        else if(maxHeight > wall.height) {
            System.out.println("Кот " + name + " перелез через стену высотой " + wall.height + "м.");
            maxHeight -= wall.height;
        }
        else {
            System.out.println("Кот " + name + " не смог преодолеть эту стену.");
            maxHeight = 0;
        }
    }

    public void race(Treadmill treadmill) {
        System.out.println("Сила кота " + name + " на преодоление дистанции: " + maxLength);
        if(maxHeight == 0 || maxLength == 0) {
            System.out.println("Кот " + name + " дальше не участвует");
            return;
        }
        if (maxLength > treadmill.treadLength) {
            System.out.println("Кот " + name + " пробежал дистанцию длиной " + treadmill.treadLength + "м.");
            maxLength -= treadmill.treadLength;
        }
        else {
            System.out.println("Кот " + name + " не смог преодолеть эту дистанцию.");
            maxLength = 0;
        }
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }
}
