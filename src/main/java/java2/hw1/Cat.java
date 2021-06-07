package java2.hw1;

public class Cat extends Participants implements Runnable, Jumpable{
    private String name;
    private int maxHeight;
    private int maxLength;

    public Cat(String name, int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.name = name;
        this.maxLength = maxLength;
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
