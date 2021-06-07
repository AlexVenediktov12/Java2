package java2.hw1;

public class Robot extends Participants implements Runnable, Jumpable{
    private String name;
    private int maxHeight;
    private int maxLength;

    public Robot(String name, int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.name = name;
        this.maxLength = maxLength;
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
