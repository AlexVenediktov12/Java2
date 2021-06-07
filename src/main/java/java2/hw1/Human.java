package java2.hw1;

public class Human extends Participants implements Runnable, Jumpable{
    private String name;
    private int maxHeight;
    private int maxLength;

    public Human(String name, int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.name = name;
        this.maxLength = maxLength;
    }
    @Override
    public void jump() {
        System.out.println("Человек прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }
}
