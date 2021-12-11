package Lada303.lesson1;

public class Human implements Actable{
    private final String nameSurname;
    private int maxRunDistance;
    private double maxJumpHeight;

    public Human(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    public Human(String nameSurname, int maxRunDistance, double maxJumpHeight) {
        this.nameSurname = nameSurname;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.printf("Human %s covered the distance %d of meters\n", nameSurname, distance);
            return  true;
        } else {
            System.out.printf("Human %s did not cover the distance %d of meters\n", nameSurname, distance);
        }
        return  false;
    }

    @Override
    public boolean jump(double height) {
        return  height <= maxJumpHeight;
    }

    @Override
    public String info() {
        return "Human " + nameSurname;
    }

    public String getNameSurname() {
        return nameSurname;
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
        return "Human{" +
                "nameSurname='" + nameSurname + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                '}';
    }
}
