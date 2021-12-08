package Lada303.lesson1;

public class Cat implements Actable{
    private final String name;
    private int maxRunDistance;
    private double maxJumpHeight;

    public Cat(String name) {
        this.name = name;
    }
    public Cat(String name, int maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.printf("Cat %s covered the distance %d of meters\n", name, distance);
            return true;
        } else {
            System.out.printf("Cat %s did not cover the distance %d of meters\n", name, distance);
        }
        return false;
    }

    @Override
    public boolean jump(double height) {
        return height <= maxJumpHeight;
    }

    @Override
    public String info() {
        return "Cat " + name;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(double maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                '}';
    }
}


